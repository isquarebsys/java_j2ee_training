package jersey;

import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Component
@Path("/")
public class JerseyEndpointSample {
	private Logger logger = Logger.getLogger("JerseyEndpointSample");

	@GET
	@Path("/hello")
	@Produces(MediaType.APPLICATION_JSON)
	public String message() {
		logger.log(java.util.logging.Level.INFO, "message:start");
		return "Hello";
	}

}
