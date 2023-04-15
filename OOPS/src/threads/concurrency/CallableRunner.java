package threads.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// inorder to make the thread return something
class CallableTask implements Callable<String> {

    private String name;

    public CallableTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello " + name;
    }
}

public class CallableRunner {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        // used to execute a Callable task
        // Future is a promise that we will get a result in a later point of time
        Future<String> welcome = executorService.submit(new CallableTask("Kavya"));
        System.out.println("\n New callable executed");
        String str = welcome.get();
        System.out.println(str);
        System.out.println("Main executed");
    }
}
