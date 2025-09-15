package concurrency.concurrent_collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {

    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> cowList = new CopyOnWriteArrayList<>();

        cowList.add("A");
        cowList.add("B");
        cowList.add("C");
        System.out.println("Initial List: " + cowList);

        Iterator<String> it = cowList.iterator();
        new Thread(() -> {
            try {
                Thread.sleep(500);
                cowList.add("D");
                System.out.println("Added D concurrently");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        System.out.println("Iterating snapshot:");
        while (it.hasNext()) {
            Thread.sleep(200);
            System.out.println("Iterated: " + it.next());
        }
        System.out.println("List after iteration: " + cowList);

        Runnable writerTask = () -> {
            for (int i = 0; i < 3; i++) {
                cowList.add("X" + i);
                System.out.println(Thread.currentThread().getName() + " added X" + i);
            }
        };

        Thread t1 = new Thread(writerTask, "Writer-1");
        Thread t2 = new Thread(writerTask, "Writer-2");

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final List (after writers): " + cowList);

        cowList.forEach(e -> System.out.println("forEach sees: " + e));
    }
}

