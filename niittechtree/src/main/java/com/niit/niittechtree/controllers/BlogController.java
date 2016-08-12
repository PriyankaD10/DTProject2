package com.niit.niittechtree.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.niittechtree.dao.BlogService;
import com.niit.niittechtree.model.Blog;

@Controller
public class BlogController {
	@Autowired
	BlogService blogService;

	@RequestMapping("/addnewblog")
	public String addBlogPage(Model model) {
		model.addAttribute("blog", new Blog());
		return "postblog";
	}

	@RequestMapping("/saveblog")
	public String postBlog(@ModelAttribute("blog") Blog blog) {
		if (blog.getId() == 0) {
			blog.setBlogdate(new java.util.Date());
			blog.setBlogusername("user01");
			blogService.insert(blog);
			return "redirect:/blog";
		} else {
			return "redirect:/blogerror";
		}
	}

	@RequestMapping("/blog")
	public ModelAndView getBlogs() {

		ModelAndView blogmodel = null;
		List<Blog> bloglist = blogService.getAllBlogs();
		if (bloglist != null) {

			String json = new Gson().toJson(bloglist); // converting list into
														// Google Gson object
														// which is a string
			System.out.println(json);
			ModelAndView mv = new ModelAndView("blog");
			mv.addObject("bloglist", json);

			blogmodel = mv;
		}
		return blogmodel;

	}
}
