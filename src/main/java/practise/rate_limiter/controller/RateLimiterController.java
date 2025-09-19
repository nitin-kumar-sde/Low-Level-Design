package practise.rate_limiter.controller;


import practise.rate_limiter.factory.RateLimiterFactory;
import practise.rate_limiter.model.RateLimiterType;
import practise.rate_limiter.strategy.RateLimiter;

import java.util.Map;

public class RateLimiterController {

    private final RateLimiter rateLimiter;

    public RateLimiterController(RateLimiterType type, Map<String, Object> config) {
        this.rateLimiter = RateLimiterFactory.createLimiter(type, config);
    }

    /**
     * Handle a request from a given user.
     * @param userId identifier for the user (or null for global).
     * @return true if allowed, false if blocked.
     */
    public boolean handleRequest(String userId) {
        return rateLimiter.tryAcquire(userId);
    }
}
