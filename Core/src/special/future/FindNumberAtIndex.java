package special.future;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;
import java.util.logging.Logger;

public class FindNumberAtIndex {
	private final static Logger log=Logger.getLogger("DownloadSites");
	private static ArrayList<String> numbers = new ArrayList<String>(Arrays.asList("0", "1", "2"));
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Requesting");
		CompletableFuture<String> future = getWordAtIndex(2);
		future = future.thenApply(Integer::parseInt)
				.thenApply(outputOfWordAtIndex -> "Muliplying by 2 and then by 3.14 >>> "+outputOfWordAtIndex * 2 * Math.PI)
				.thenApply(outputOfWordAtIndex -> "apply >>> " +outputOfWordAtIndex)
//				.exceptionally(ex -> "Error: " + ex.getMessage())
				.handle((result, exception) -> {
					if (result != null) {
						return result;
					} else {
						return "Error handling: " + exception.getMessage();
					}
				}); 
		future.thenAccept(result -> System.out.println("accept: " + result));
		System.out.println("Running OUTSIDE Future");
		String contents = null;
		try {
			contents = future.get();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		System.out.println("Future result: " + contents);
	}
 
	/**
	 * 
	 * @param index
	 * @return CompletableFuture
	 */
	private static CompletableFuture<String> getWordAtIndex(int index) {
		log.info("getWordAtIndex:start");
		return CompletableFuture.supplyAsync(new Supplier<String>() {
			@Override
			public String get() {
				try {
					// Thread is slept to ILLUSTRATE the running inside FUTURE. It does NOT do anything else
					System.out.println("INSIDE Future");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("INSIDE Future... ");
					System.out.println("FUTURE Complete");
					log.info("getWordAtIndex:end");					
					return numbers.get(index);
				} catch (Throwable e) {
					return "not detected";
				}
			}
		});
		
	}
}
