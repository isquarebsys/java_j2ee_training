package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dao.PersonDAO;
import dao.PersonDAOImpl;
import to.Person;

@Controller
public class PersonController {
	private PersonDAO personDao=new PersonDAOImpl();
 
    @RequestMapping("/person/list")
    public ModelAndView handleRequest() throws Exception {
        List<Person> listUsers = personDao.list();
        ModelAndView model = new ModelAndView("PersonList");
        model.addObject("personList", listUsers);
        return model;
    }
     
    @RequestMapping(value = "/person/new", method = RequestMethod.GET)
    public ModelAndView newUser() {
        ModelAndView model = new ModelAndView("UserForm");
        model.addObject("person", new Person());
        return model;      
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