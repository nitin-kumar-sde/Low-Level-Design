package concurrency;

// Not recommended way to create threads as it limits the scope of inheritance.

import java.util.concurrent.*;

class Task extends Thread {

    @Override
    public void run() {
       for(int i=0;i<10;i++) {
           System.out.println("Currently running thread with i -" + i);
       }
    }
}

class TaskRunnable implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println("Currently running thread with i -" + i);
        }
    }
}

// Enables returning values from threads and throwing checked exceptions.
class CallableTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "Simple Return";
    }
}
public class ThreadExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Thread example started ...");
        Task task = new Task();
        task.start();
        TaskRunnable task2 = new TaskRunnable();

        Thread thread = new Thread(task2);
        thread.start();
        System.out.println("Thread example ended ...");

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<String> task3 = new CallableTask();
        Future<String> result = executor.submit(task3);
        String message = result.get();
        System.out.println(message);
    }
}
