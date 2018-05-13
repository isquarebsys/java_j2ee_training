package com.isquarebsys.mvcweb;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Gradle example @ http://www.javainuse.com/spring/SpringBoot_HelloWorld_gradle is adapted for Maven
 * 
 * @author user
 *
 */
@Controller
public class CourseContentController {

	private String message = "Hello World";

	@RequestMapping("/contents")
	public String welcome() {
//		model.put("message", this.message);
		return "index";
	}

}
