package com.isquarebsys.mvcweb;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	private String message = "Hello World";

	@RequestMapping("/index")
	public String welcome() {
//		model.put("message", this.message);
		return "index";
	}

}
