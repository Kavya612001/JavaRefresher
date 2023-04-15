package threads.concurrency;

// extends Thread
// implements Runnable

class Task1 extends Thread {
    public void run() {
        System.out.println("\n Task 1 started");
        for(int i = 101; i<= 199; i++) {
            System.out.print(i+ " ");
        }
        System.out.println("\nTask1 done");
    }
}

class Task2 implements Runnable {

    @Override
    public void run() {
        System.out.println("\nTask 2 started");
        for(int i = 201; i<= 299; i++) {
            System.out.print(i+ " ");
        }
        System.out.println("\nTask2 done");
    }
}

public class ThreadBasicRunner {

    public static void main(String[] args) throws InterruptedException {
        // Task 1
        Task1 task1 = new Task1();
        task1.start(); //note, start should be called (Task1 runs in parallel with task2)
        task1.setPriority(1);
        // Task 2
        Task2 task2 = new Task2();
        Thread Task2thread = new Thread(task2);
        Task2thread.start();
        Task2thread.setPriority(10);

        // wait for task1 to complete
        // task3 executes only when task1 and task 2 is done
        task1.join();
        Task2thread.join();

        // Task 3
        System.out.println("\nTask 3 started");
        for(int i = 201; i<= 299; i++) {
            System.out.print(i+ " ");
        }
        System.out.print("\nTask3 done");
        System.out.print("\nMain done");
    }
}
