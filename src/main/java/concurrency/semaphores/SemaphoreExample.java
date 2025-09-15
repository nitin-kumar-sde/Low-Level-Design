package concurrency.semaphores;

import java.util.concurrent.Semaphore;

class Database {
    private final Semaphore semaphore;

    public Database(int connections) {
        semaphore = new Semaphore(connections); // pool size
    }

    public void accessDatabase(String threadName) {
        try {
            System.out.println(threadName + " trying to acquire connection...");
            semaphore.acquire(); // acquire permit
            System.out.println(threadName + " acquired connection!");
            Thread.sleep(1000); // simulate query execution
            System.out.println(threadName + " releasing connection...");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            semaphore.release(); // release permit
        }
    }
}

public class SemaphoreExample {
    public static void main(String[] args) {
        Database db = new Database(2); // only 2 connections allowed

        Runnable task = () -> db.accessDatabase(Thread.currentThread().getName());

        for (int i = 1; i <= 5; i++) {
            new Thread(task, "Thread-" + i).start();
        }
    }
}
