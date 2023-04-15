package threads.concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleCallableAnyRunner {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        List<CallableTask> tasks = Arrays.asList(new CallableTask("Premalatha"), new CallableTask("Sampath"));

        String welcome = executorService.invokeAny(tasks); // only one task is executed at any point of time
        System.out.println(welcome);

        executorService.shutdown();
    }
}
