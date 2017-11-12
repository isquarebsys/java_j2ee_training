package jersey;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.CompletionCallback;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.server.ManagedAsync;

@Path("AsyncServlet")
public class AsyncServlet {
	private static final Logger logger = Logger.getLogger("AsyncServlet");

	@GET
	@ManagedAsync
	public void asyncGet(@MatrixParam("key") String key, @Suspended final AsyncResponse asyncResponse) {
		logger.log(Level.INFO, "asyncGet:start");
		logger.log(Level.INFO, "search|" + key);
		String result = "Async Test";
		asyncResponse.setTimeout(1000, TimeUnit.MILLISECONDS);
		asyncResponse.setTimeoutHandler(ar -> ar
				.resume(Response.status(Response.Status.SERVICE_UNAVAILABLE).entity("Operation timed out").build()));
		asyncResponse.register((CompletionCallback) error -> {
			if (error != null) {
				logger.log(Level.SEVERE, "Error is: "+error);
			} else {
				logger.log(Level.INFO, "Result is: " + result);
			}
		});

		new Thread(() -> {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			asyncResponse.resume(result);
		}).start();
		logger.log(Level.INFO, "asyncGet:end");
	}
}
