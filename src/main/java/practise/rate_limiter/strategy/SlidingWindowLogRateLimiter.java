package practise.rate_limiter.strategy;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;

public class SlidingWindowLogRateLimiter implements RateLimiter {

    private final int maxRequests;               // Allowed requests per window
    private final long windowSizeMillis;         // Window duration
    private final ConcurrentLinkedDeque<Long> globalLog;  // Global log of timestamps
    private final ConcurrentHashMap<String, ConcurrentLinkedDeque<Long>> userLogs;

    public SlidingWindowLogRateLimiter(int maxRequests, long windowSizeMillis) {
        this.maxRequests = maxRequests;
        this.windowSizeMillis = windowSizeMillis;
        this.globalLog = new ConcurrentLinkedDeque<>();
        this.userLogs = new ConcurrentHashMap<>();
    }

    private boolean allowRequest(ConcurrentLinkedDeque<Long> log) {
        long now = System.currentTimeMillis();

        // Remove timestamps outside window
        while (!log.isEmpty() && (now - log.peekFirst() >= windowSizeMillis)) {
            log.pollFirst();
        }

        if (log.size() < maxRequests) {
            log.addLast(now);
            return true;
        }
        return false;
    }

    @Override
    public boolean tryAcquire(String rateLimitKey) {
        if (rateLimitKey != null && !rateLimitKey.isEmpty()) {
            ConcurrentLinkedDeque<Long> userLog =
                    userLogs.computeIfAbsent(rateLimitKey, key -> new ConcurrentLinkedDeque<>());
            return allowRequest(userLog);
        }
        return allowRequest(globalLog);
    }
}

