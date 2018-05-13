package com.isquarebsys.oauth;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeClientControllerSecured {
	@RequestMapping(value = "/oauth/employees", method = RequestMethod.GET)
    public ModelAndView getEmployeeInfo() {
        return new ModelAndView("oauth/secured_employees");
    }
}
