package concurrency.problems;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

public class FizzBuzz {
    private final int n;
    private int i = 1;

    private final Semaphore numberSem = new Semaphore(1);
    private final Semaphore fizzSem = new Semaphore(0);
    private final Semaphore buzzSem = new Semaphore(0);
    private final Semaphore fizzbuzzSem = new Semaphore(0);

    public FizzBuzz(int n) {
        this.n = n;
    }

    public void fizz(Runnable printFizz) throws InterruptedException {
        while (true) {
            fizzSem.acquire();
            if (i > n) { releaseAll(); return; }
            printFizz.run();
            i++;
            releaseNext();
        }
    }

    public void buzz(Runnable printBuzz) throws InterruptedException {
        while (true) {
            buzzSem.acquire();
            if (i > n) { releaseAll(); return; }
            printBuzz.run();
            i++;
            releaseNext();
        }
    }

    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while (true) {
            fizzbuzzSem.acquire();
            if (i > n) { releaseAll(); return; }
            printFizzBuzz.run();
            i++;
            releaseNext();
        }
    }

    public void number(IntConsumer printNumber) throws InterruptedException {
        while (true) {
            numberSem.acquire();
            if (i > n) { releaseAll(); return; }
            printNumber.accept(i);
            i++;
            releaseNext();
        }
    }

    private void releaseNext() {
        if (i > n) {
            releaseAll();
            return;
        }
        if (i % 15 == 0) fizzbuzzSem.release();
        else if (i % 3 == 0) fizzSem.release();
        else if (i % 5 == 0) buzzSem.release();
        else numberSem.release();
    }

    private void releaseAll() {
        fizzSem.release();
        buzzSem.release();
        fizzbuzzSem.release();
        numberSem.release();
    }

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz(20);

        Thread t1 = new Thread(() -> { try { fb.fizz(() -> System.out.print("fizz ")); } catch (InterruptedException ignored) {} });
        Thread t2 = new Thread(() -> { try { fb.buzz(() -> System.out.print("buzz ")); } catch (InterruptedException ignored) {} });
        Thread t3 = new Thread(() -> { try { fb.fizzbuzz(() -> System.out.print("fizzbuzz ")); } catch (InterruptedException ignored) {} });
        Thread t4 = new Thread(() -> { try { fb.number(x -> System.out.print(x + " ")); } catch (InterruptedException ignored) {} });

        t1.start(); t2.start(); t3.start(); t4.start();
    }
}

