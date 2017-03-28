package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello") // this will set all the mapping url below relative to '/hello'
public class HelloWorldController {

	@RequestMapping("/login")
	public String showLogin() {
		return "login";
	}

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		// HttpServletRequest -- > to holds html form data
		// Model --> Container for our data

		String theName = request.getParameter("studentName");
		theName = theName.toUpperCase();

		String result = "V2 : Yo!!" + theName;

		model.addAttribute("message", result);

		return "helloworld";
	}

	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		// @RequestParam -- > Spring will bind the parameter "studentName" into variable theName
		// Model --> Container for our data

		theName = theName.toUpperCase();

		String result = "V.3 : Yo!!" + theName;

		model.addAttribute("message", result);

		return "helloworld";
	}
}
