package concurrency.future;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFutureDeepExample {
    // thread pools
    private static final ExecutorService ioPool = Executors
            .newFixedThreadPool(8);
    private static final ScheduledExecutorService scheduler = Executors
            .newScheduledThreadPool(1);

    // helper: wrap CompletableFuture with timeout (Java 8 safe)
    public static <T> CompletableFuture<T> withTimeout(CompletableFuture<T> future,
                                                       long timeout, TimeUnit unit,
                                                       ScheduledExecutorService scheduler) {
        final CompletableFuture<T> promise = new CompletableFuture<>();
        final ScheduledFuture<?> scheduled = scheduler.schedule(() -> {
            promise.completeExceptionally(new TimeoutException("Timeout after " + timeout + " " + unit));
        }, timeout, unit);

        // when original completes, propagate
        future.whenComplete((res, ex) -> {
            if (!promise.isDone()) {
                if (ex == null) promise.complete(res);
                else promise.completeExceptionally(ex);
            }
            scheduled.cancel(false);
        });
        return promise;
    }

    // simulate IO tasks (sleep + return)
    static CompletableFuture<String> fetchUser(String userId) {
        return CompletableFuture.supplyAsync(() -> {
            sleep(400); // simulate latency
            return "User(" + userId + ")";
        }, ioPool);
    }
    static CompletableFuture<List<String>> fetchOrders(String userId) {
        return CompletableFuture.supplyAsync(() -> {
            sleep(1000); // slower
            return Arrays.asList("order-1", "order-2");
        }, ioPool);
    }
    static CompletableFuture<String> fetchRecommendation(String userId) {
        return CompletableFuture.supplyAsync(() -> {
            sleep(700);
            if (Math.random() < 0.2) throw new RuntimeException("rec error");
            return "recs-for-" + userId;
        }, ioPool);
    }

    public static void main(String[] args) throws Exception {
        String userId = "alice";

        // 1) Start user fetch and orders in parallel
        CompletableFuture<String> userF = fetchUser(userId);
        CompletableFuture<List<String>> ordersF = fetchOrders(userId);

        // 2) Add timeout to orders (using helper). If orders slow, we fallback to empty list
        CompletableFuture<List<String>> timedOrdersF = withTimeout(ordersF, 800, TimeUnit.MILLISECONDS, scheduler)
                .exceptionally(ex -> {
                    System.out.println("orders timed out or failed: " + ex);
                    return Collections.emptyList(); // fallback
                });

        // 3) Combine user + orders
        CompletableFuture<String> profileF = userF.thenCombine(timedOrdersF, (user, orders) ->
                user + " has " + orders.size() + " orders: " + orders
        );

        // 4) Fetch recommendation but handle exceptions and fallback
        CompletableFuture<String> recsF = fetchRecommendation(userId)
                .handle((res, ex) -> {
                    if (ex != null) {
                        System.out.println("recs failed: " + ex);
                        return "default-recs";
                    } else return res;
                });

        // 5) Fan-in: wait for profile + recs
        CompletableFuture<String> finalF = profileF.thenCombine(recsF, (profile, recs) ->
                "FINAL -> " + profile + " | " + recs
        );

        // 6) Also demonstrate anyOf (first responder among two mirrors)
        CompletableFuture<String> mirror1 = CompletableFuture.supplyAsync(() -> { sleep(300); return "m1"; }, ioPool);
        CompletableFuture<String> mirror2 = CompletableFuture.supplyAsync(() -> { sleep(600); return "m2"; }, ioPool);
        CompletableFuture<Object> fastest = CompletableFuture.anyOf(mirror1, mirror2);
        fastest.thenAccept(x -> System.out.println("fastest mirror: " + x));

        // 7) Show allOf and collect results
        CompletableFuture<Void> all = CompletableFuture.allOf(userF, timedOrdersF, recsF);
        CompletableFuture<List<Object>> allResults = all.thenApply(v ->
                Stream.of(userF.join(), timedOrdersF.join(), recsF.join()).collect(Collectors.toList())
        );

        // 8) Observe completion, print the final pipeline result
        finalF.whenComplete((res, ex) -> {
            if (ex == null) System.out.println("Pipeline success: " + res);
            else System.out.println("Pipeline failed: " + ex);
        });

        // blocked here to wait for final result (demo); in real app prefer non-blocking continuation
        System.out.println("Final combined result: " + finalF.get()); // blocks

        System.out.println("All results: " + allResults.get());

        // clean up
        ioPool.shutdown();
        scheduler.shutdown();
    }

    private static void sleep(long ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }
}
