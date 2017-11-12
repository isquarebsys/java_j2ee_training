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
	public CompletableFuture<String> getValueAsync() {
		log.info("Request received");
		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(this::processRequest);
		log.info("Servlet thread released");
		return completableFuture;
	}

	private String processRequest() {
		log.info("processRequest:start");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("processRequest:end");
		return "result from AsyncCompletable";
	}
}
