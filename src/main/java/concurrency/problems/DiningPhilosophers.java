package concurrency.problems;

import java.util.concurrent.Semaphore;

public class DiningPhilosophers {

    private final Semaphore[] forks = new Semaphore[5];
    private final Semaphore waiter = new Semaphore(4); // allow max 4 philosophers at a time

    public DiningPhilosophers() {
        for (int i = 0; i < 5; i++) {
            forks[i] = new Semaphore(1); // each fork available initially
        }
    }

    public void wantsToEat(
            int philosopher,
            Runnable pickLeftFork,
            Runnable pickRightFork,
            Runnable eat,
            Runnable putLeftFork,
            Runnable putRightFork) throws InterruptedException {

        int left = philosopher;
        int right = (philosopher + 1) % 5;

        // Ensure only 4 philosophers can sit simultaneously
        waiter.acquire();

        // Pick up forks (left first, then right)
        forks[left].acquire();
        pickLeftFork.run();

        forks[right].acquire();
        pickRightFork.run();

        // Eat
        eat.run();

        putRightFork.run();
        forks[right].release();

        putLeftFork.run();
        forks[left].release();

        waiter.release();
    }

    public static void main(String[] args) {
        DiningPhilosophers dp = new DiningPhilosophers();

        Runnable pickLeftFork = () -> System.out.print(" pickLeftFork ");
        Runnable pickRightFork = () -> System.out.print(" pickRightFork ");
        Runnable eat = () -> System.out.print(" EAT ");
        Runnable putLeftFork = () -> System.out.print(" putLeftFork ");
        Runnable putRightFork = () -> System.out.print(" putRightFork ");

        // Create 5 philosopher threads
        for (int i = 0; i < 5; i++) {
            int id = i;
            new Thread(() -> {
                try {
                    for (int j = 0; j < 3; j++) { // each philosopher eats 3 times
                        dp.wantsToEat(id, pickLeftFork, pickRightFork, eat, putLeftFork, putRightFork);
                        Thread.sleep(200); // think for a while
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }, "Philosopher-" + id).start();
        }
    }
}
