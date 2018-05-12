package com.isquarebsys.mvc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

	private String message = "Hello World";

	@RequestMapping(value="/index",method = RequestMethod.GET)
	public String welcome() {
//		model.put("message", this.message);
		return "index";
	}

}
