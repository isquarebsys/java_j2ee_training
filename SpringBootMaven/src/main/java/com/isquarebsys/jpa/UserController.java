package com.isquarebsys.jpa;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.qos.logback.classic.Level;

@Controller // This means that this class is a Controller
@RequestMapping(path = "users") // This means URL's start with /users (after Application path)
public class UserController {
	private final static String TAG="UserController";
	@Autowired
	private UserRepository userRepository;

	@PostMapping(path = "/add") // Map ONLY GET Requests
	public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		System.out.println("name: "+name);
		System.out.println("email: "+email);
		User n = new User();
		n.setName(name);
		n.setEmail(email);
		userRepository.save(n);
		return "Saved";
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		// This returns a JSON or XML with the users
		return userRepository.findAll();
	}
}