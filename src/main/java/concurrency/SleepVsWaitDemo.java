package concurrency;

public class SleepVsWaitDemo {

    private static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {

        Thread sleeper = new Thread(() -> {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " acquired lock, going to sleep for 3s...");
                try {
                    Thread.sleep(3000); // does NOT release lock
                    System.out.println(Thread.currentThread().getName() + " woke up and still holds the lock!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "SleeperThread");


        Thread waiter = new Thread(() -> {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " acquired lock, going to wait...");
                try {
                    lock.wait();
                    System.out.println(Thread.currentThread().getName() + " resumed after being notified!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "WaiterThread");

        // Notifier thread for waiter
        Thread notifier = new Thread(() -> {
            try {
                Thread.sleep(2000); // wait 2s before notifying
                synchronized (lock) {
                    System.out.println(Thread.currentThread().getName() + " notifying waiter...");
                    lock.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "NotifierThread");

        // Start sleeper
        sleeper.start();
        Thread.sleep(100);

        waiter.start();
        notifier.start();

        sleeper.join();
        waiter.join();
        notifier.join();

        System.out.println("Main thread finished.");
    }
}
