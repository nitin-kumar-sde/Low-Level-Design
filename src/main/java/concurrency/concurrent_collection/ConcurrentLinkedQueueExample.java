package concurrency.concurrent_collection;


import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueExample {

    public static void main(String[] args) throws InterruptedException {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

        Runnable producer = () -> {
            for (int i = 1; i <= 5; i++) {
                String item = Thread.currentThread().getName() + "-Item" + i;
                queue.offer(item);
                System.out.println(Thread.currentThread().getName() + " offered " + item);
                try { Thread.sleep(100); } catch (InterruptedException e) {}
            }
        };

        Thread p1 = new Thread(producer, "Producer-1");
        Thread p2 = new Thread(producer, "Producer-2");

        p1.start(); p2.start();
        p1.join(); p2.join();

        System.out.println("Queue after producers: " + queue);

        Runnable consumer = () -> {
            String item;
            while ((item = queue.poll()) != null) {
                System.out.println(Thread.currentThread().getName() + " consumed " + item);
                try { Thread.sleep(150); } catch (InterruptedException e) {}
            }
        };

        Thread c1 = new Thread(consumer, "Consumer-1");
        Thread c2 = new Thread(consumer, "Consumer-2");

        c1.start(); c2.start();
        c1.join(); c2.join();

        System.out.println("Queue after consumers: " + queue);

        queue.offer("X");
        queue.offer("Y");
        queue.offer("Z");

        System.out.println("Iterating queue snapshot:");
        for (String s : queue) {
            System.out.println("Saw: " + s);
            if (s.equals("Y")) {
                queue.offer("New-Item");
            }
        }
        System.out.println("Queue final: " + queue);
    }
}
