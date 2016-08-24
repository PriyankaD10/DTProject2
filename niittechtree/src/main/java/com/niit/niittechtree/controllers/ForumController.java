package com.niit.niittechtree.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.niittechtree.dao.BlogService;
import com.niit.niittechtree.dao.ForumService;
import com.niit.niittechtree.model.Blog;
import com.niit.niittechtree.model.Forum;

@Controller
public class ForumController {
	@Autowired
	ForumService forumService;

	@RequestMapping("/addnewdiscuss")
	public String addForumPage(Model model) {
		model.addAttribute("forum", new Forum());
		return "postforum";
	}

	@RequestMapping("/saveforum")
	public String postForum(@ModelAttribute("forum") Forum forum) {
		if (forum.getId() == 0) {
			Authentication authenticateduser=SecurityContextHolder.getContext().getAuthentication();
			String username=authenticateduser.getName();
			forum.setDiscusscreatedate(new java.util.Date());
			forum.setDiscussusername(username);
			forumService.insert(forum);
			return "redirect:/forum";
		} else {
			return "redirect:/forumerror";
		}
	}

	@RequestMapping("/forum")
	public ModelAndView getForums() {

		ModelAndView forummodel = null;
		List<Forum> forumlist = forumService.getAllForums();
		if (forumlist != null) {

			String json = new Gson().toJson(forumlist); // converting list into
														// Google Gson object
														// which is a string
			System.out.println(json);
			ModelAndView mv = new ModelAndView("forum");
			mv.addObject("forumlist", json);

			forummodel = mv;
		}
		return forummodel;

	}

}
