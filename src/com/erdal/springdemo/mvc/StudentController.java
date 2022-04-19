package com.erdal.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		Student student = new Student();
		model.addAttribute("studentAttribute", student);
		model.addAttribute("countryList", student.getCountryList());
		return "student-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("studentAttribute") Student student) {
		System.out.println("Student: " + student.getFirstName() + " " + student.getLastName() + " " + student.getCountry());
		return "student-confirmation";
	}
}
