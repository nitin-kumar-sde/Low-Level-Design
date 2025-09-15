package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

class VolatileCounter {
    volatile int count = 0;

    public void increment() {
        count++; // Not atomic, may lose updates
    }

    public int getCount() {
        return count;
    }
}

class SynchronizedCounter {
    private int count = 0;

    public synchronized void increment() {
        count++; // synchronized ensures atomicity
    }

    public synchronized int getCount() {
        return count;
    }
}

class AtomicCounter {
    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet(); // atomic operation
    }

    public int getCount() {
        return count.get();
    }
}

public class CounterComparisonExample {
    public static void main(String[] args) throws InterruptedException {
        final int THREADS = 10;
        final int INCREMENTS = 1000;

        VolatileCounter volatileCounter = new VolatileCounter();
        SynchronizedCounter synchronizedCounter = new SynchronizedCounter();
        AtomicCounter atomicCounter = new AtomicCounter();

        Runnable task = () -> {
            for (int i = 0; i < INCREMENTS; i++) {
                volatileCounter.increment();
                synchronizedCounter.increment();
                atomicCounter.increment();
            }
        };

        Thread[] threads = new Thread[THREADS];
        for (int i = 0; i < THREADS; i++) {
            threads[i] = new Thread(task);
            threads[i].start();
        }

        for (int i = 0; i < THREADS; i++) {
            threads[i].join();
        }

        System.out.println("Expected count = " + (THREADS * INCREMENTS));
        System.out.println("Volatile Counter = " + volatileCounter.getCount());
        System.out.println("Synchronized Counter = " + synchronizedCounter.getCount());
        System.out.println("Atomic Counter = " + atomicCounter.getCount());
    }
}
