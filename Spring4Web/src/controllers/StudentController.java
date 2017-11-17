package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import to.Student;

@Controller
public class StudentController {
   @RequestMapping(value = "/add/student", method = RequestMethod.GET)
   public ModelAndView student() {
      return new ModelAndView("add_student", "command", new Student());
   }
   
   @RequestMapping(value = "/add/result", method = RequestMethod.POST)
      public String addStudent(@ModelAttribute("student")Student student,ModelMap model) {
      model.addAttribute("name", student.getName());
      model.addAttribute("age", student.getAge());
      model.addAttribute("id", student.getId());
      return "student_added";
   }
}