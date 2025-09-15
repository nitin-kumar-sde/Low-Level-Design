package concurrency.wait_notify;


import java.util.LinkedList;
import java.util.Queue;

class SharedResource {

    private final Queue<Integer> queue = new LinkedList<>();
    private final int CAPACITY = 5;

    // Producer adds items
    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == CAPACITY) {
            System.out.println("Queue full, producer waiting...");
            wait();
        }
        queue.offer(value);
        System.out.println("Produced: " + value);
        notifyAll();
    }

    // Consumer removes items
    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            System.out.println("Queue empty, consumer waiting...");
            wait();
        }
        int value = queue.poll();
        System.out.println("Consumed: " + value);
        notifyAll();
        return value;
    }
}

public class WaitAndNotifyExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // Producer Thread
        Runnable producerTask = () -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    resource.produce(i);
                    Thread.sleep(200); // simulate time to produce
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        // Consumer Thread
        Runnable consumerTask = () -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    resource.consume();
                    Thread.sleep(300); // simulate time to consume
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        // Run multiple consumers to show notifyAll in action
        Thread producer = new Thread(producerTask, "Producer");
        Thread consumer1 = new Thread(consumerTask, "Consumer-1");
        Thread consumer2 = new Thread(consumerTask, "Consumer-2");

        producer.start();
        consumer1.start();
        consumer2.start();
    }
}

