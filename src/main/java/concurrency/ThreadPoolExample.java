package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample {

    public static void main(String[] args) throws InterruptedException {


        ExecutorService fixedPool = Executors.newFixedThreadPool(3);
        System.out.println("\n--- Fixed Thread Pool ---");
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            fixedPool.submit(() -> {
                System.out.println("FixedPool: Task " + taskId + " running on " + Thread.currentThread().getName());
                try { Thread.sleep(1000); } catch (InterruptedException ignored) {}
            });
        }
        fixedPool.shutdown();

        ExecutorService singlePool = Executors.newSingleThreadExecutor();
        System.out.println("\n--- Single Thread Executor ---");
        for (int i = 1; i <= 3; i++) {
            final int taskId = i;
            singlePool.submit(() -> {
                System.out.println("SinglePool: Task " + taskId + " running on " + Thread.currentThread().getName());
                try { Thread.sleep(1000); } catch (InterruptedException ignored) {}
            });
        }
        singlePool.shutdown();

        ExecutorService cachedPool = Executors.newCachedThreadPool();
        System.out.println("\n--- Cached Thread Pool ---");
        for (int i = 1; i <= 6; i++) {
            final int taskId = i;
            cachedPool.submit(() -> {
                System.out.println("CachedPool: Task " + taskId + " running on " + Thread.currentThread().getName());
                try { Thread.sleep(1000); } catch (InterruptedException ignored) {}
            });
        }
        cachedPool.shutdown();

        ScheduledExecutorService scheduledPool = Executors.newScheduledThreadPool(2);
        System.out.println("\n--- Scheduled Thread Pool ---");

        // Run once after 2 seconds
        scheduledPool.schedule(() -> {
            System.out.println("ScheduledPool: Delayed task executed by " + Thread.currentThread().getName());
        }, 2, TimeUnit.SECONDS);

        // Run repeatedly every 3 seconds (starting after 1 second)
        scheduledPool.scheduleAtFixedRate(() -> {
            System.out.println("ScheduledPool: Periodic task running on " + Thread.currentThread().getName());
        }, 1, 3, TimeUnit.SECONDS);

        // Let scheduled tasks run for a while
        Thread.sleep(10000);
        scheduledPool.shutdown();
    }
}
