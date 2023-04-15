package threads.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
    private int number;

    public Task(int number) {
        this.number = number;
    }

    public void run() {
        System.out.print("\n Task "+ number + " Started\n");

        for(int i = number*100; i <= number*100 + 99; i++) {
            System.out.print(i+ " ");
        }
        System.out.print("\n Task "+number+" Done\n");
    }
}

public class ExecutorServiceRunner {

    public static void main(String[] args) {
        // allows us to run one thread at a time
        // ExecutorService executorService = Executors.newSingleThreadExecutor();

        ExecutorService executorService = Executors.newFixedThreadPool(4); // 4 threads are active at any point of time

        // executorService.execute(new Task1());
        // executorService.execute(new Thread(new Task2()));

        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));
        executorService.execute(new Task(4));

        // Task 3
//        System.out.println("\nTask 3 started");
//        for(int i = 301; i<= 399; i++) {
//            System.out.print(i+ " ");
//        }
//        System.out.print("\nTask3 done");
//        System.out.print("\nMain done");

        // this is mandatory, otherwise program keeps running
        executorService.shutdown();
    }
}
