package practise.rate_limiter.strategy;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

import static java.util.concurrent.Executors.newSingleThreadScheduledExecutor;

public class TokenBucketRateLimiter implements RateLimiter {

    private final int bucketCapacity;
    private final AtomicInteger refreshRate; // tokens per second
    private final Bucket globalBucket;
    private final ConcurrentHashMap<String, Bucket> userBuckets;
    private final ScheduledExecutorService scheduler;
    private final long refillIntervalMillis; // 1 sec

    public TokenBucketRateLimiter(int bucketCapacity, int refreshRate) {
        this.bucketCapacity = bucketCapacity;
        this.refreshRate = new AtomicInteger(refreshRate);
        this.globalBucket = new Bucket(bucketCapacity);
        this.userBuckets = new ConcurrentHashMap<>();
        this.scheduler = newSingleThreadScheduledExecutor();
        // configurable
        this.refillIntervalMillis  = 1000;
        startRefillTask();
    }

    private class Bucket {
        private int tokens;

        private final ReentrantLock lock = new ReentrantLock();

        Bucket(int initialTokens) {
            this.tokens = initialTokens;
        }

        boolean tryConsume() {
            lock.lock();
            try {
                if (tokens > 0) {
                    tokens--;
                    return true;
                }
                return false;
            } finally {
                lock.unlock();
            }
        }
        void refill(int rate) {
            lock.lock();
            try {
                tokens = Math.min(bucketCapacity, tokens + rate);
            } finally {
                lock.unlock();
            }
        }

    }

    private void startRefillTask() {
        scheduler.scheduleAtFixedRate(() -> {
            int rate = refreshRate.get();
            globalBucket.refill(rate);
            userBuckets.values().forEach(bucket -> bucket.refill(rate));
        }, 0, refillIntervalMillis, TimeUnit.MILLISECONDS);
    }

    @Override
    public boolean tryAcquire(String rateLimitKey) {
        if (rateLimitKey != null && !rateLimitKey.isEmpty()) {
            Bucket bucket = userBuckets.computeIfAbsent(
                    rateLimitKey, key -> new Bucket(bucketCapacity));
            return bucket.tryConsume();
        }
        return globalBucket.tryConsume();
    }

}
