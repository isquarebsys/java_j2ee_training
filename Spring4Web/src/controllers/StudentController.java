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
	@RequestMapping(value = "/student/add", method = RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("add_student", "command", new Student());
	}

	/**
	 * form:input path="name"
	 * 
	 * Spring will take the value of name from form:input
	 * 
	 * Creates the student object and sets the value from the html form
	 * 
	 * @param student
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/student/added", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("student") Student student, ModelMap model) {
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());
		model.addAttribute("id", student.getId());
		return "student_added";
	}
}