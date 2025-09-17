package concurrency.problems;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

class ZeroEvenOdd {

    private final int n;
    private final Semaphore zeroSem = new Semaphore(1);
    private final Semaphore oddSem = new Semaphore(0);
    private final Semaphore evenSem = new Semaphore(0);

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            zeroSem.acquire();
            printNumber.accept(0);
            if (i % 2 == 0) {
                evenSem.release();
            } else {
                oddSem.release();
            }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for (int i = 2; i <= n; i += 2) {
            evenSem.acquire();
            printNumber.accept(i);
            zeroSem.release();
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i += 2) {
            oddSem.acquire();
            printNumber.accept(i);
            zeroSem.release();
        }
    }

    public static void main(String[] args) {
        ZeroEvenOdd zeo = new ZeroEvenOdd(5);

        IntConsumer printNumber = System.out::print;

        Thread t1 = new Thread(() -> {
            try {
                zeo.zero(printNumber);
            } catch (InterruptedException e) {}
        });

        Thread t2 = new Thread(() -> {
            try {
                zeo.even(printNumber);
            } catch (InterruptedException e) {}
        });

        Thread t3 = new Thread(() -> {
            try {
                zeo.odd(printNumber);
            } catch (InterruptedException e) {}
        });

        t1.start();
        t2.start();
        t3.start();
    }

}