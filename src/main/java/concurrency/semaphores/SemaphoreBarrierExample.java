package concurrency.semaphores;


import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

class Barrier {

    private final int totalThreads;
    private final AtomicInteger count = new AtomicInteger(0);
    private final Semaphore barrier = new Semaphore(0);

    public Barrier(int totalThreads) {
        this.totalThreads = totalThreads;
    }

    public void await(String threadName) throws InterruptedException {
        int arrivalIndex = count.incrementAndGet();
        System.out.println(threadName + " reached barrier (" + arrivalIndex + "/" + totalThreads + ")");

        if (arrivalIndex == totalThreads) {

            System.out.println("All threads reached barrier, releasing...");
            barrier.release(totalThreads - 1);

        } else {
            barrier.acquire();
        }

        // after barrier
        System.out.println(threadName + " passed the barrier.");
    }
}

public class SemaphoreBarrierExample {
    public static void main(String[] args) {
        int THREADS = 5;
        Barrier barrier = new Barrier(THREADS);

        Runnable task = () -> {
            try {
                Thread.sleep((int)(Math.random() * 1000));
                barrier.await(Thread.currentThread().getName());

                System.out.println(Thread.currentThread().getName() + " doing post-barrier work.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        for (int i = 1; i <= THREADS; i++) {
            new Thread(task, "Thread-" + i).start();
        }
    }
}

