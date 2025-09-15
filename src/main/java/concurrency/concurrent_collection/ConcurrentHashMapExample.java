package concurrency.concurrent_collection;

import java.util.concurrent.*;

public class ConcurrentHashMapExample {
    public static void main(String[] args) throws InterruptedException {

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        System.out.println("Initial Map: " + map);

        map.putIfAbsent("B", 20);
        map.replace("A", 1, 10);
        map.merge("C", 5, Integer::sum);
        System.out.println("After atomic ops: " + map);

        Runnable counterTask = () -> {
            for (int i = 0; i < 1000; i++) {
                map.merge("COUNT", 1, Integer::sum);
            }
        };

        Thread t1 = new Thread(counterTask);
        Thread t2 = new Thread(counterTask);
        Thread t3 = new Thread(counterTask);

        t1.start(); t2.start(); t3.start();
        t1.join(); t2.join(); t3.join();

        System.out.println("After concurrent updates: " + map);

        System.out.println("Iterating map:");
        map.forEach((k, v) -> System.out.println(k + " -> " + v));

        System.out.println("Search example: " +
                map.search(2, (k, v) -> v == 2 ? k : null)); // find key with value=2

        System.out.println("Reduce values sum: " +
                map.reduceValues(2, Integer::sum));

        System.out.println("Bulk forEach parallel:");
        map.forEach(2, (k, v) ->
                System.out.println(Thread.currentThread().getName() + " processed " + k + "=" + v)
        );
    }
}

