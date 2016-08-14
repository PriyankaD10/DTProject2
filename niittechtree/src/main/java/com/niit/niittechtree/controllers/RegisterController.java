package com.niit.niittechtree.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import com.niit.niittechtree.dao.UserService;
import com.niit.niittechtree.model.User;
@Controller
public class RegisterController {

	
	@Autowired
	UserService userService;

	
	@RequestMapping("/register")
	public String getUserPage(Model model){
		model.addAttribute("newuser",new User());
		return "register";
	}
	
	@RequestMapping("/saveuser")
	public String getUserPage(@Valid @ModelAttribute("newuser")  User newuser, BindingResult result){
		
	String page="register";
	if(newuser.getId()!=0 || result.hasErrors()){
		return page;
	}
	else{
		newuser.setEnabled(1);
		userService.insert(newuser);
		page="registersuccess";
	}
		
		return page;
	}
	

	
}
