package concurrency.locks;

import java.util.concurrent.locks.ReentrantLock;

class SharedResource {

    private final ReentrantLock lock = new ReentrantLock();
    private int counter = 0;

    public void increment(String threadName) {
        lock.lock();
        try {
            counter++;
            System.out.println(threadName + " incremented counter to: " + counter);
            Thread.sleep(100); // simulate some work
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }
}

public class ReentrantLockExample {

    public static void main(String[] args) {
        final SharedResource resource = new SharedResource();
        Runnable task = () -> {
            for (int i = 0; i < 3; i++) {
                resource.increment(Thread.currentThread().getName());
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }
}
