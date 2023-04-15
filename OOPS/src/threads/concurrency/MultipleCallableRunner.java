package threads.concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        List<CallableTask> tasks = Arrays.asList(new CallableTask("Premalatha"), new CallableTask("Sampath"));

        List<Future<String>> welcome = executorService.invokeAll(tasks);

        for(Future<String> result: welcome) {
            System.out.println(result.get());
        }

        executorService.shutdown();
    }
}
