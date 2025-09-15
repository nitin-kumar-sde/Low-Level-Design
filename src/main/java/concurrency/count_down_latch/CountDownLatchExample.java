package concurrency.count_down_latch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {

        int taskCount = 3;
        CountDownLatch latch = new CountDownLatch(taskCount);

        // Worker threads
        for (int i = 1; i <= taskCount; i++) {
            final int workerId = i;
            new Thread(() -> {
                try {
                    System.out.println("Worker " + workerId + " is starting...");
                    Thread.sleep(1000 * workerId); // simulate different workloads
                    System.out.println("Worker " + workerId + " finished.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    latch.countDown();
                }
            }).start();
        }

        System.out.println("Main thread waiting for workers to finish...");
        latch.await();
        System.out.println("All workers finished. Main thread resumes!");
    }
}

