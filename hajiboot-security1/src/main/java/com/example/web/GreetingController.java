package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	
	@RequestMapping(value={"/hello"})
	public String hello(){
		return "hello";
	}
	
	@RequestMapping(value={"/"})
	public String home(){
		return "home";
	}

		
	@RequestMapping(value={"/login"})
	public String login(){
	return "login";
	}	


}