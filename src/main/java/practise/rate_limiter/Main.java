package practise.rate_limiter;


import practise.rate_limiter.controller.RateLimiterController;
import practise.rate_limiter.model.RateLimiterType;

import java.util.Map;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // Create controllers for different strategies
        RateLimiterController tokenBucketController = new RateLimiterController(
                RateLimiterType.TOKEN_BUCKET,
                Map.of("capacity", 5, "refreshRate", 2)
        );

        RateLimiterController fixedWindowController = new RateLimiterController(
                RateLimiterType.FIXED_WINDOW,
                Map.of("maxRequests", 3, "windowMillis", 2000L)
        );

        RateLimiterController slidingWindowController = new RateLimiterController(
                RateLimiterType.SLIDING_WINDOW_lOG,
                Map.of("maxRequests", 4, "windowMillis", 3000L)
        );

        String user = "user123";

        System.out.println("=== Token Bucket Controller Test ===");
        for (int i = 0; i < 10; i++) {
            System.out.println("Request " + i + ": " + tokenBucketController.handleRequest(user));
            Thread.sleep(300);
        }

        System.out.println("\n=== Fixed Window Controller Test ===");
        for (int i = 0; i < 6; i++) {
            System.out.println("Request " + i + ": " + fixedWindowController.handleRequest(user));
            Thread.sleep(400);
        }

        System.out.println("\n=== Sliding Window Controller Test ===");
        for (int i = 0; i < 8; i++) {
            System.out.println("Request " + i + ": " + slidingWindowController.handleRequest(user));
            Thread.sleep(500);
        }

        System.out.println("\n✅ Controller Test Completed");
    }
}
