package com.niit.niittechtree.controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.niittechtree.dao.UserService;
import com.niit.niittechtree.model.User;
@Controller
public class LoginController {


	@Autowired
	UserService userService;
	
	@RequestMapping("/login")
	public String getIndex(){
		 
		return "login";
	}
	
	@RequestMapping("/userhome")
	public String getUserHome(Model model){
		//User activeUser
		Authentication authenticateduser=SecurityContextHolder.getContext().getAuthentication();
		String username=authenticateduser.getName();
		
		User user=userService.getUserByUsername(username);
		model.addAttribute("userinfo", user);
		return "userhome";
	}
	
	@RequestMapping("/imageupload")
	public String getImageUpload(){
		
		return "uploadimage";
	}
	@RequestMapping("/saveimage")
	public String saveImage(){
		
		return "userhome";
	}
	
	
	@RequestMapping("/adminhome")
	public String getAdminHome(){
		
		return "adminhome";
	}
	
	@RequestMapping("/403")
	public String getErrorPage(){
		
		return "403";
	}
	@RequestMapping("/logoutsuccess")
	public String getLogoutPage(){
		
		return "logoutsucess";
	}
}
