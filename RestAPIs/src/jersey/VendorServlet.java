package jersey;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

@Path("people")
public class VendorServlet {
	private final String TAG="MessageServlet";
	Logger logger=Logger.getLogger(TAG);
	
	
@GET
@Produces({MediaType.APPLICATION_JSON})
   public List getHello() {
	logger.log(Level.INFO, "getHello:Start");
	List resultList=new ArrayList<>();
	Result result= new Result();
	result.setName("Person 1");
	result.setHeight("190");
	result.setMass("90");
	resultList.add(result);
	// 
	Result result2= new Result();
	result2.setName("Person 2");
	result2.setHeight("280");
	result2.setMass("100");
	resultList.add(result2);
    logger.log(Level.INFO, "getHello:End");
    return resultList;
   }
}