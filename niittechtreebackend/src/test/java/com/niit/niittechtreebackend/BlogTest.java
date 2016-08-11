package com.niit.niittechtreebackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.niittechtreebackend.dao.BlogDAO;
import com.niit.niittechtreebackend.model.Blog;

public class BlogTest {

	public static void main(String [] args){
		 
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit.niittechtree");
		context.refresh();
		Blog blog=(Blog) context.getBean("blog");
		BlogDAO blogDAO=(BlogDAO) context.getBean("blogDAO");
		
		blog.setBlogtitle("Test Blog");
		blog.setBlogcontent("Test Blog Content");
		blog.setBlogdate(new java.util.Date());
		blog.setBlogusername("user01");
		blogDAO.insert(blog);
	}
}
