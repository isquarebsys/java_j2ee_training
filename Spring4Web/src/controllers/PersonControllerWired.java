package controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dao.PersonDAO;
import dao.PersonDAOImplWithTemplate;
import services.PersonService;
import to.Person;

@Controller
public class PersonControllerWired {
	@Autowired
	private PersonDAO autoWiredPersonDao;

	@Autowired
	private PersonService personService;

    @RequestMapping(value = "/person/autowire/add")
    public String autoWirePerson() {
    	// person is the object used for mapping between Person object and the form
    	// Requests encapsulated as objects are known as commands [Command Pattern]
       return "spring_autowiring";
    } 
    
	@RequestMapping(value = "/person/autowire/dao")
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
	
	@RequestMapping(value = "/person/autowire/service")
    public String savedUserUsingService(HttpServletRequest request,ModelAndView model) {
//    	HttpSession session=request.getSession();
//    	ApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(session.getServletContext());
//    	personDao=applicationContext.getBean(PersonDAO.class);
    	Person person=new Person();
    	person.setName(request.getParameter("name"));
    	person.setCountry(request.getParameter("country"));
    	personService.save(person);
        model.addObject("person", person);
        return "PersonList";      
    }	
}