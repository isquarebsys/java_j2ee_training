package concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * The Future interface is limited as a model of asynchronously executed tasks. 
 * 
 * Future allows a client to query a Callable task for its result
 * 	It does NOT provide the option to register a callback method
 * 
 * CompletableFuture interface which allows to provide a callback interface which is called once a task is completed
 * 
 * @author user
 *
 */
public class CompletableFutureSimpleSnippet {
	public static void main(String[] args) {
		long started = System.currentTimeMillis();

		// configure CompletableFuture
		CompletableFuture<Integer> futureCount = createCompletableFuture();

		// continue to do other work
		System.out.println("Took " + (started - System.currentTimeMillis()) + " milliseconds");

		// now its time to get the result
		try {
			int count = futureCount.get();
			System.out.println("CompletableFuture took " + (started - System.currentTimeMillis()) + " milliseconds");

			System.out.println("Result " + count);
		} catch (InterruptedException | ExecutionException ex) {
			// Exceptions from the future should be handled here
		}
	}

	private static CompletableFuture<Integer> createCompletableFuture() {
		CompletableFuture<Integer> futureCount = CompletableFuture.supplyAsync(() -> {
			try {
				// simulate long running task
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			return 20;
		});
		return futureCount;
	}
}
