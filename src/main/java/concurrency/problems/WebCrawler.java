package concurrency.problems;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.concurrent.*;

public class WebCrawler {

    public List<String> crawl(String startUrl, HtmlParser htmlParser) {
        // Extract host name to restrict crawling to same host
        final String host;
        try {
            URL u = new URL(startUrl);
            host = u.getHost();
        } catch (MalformedURLException e) {
            // If startUrl is invalid, return empty (or throw; here we return empty)
            return Collections.emptyList();
        }

        // Thread-safe visited set
        Set<String> visited = ConcurrentHashMap.newKeySet();
        // Use a Phaser to wait until all dynamically spawned tasks finish
        Phaser phaser = new Phaser(1); // register main thread as a party

        // Thread pool - size depends on expected parallelism; 10 is a reasonable default
        int poolSize = Math.min(50, Runtime.getRuntime().availableProcessors() * 2);
        ExecutorService pool = Executors.newFixedThreadPool(poolSize);

        // Try to add the startUrl; if added, register a new task
        if (visited.add(startUrl)) {
            phaser.register(); // for the submitted start task
            pool.submit(new CrawlTask(startUrl, host, htmlParser, visited, phaser, pool));
        }

        // Deregister the main thread and wait for all tasks to complete
        phaser.arriveAndAwaitAdvance();

        // Shutdown executor cleanly
        pool.shutdown();
        // optionally await termination for a short time
        try {
            if (!pool.awaitTermination(5, TimeUnit.SECONDS)) {
                pool.shutdownNow();
            }
        } catch (InterruptedException ignored) {
            pool.shutdownNow();
            Thread.currentThread().interrupt();
        }

        return new ArrayList<>(visited);
    }

    private static class CrawlTask implements Runnable {
        private final String url;
        private final String host;
        private final HtmlParser parser;
        private final Set<String> visited;
        private final Phaser phaser;
        private final ExecutorService pool;

        CrawlTask(String url,
                  String host,
                  HtmlParser parser,
                  Set<String> visited,
                  Phaser phaser,
                  ExecutorService pool) {
            this.url = url;
            this.host = host;
            this.parser = parser;
            this.visited = visited;
            this.phaser = phaser;
            this.pool = pool;
        }

        @Override
        public void run() {
            try {
                // Fetch URLs from parser (could throw runtime exceptions)
                List<String> urls = parser.getUrls(url);
                for (String next : urls) {
                    // Only consider same-host URLs
                    if (!isSameHost(next, host)) continue;

                    // If we successfully add to visited, spawn a new task for it
                    if (visited.add(next)) {
                        phaser.register(); // increase party count for the new task
                        pool.submit(new CrawlTask(next, host, parser, visited, phaser, pool));
                    }
                }
            } catch (Exception e) {
                // Optionally log
                // System.err.println("Error crawling " + url + ": " + e);
            } finally {
                // Arrive and deregister this task's party
                phaser.arriveAndDeregister();
            }
        }

        private static boolean isSameHost(String urlStr, String host) {
            try {
                URL u = new URL(urlStr);
                return host.equals(u.getHost());
            } catch (MalformedURLException e) {
                return false;
            }
        }
    }

    // HtmlParser interface (LeetCode provides this in the problem)
    public interface HtmlParser {
        // Return all urls from a webpage of given url
        List<String> getUrls(String url);
    }


    // ---------- Simple test harness (local) ----------
    public static void main(String[] args) {
        // create a fake parser using a map of url -> linked urls
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("http://news.yahoo.com", Arrays.asList(
                "http://news.yahoo.com/news",
                "http://news.yahoo.com/us",
                "http://sports.yahoo.com",
                "http://news.google.com" // different host - should be ignored
        ));
        graph.put("http://news.yahoo.com/news", Arrays.asList("http://news.yahoo.com", "http://news.yahoo.com/world"));
        graph.put("http://news.yahoo.com/us", Arrays.asList("http://news.yahoo.com", "http://news.yahoo.com/weather"));
        graph.put("http://news.yahoo.com/world", Collections.emptyList());
        graph.put("http://news.yahoo.com/weather", Collections.emptyList());
        graph.put("http://sports.yahoo.com", Collections.emptyList());
        graph.put("http://news.google.com", Arrays.asList("http://news.google.com/intl"));

        HtmlParser fakeParser = url -> graph.getOrDefault(url, Collections.emptyList());

        WebCrawler crawler = new WebCrawler();
        List<String> visited = crawler.crawl("http://news.yahoo.com", fakeParser);
        System.out.println("Visited: ");
        visited.stream().sorted().forEach(System.out::println);
    }
}

