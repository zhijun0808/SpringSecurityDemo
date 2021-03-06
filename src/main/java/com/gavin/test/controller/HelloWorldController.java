package com.gavin.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping(value = { "/", "/welcome" }, method = RequestMethod.GET)
	public ModelAndView welcome() {
		
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Welcome - Spring Security Hello World");
		model.addObject("message", "This is welcome page!");
		model.setViewName("hello");
		
		return model;
	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView admin() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Admin - Spring Security Hello World");
		model.addObject("message", "This is protected page!");
		model.setViewName("admin");

		return model;

	}

}