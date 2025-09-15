package concurrency.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {
    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<Integer> task = () -> {
            System.out.println("Task started by: " + Thread.currentThread().getName());
            Thread.sleep(2000);
            return 42;
        };

        Future<Integer> future = executor.submit(task);

        System.out.println("Is task done? " + future.isDone());

        System.out.println("Waiting for result...");
        Integer result = future.get();  // blocks for ~2 sec
        System.out.println("Task result: " + result);

        // 🔹 Submit another task and cancel it
        Callable<String> cancelTask = () -> {
            Thread.sleep(5000);
            return "Should not complete";
        };
        Future<String> future2 = executor.submit(cancelTask);

        Thread.sleep(1000); // wait a bit
        System.out.println("Cancelling second task...");
        boolean cancelled = future2.cancel(true);
        System.out.println("Was second task cancelled? " + cancelled);

        executor.shutdown();
    }
}
