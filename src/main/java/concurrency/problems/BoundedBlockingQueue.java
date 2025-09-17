package concurrency.problems;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class BoundedBlockingQueue {
    private final Queue<Integer> queue = new ConcurrentLinkedQueue<>();
    private final Semaphore slots;   // available capacity
    private final Semaphore items;   // available items

    public BoundedBlockingQueue(int capacity) {
        this.slots = new Semaphore(capacity);
        this.items = new Semaphore(0);
    }

    public void enqueue(int element) throws InterruptedException {
        slots.acquire();       // wait for an empty slot
        queue.offer(element);  // lock-free insert
        items.release();       // signal an available item
    }

    public int dequeue() throws InterruptedException {
        items.acquire();       // wait for an item
        int val = queue.poll(); // lock-free remove
        slots.release();       // free up a slot
        return val;
    }

    public int size() {
        return queue.size();
    }
    public static void main(String[] args) {
        BoundedBlockingQueue bbq = new BoundedBlockingQueue(3);

        Runnable producer = () -> {
            for (int i = 1; i <= 6; i++) {
                try {
                    bbq.enqueue(i);
                    System.out.println("Produced: " + i);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Runnable consumer = () -> {
            for (int i = 1; i <= 6; i++) {
                try {
                    int val = bbq.dequeue();
                    System.out.println("Consumed: " + val);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}

