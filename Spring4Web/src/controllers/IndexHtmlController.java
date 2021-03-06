package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import java.util.*;
import java.lang.*;

@Controller
public class IndexHtmlController {
	@RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(ModelMap model) {
        model.addAttribute("greeting", "index.html from Spring 4MVC");
        return "index";
    }
}
