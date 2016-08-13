package com.niit.niittechtree.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class LoginController {

	@RequestMapping("/login")
	public String getIndex(){
		 
		return "login";
	}
	
	@RequestMapping("/userhome")
	public String getUserHome(){
		
		return "userhome";
	}
	
	@RequestMapping("/adminhome")
	public String getAdminHome(){
		
		return "adminhome";
	}
}
