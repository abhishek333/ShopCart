package com.shop.mvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//The @Controller annotation indicates that a particular class serves the role of a controller
@Controller
@RequestMapping("/")
public class HomeController {
	
	private final Logger logger =  LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(method=RequestMethod.GET)
	public String home(){
		logger.debug("GET came to home..");
		return "home";
	}
}
