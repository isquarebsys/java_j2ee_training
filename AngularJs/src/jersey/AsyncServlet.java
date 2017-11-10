package jersey;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;

@Path("AsyncServlet")
public class AsyncServlet {
	private static final Logger logger=Logger.getLogger("AsyncServlet");
//    @Inject
//    private Executor executor;
//
    @GET
    public void asyncRestMethod(@Suspended final AsyncResponse asyncResponse) {
    	logger.log(Level.INFO, "asyncGet:start");
//            executor.execute(() -> {
//            	logger.log(Level.INFO, "executor.execute:start");
//                 String result = "Hello Async Servlet";
//                 asyncResponse.resume(result);
//            });
            logger.log(Level.INFO, "asyncGet:end");
    }
}

