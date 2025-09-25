package practise.payment_gateway.retries;

/**
 * Values should be injected from Configuration files like environment variable.
 */

public class RetryPolicy {

    private final int maxAttempts;
    private final long initialDelayMillis;
    private final double backoffMultiplier;

    public RetryPolicy(int maxAttempts, long initialDelayMillis, double backoffMultiplier) {
        this.maxAttempts = maxAttempts;
        this.initialDelayMillis = initialDelayMillis;
        this.backoffMultiplier = backoffMultiplier;
    }

    public int getMaxAttempts() { return maxAttempts; }
    public long getInitialDelayMillis() { return initialDelayMillis; }
    public double getBackoffMultiplier() { return backoffMultiplier; }
}
