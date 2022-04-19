package com.erdal.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@RequestParam("studentName") String name, Model model) {
		// Spring will read param from request: studentName
		// and bind it to the variable called 'name'
		String message = "Yo, " + name.toUpperCase();

		// model attribute name can be anything you choose. Pass that attribute name to
		// the JSP page inside ${}
		model.addAttribute("message", message);
		
		return "helloworld";
	}
}
