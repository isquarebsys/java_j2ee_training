package concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Runnable cannot return a result to the caller
 * 
 * Callable can return a result after completion
 * 		If you submit a Callable object to an Executor, the framework returns an object of type java.util.concurrent.Future. 
 * 
 * 		Future exposes methods allowing a client to monitor the progress of a task being executed by a different thread
 * 
 * 
 * On the Executor you can use the method submit to submit a Callable and to get a future
 * 		To retrieve the result of the future use the get() method
 * @author user
 *
 */

public class CallableFutures {
    private static final int NTHREDS = 10;

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);
        List<Future<Long>> list = new ArrayList<Future<Long>>();
        for (int i = 0; i < 20000; i++) {
            Callable<Long> worker = new CallableCount();
            Future<Long> submit = executor.submit(worker);
            list.add(submit);
        }
        long sum = 0;
        System.out.println(list.size());
        // now retrieve the result
        for (Future<Long> future : list) {
            try {
                sum += future.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        System.out.println(sum);
        executor.shutdown();
    }
    
}