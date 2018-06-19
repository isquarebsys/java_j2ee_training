package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Thread pools manage a pool of worker threads. 
 * 
 * The thread pools contains a work queue which holds tasks waiting to get executed
 * 
 * java.util.concurrent package offers improved support for concurrency compared to the direct usage of Threads
 * 
 * Using the Thread class directly has the following disadvantages
 * 		Creating a new thread causes some performance overhead
 * 		Too many threads can lead to reduced performance, as the CPU needs to switch between these threads
 * 		You cannot easily control the number of threads, therefore you may run into out of memory errors due to too many threads
 * 
 * @author user
 *
 */
public class CountWithConcurency {
	private static final int NTHREDS = 10;
	
	public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);
        for (int i = 0; i < 500; i++) {
            Runnable worker = new CountWithThreading(10000000L + i);
            executor.execute(worker);
        }
        // This will make the executor accept no new threads
        // and finish all existing threads in the queue
        executor.shutdown();
        // Wait until all threads are finish
        try {
			executor.awaitTermination(5000, null);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Finished all threads");
    }
}
