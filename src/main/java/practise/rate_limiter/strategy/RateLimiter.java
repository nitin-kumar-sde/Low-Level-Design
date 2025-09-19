package practise.rate_limiter.strategy;

/**
 * Contract for different Rate Limiter implementations.
 * A Rate Limiter controls how many requests are allowed
 * in a given time frame.
 */
public interface RateLimiter {

    /**
     * Try to acquire permission for a request.
     *
     * @return true if the request is allowed, false if blocked
     */
    boolean tryAcquire(String rateLimitKey);
}