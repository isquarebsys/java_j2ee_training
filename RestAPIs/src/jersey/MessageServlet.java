package jersey;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

@Path("message")
public class MessageServlet {
	private final String TAG="MessageServlet";
	Logger logger=Logger.getLogger(TAG);
	
	
@GET
@Produces({MediaType.APPLICATION_JSON})
   public Message getHello() {
	logger.log(Level.INFO, "getHello:Start");
	Message m = new Message();
    m.setDate(new Date());
    m.setFirstName("Vijay");
    m.setLastName("P");
    m.setText("Hello World!");
    logger.log(Level.INFO, "getHello:End");
    return m;
   }
}