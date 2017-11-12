package jersey;

import java.util.logging.Logger;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.glassfish.jersey.server.ManagedAsync;

@Path("SyncSingleThread")
public class SyncSingleThread {
	private static final Logger log = Logger.getLogger("SyncSingleThread");

	@GET
	@ManagedAsync
	public String getValueSync() {
		log.info("Request received");
		return processRequest();
	}

	private String processRequest() {
		log.info("Start processing request");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Completed processing request");
		return "result from SyncSingleThread";
	}
}
