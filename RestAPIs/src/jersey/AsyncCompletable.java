package jersey;

import java.util.concurrent.CompletableFuture;
import java.util.logging.Logger;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.glassfish.jersey.server.ManagedAsync;

@Path("AsyncCompletable")
public class AsyncCompletable {
	private static final Logger log = Logger.getLogger("AsyncCompletable");

	@GET
	@ManagedAsync
	public CompletableFuture<Void> getValueAsync() {
		log.info("Request received");
		CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(5000);
					log.info("CompletableFuture running");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		log.info("Servlet thread released");
		//Now handle the previously called completableFuture
		CompletableFuture<String> handleResult = completableFuture.handle((ExecutedSuccessfully, ExecutedWithError) -> {
			if (ExecutedSuccessfully != null) {
				log.info("Processed Result is SUCCESS");
				return "SUCCESS";
			} else {
				log.info("Problem");
				log.info("Processed Result is FAILURE");
				return "FAILURE";
			}
		});
		log.info("Status is : "+handleResult.isDone());
		return completableFuture;
	}
}
