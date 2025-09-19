package practise.url_shortener;


import practise.url_shortener.service.UrlShortenerService;

public class UrlShortenerApp {
    public static void main(String[] args) {
        UrlShortenerService service = new UrlShortenerService();

        String longUrl = "https://www.confluent.io/kafka";
        String shortUrl = service.shortenUrl(longUrl);
        System.out.println("Shortened: " + shortUrl);

        String expandedUrl = service.expandUrl(shortUrl);
        System.out.println("Expanded: " + expandedUrl);
    }
}
