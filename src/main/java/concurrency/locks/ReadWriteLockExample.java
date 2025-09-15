package concurrency.locks;


import java.util.concurrent.locks.ReentrantReadWriteLock;

class SharedData {

    private final ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
    private String message = "Initial";

    public void write(String msg, String threadName) {
        rwLock.writeLock().lock();
        try {
            System.out.println(threadName + " writing: " + msg);
            Thread.sleep(200);
            message = msg;
            System.out.println(threadName + " finished writing: " + msg);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            rwLock.writeLock().unlock();
        }
    }

    public void read(String threadName) {
        rwLock.readLock().lock();
        try {
            System.out.println(threadName + " reading: " + message);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            rwLock.readLock().unlock();
        }
    }
}

public class ReadWriteLockExample {
    public static void main(String[] args) {
        SharedData data = new SharedData();

        Runnable readerTask = () -> {
            for (int i = 0; i < 3; i++) {
                data.read(Thread.currentThread().getName());
            }
        };

        Runnable writerTask = () -> {
            for (int i = 0; i < 2; i++) {
                data.write("Message-" + i, Thread.currentThread().getName());
            }
        };

        Thread writer = new Thread(writerTask, "Writer");
        Thread reader1 = new Thread(readerTask, "Reader-1");
        Thread reader2 = new Thread(readerTask, "Reader-2");

        reader1.start();
        reader2.start();
        writer.start();
    }
}
