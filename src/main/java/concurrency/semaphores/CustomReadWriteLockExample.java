package concurrency.semaphores;

import java.util.concurrent.Semaphore;

class MyReadWriteLock {
    private final Semaphore resource = new Semaphore(1);   // controls access to resource
    private final Semaphore readLock = new Semaphore(1);   // protects reader count
    private int readerCount = 0;

    public void lockRead(String threadName) throws InterruptedException {
        readLock.acquire();
        readerCount++;
        if (readerCount == 1) {
            resource.acquire();
        }
        System.out.println(threadName + " acquired READ lock. Readers = " + readerCount);
        readLock.release();
    }

    public void unlockRead(String threadName) throws InterruptedException {
        readLock.acquire();
        readerCount--;
        System.out.println(threadName + " released READ lock. Readers = " + readerCount);
        if (readerCount == 0) {
            resource.release();
        }
        readLock.release();
    }

    public void lockWrite(String threadName) throws InterruptedException {
        resource.acquire();
        readLock.acquire();
        System.out.println(threadName + " acquired WRITE lock.");
    }

    public void unlockWrite(String threadName) {
        System.out.println(threadName + " released WRITE lock.");
        readLock.release();
        resource.release();
    }
}

public class CustomReadWriteLockExample {
    public static void main(String[] args) {
        MyReadWriteLock lock = new MyReadWriteLock();
        StringBuilder sharedData = new StringBuilder("Initial");

        Runnable readerTask = () -> {
            try {
                lock.lockRead(Thread.currentThread().getName());
                Thread.sleep(500); // simulate read
                System.out.println(Thread.currentThread().getName() + " read: " + sharedData);
                lock.unlockRead(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        Runnable writerTask = () -> {
            try {
                lock.lockWrite(Thread.currentThread().getName());
                Thread.sleep(800); // simulate write
                sharedData.append(" | updated by " + Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getName() + " wrote data.");
                lock.unlockWrite(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        Thread r1 = new Thread(readerTask, "Reader-1");
        Thread r2 = new Thread(readerTask, "Reader-2");
        Thread w1 = new Thread(writerTask, "Writer-1");
        Thread r3 = new Thread(readerTask, "Reader-3");

        r1.start();
        r2.start();
        w1.start();
        r3.start();
    }
}
