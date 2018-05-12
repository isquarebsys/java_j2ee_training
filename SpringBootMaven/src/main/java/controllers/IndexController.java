package controllers;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/jsp/")
public class IndexController {

	private String message = "Hello World";

	@RequestMapping(value = "/nav")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "nav";
	}

}
