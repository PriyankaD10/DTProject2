package com.niit.niittechtree.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
 
	@RequestMapping("/")
	public String getIndex(){
		
		return "index";
	}
	@RequestMapping("/aboutus")
	public String getAboutUs(){
		
		return "aboutus";
	}
	@RequestMapping("/blog")
	public String getBlog(){
		
		return "blog";
	}
	
}
