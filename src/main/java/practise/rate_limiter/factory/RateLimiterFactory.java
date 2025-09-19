package practise.rate_limiter.factory;

import practise.rate_limiter.model.RateLimiterType;
import practise.rate_limiter.strategy.FixedWindowRateLimiter;
import practise.rate_limiter.strategy.RateLimiter;
import practise.rate_limiter.strategy.SlidingWindowLogRateLimiter;
import practise.rate_limiter.strategy.TokenBucketRateLimiter;

import java.util.Map;

public class RateLimiterFactory {
   // config mimics reading configs like env variables
    public static RateLimiter createLimiter(RateLimiterType type,
                                            Map<String, Object> config) {
        switch (type) {
            case TOKEN_BUCKET:
                int capacity = (int) config.getOrDefault("capacity", 10);
                int refreshRate = (int) config.getOrDefault("refreshRate", 5);
                return new TokenBucketRateLimiter(capacity, refreshRate);

            case FIXED_WINDOW:
                int maxRequests = (int) config.getOrDefault("maxRequests", 10);
                long windowMillis = (long) config.getOrDefault("windowMillis", 1000L);
                return new FixedWindowRateLimiter(maxRequests, windowMillis);

            case SLIDING_WINDOW_lOG:
                int maxReqs = (int) config.getOrDefault("maxRequests", 10);
                long windowSize = (long) config.getOrDefault("windowMillis", 1000L);
                return new SlidingWindowLogRateLimiter(maxReqs, windowSize);

            default:
                throw new IllegalArgumentException("Unsupported rate limiter type: " + type);
        }
    }
}

