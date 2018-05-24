package springmvc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	private String message = "Hello World";

	@RequestMapping("/login")
	public String welcome() {
//		model.put("message", this.message);
		return "login";
	}

}
