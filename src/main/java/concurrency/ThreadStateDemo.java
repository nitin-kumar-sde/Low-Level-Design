package concurrency;

public class ThreadStateDemo {

    private static final Object lock = new Object();

    public static void main(String[] args) throws Exception {
        // NEW state
        Thread t1 = new Thread(() -> {
            System.out.println("t1 is running...");
        }, "t1");
        System.out.println("t1 state after creation: " + t1.getState());

        t1.start();
        System.out.println("t1 state after start: " + t1.getState());

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "t2");

        t2.start();
        Thread.sleep(100);
        System.out.println("t2 state while sleeping: " + t2.getState());

        Thread t3 = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "t3");

        t3.start();
        Thread.sleep(100);
        System.out.println("t3 state while waiting: " + t3.getState()); // WAITING

        // BLOCKED state
        Thread t4 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("t4 acquired lock");
            }
        }, "t4");

        synchronized (lock) {
            t4.start();
            Thread.sleep(100);
            System.out.println("t4 state while blocked: " + t4.getState());
        }

        // TERMINATED state
        t1.join(); // wait for t1 to finish
        System.out.println("t1 state after termination: " + t1.getState());
    }
}
