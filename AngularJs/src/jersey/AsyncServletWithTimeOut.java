package jersey;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.server.ManagedAsync;

@Path("AsyncServletWithTimeOut")
public class AsyncServletWithTimeOut {
	private static final Logger logger = Logger.getLogger("AsyncServletWithTimeOut");
	@GET
	@ManagedAsync
	public void asyncGet(@Suspended final AsyncResponse asyncResponse) {
		logger.log(Level.INFO, "asyncGet:start");
		asyncResponse.setTimeout(1000, TimeUnit.MILLISECONDS);
		asyncResponse.setTimeoutHandler(ar -> ar
				.resume(Response.status(Response.Status.SERVICE_UNAVAILABLE).entity("Operation timed out").build()));
		String result = "Async Test";
		asyncResponse.resume(result);
		logger.log(Level.INFO, "asyncGet:end");
	}
}
