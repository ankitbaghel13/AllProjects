package com.mykong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@RequestMapping(value="/welcome",method=RequestMethod.GET)
	public String welcomePage(ModelMap modelMap) {
		
		System.out.println("Hi 2eu23bdh23b");
		modelMap.addAttribute("title", "Spring Security Hello World");
		modelMap.addAttribute("message", "This is a welcome page!!");
		
		return "welcome";
	}
	
	
	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public String adminPage(ModelMap modelMap) {
		
		System.out.println("Hi 2eu23bdh23b");
		modelMap.addAttribute("title", "Spring Security Hello World");
		modelMap.addAttribute("message", "This is a protected page!!");
		
		return "admin";
	}
}
