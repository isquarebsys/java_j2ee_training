package controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;

import dao.PersonDAO;
import to.Person;

@Controller
public class PersonController {
	private PersonDAO personDao;
 
    @RequestMapping("/person/list")
    public ModelAndView handleRequest(HttpSession session)  throws Exception {
    	ApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(session.getServletContext());
    	personDao=applicationContext.getBean(PersonDAO.class);
        List<Person> listUsers = personDao.list();
        ModelAndView model = new ModelAndView("PersonList");
        model.addObject("personList", listUsers);
        return model;
    }
     
    @RequestMapping(value = "/person/add", method = RequestMethod.GET)
    public String newUser(HttpSession session) {
    	ApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(session.getServletContext());
    	personDao=applicationContext.getBean(PersonDAO.class);
    	Person person=new Person();
    	person.setName("Vijay");
    	person.setCountry("India");
    	personDao.save(person);
        ModelAndView model = new ModelAndView("index");
        model.addObject("person", new Person());
        return "index";      
    }
     
//    @RequestMapping(value = "/edit", method = RequestMethod.GET)
//    public ModelAndView editUser(HttpServletRequest request) {
//        int userId = Integer.parseInt(request.getParameter("id"));
//        Person person = personDao.get(userId);
//        ModelAndView model = new ModelAndView("UserForm");
//        model.addObject("person", person);
//        return model;      
//    }
//     
//    @RequestMapping(value = "/delete", method = RequestMethod.GET)
//    public ModelAndView deleteUser(HttpServletRequest request) {
//        int userId = Integer.parseInt(request.getParameter("id"));
//        personDao.delete(userId);
//        return new ModelAndView("redirect:/");     
//    }
//     
//    @RequestMapping(value = "/save", method = RequestMethod.POST)
//    public ModelAndView saveUser(@ModelAttribute Person person) {
//        personDao.saveOrUpdate(person);
//        return new ModelAndView("redirect:/");
//    }  
}