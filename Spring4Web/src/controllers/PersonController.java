package controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;

import dao.PersonDAO;
import dao.PersonDAOImplWithTemplate;
import to.Person;
import to.Student;

@Controller
public class PersonController {
	@Autowired
	private PersonDAO autoWiredPersonDao;
	private PersonDAO personDao;
	private PersonDAOImplWithTemplate personDAOWithTemplate;
 
    @RequestMapping("/person/list")
    public String handleRequest(HttpSession session,ModelAndView model)  throws Exception {
    
        return "PersonList";
    }
     
    @RequestMapping(value = "/person/added", method = RequestMethod.POST)
    public String savedUser(HttpServletRequest request,ModelAndView model) {
//    	HttpSession session=request.getSession();
//    	ApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(session.getServletContext());
//    	personDao=applicationContext.getBean(PersonDAO.class);
    	Person person=new Person();
    	person.setName(request.getParameter("name"));
    	person.setCountry(request.getParameter("country"));
    	autoWiredPersonDao.save(person);
        model.addObject("person", person);
        return "person_added";      
    }

    @RequestMapping(value = "/person/add", method = RequestMethod.GET)
    public ModelAndView newPerson() {
       return new ModelAndView("add_person", "command", new Person());
    }  
    
    @RequestMapping(value = "/person/add/template", method = RequestMethod.GET)
    public ModelAndView newPersonWithTemplate() {
       return new ModelAndView("hibernate_template", "command", new Person());
    }    

    @RequestMapping(value = "/person/added/template", method = RequestMethod.POST)
    public String saveUserWithTempate(HttpServletRequest request,ModelAndView model) {
    	HttpSession session=request.getSession();
    	ApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(session.getServletContext());
    	personDAOWithTemplate=applicationContext.getBean(PersonDAOImplWithTemplate.class);
    	Person person=new Person();
    	person.setName(request.getParameter("name"));
    	person.setCountry(request.getParameter("country"));
    	personDAOWithTemplate.savePerson(person);
        model.addObject("person", person);
        return "person_added";      
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
    @RequestMapping(value = "/person/delete", method = RequestMethod.GET)
    public String deleteUser(HttpServletRequest request) {
    	HttpSession session=request.getSession();
    	ApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(session.getServletContext());
    	personDAOWithTemplate=applicationContext.getBean(PersonDAOImplWithTemplate.class);
        int userId = Integer.parseInt(request.getParameter("id"));
        Person personToDelete=personDAOWithTemplate.getById(userId);
        personDAOWithTemplate.deletePerson(personToDelete);
        return "PersonList";
    }
//     
//    @RequestMapping(value = "/save", method = RequestMethod.POST)
//    public ModelAndView saveUser(@ModelAttribute Person person) {
//        personDao.saveOrUpdate(person);
//        return new ModelAndView("redirect:/");
//    }  
}