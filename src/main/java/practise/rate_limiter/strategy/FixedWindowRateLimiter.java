package practise.rate_limiter.strategy;


import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class FixedWindowRateLimiter implements RateLimiter {

    private final int maxRequests;              // Allowed requests per window
    private final long windowSizeMillis;        // Window size (e.g. 1000 ms = 1 sec)

    private final Window globalWindow;          // Global rate limit
    private final ConcurrentHashMap<String, Window> userWindows; // Per-user rate limit

    public FixedWindowRateLimiter(int maxRequests, long windowSizeMillis) {
        this.maxRequests = maxRequests;
        this.windowSizeMillis = windowSizeMillis;
        this.globalWindow = new Window();
        this.userWindows = new ConcurrentHashMap<>();
    }

    private class Window {
        private long windowStart;
        private final AtomicInteger counter = new AtomicInteger(0);

        synchronized boolean tryConsume() {
            long now = System.currentTimeMillis();
            long currentWindow = now / windowSizeMillis;

            // If we moved into a new window, reset
            if (currentWindow != windowStart) {
                windowStart = currentWindow;
                counter.set(0);
            }

            if (counter.incrementAndGet() <= maxRequests) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public boolean tryAcquire(final String rateLimitKey) {
        if (rateLimitKey != null && !rateLimitKey.isEmpty()) {
            Window window = userWindows.computeIfAbsent(rateLimitKey, key -> new Window());
            return window.tryConsume();
        }
        return globalWindow.tryConsume();
    }
}

