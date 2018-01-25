package jersey;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

@Path("people")
public class PeopleServlet {
	private final String TAG="MessageServlet";
	Logger logger=Logger.getLogger(TAG);
	
	
@GET
@Produces({MediaType.APPLICATION_JSON})
   public List getHello() {
	logger.log(Level.INFO, "getHello:Start");
	List resultList=new ArrayList<>();
	Result result= new Result();
	result.setName("Person1");
	result.setHeight("190");
	result.setMass("90");
	resultList.add(result);
    logger.log(Level.INFO, "getHello:End");
    return resultList;
   }
}