package com.niit.niittechtree.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.niittechtree.model.Blog;
@Service
@Transactional
public class BlogService {

	@Autowired
	BlogDAOImpl blogDao;

	public BlogService(){}
	
	public void insert(Blog blog) {
		blogDao.insert(blog);
		
	}
	
	public void update(Blog blog) {
		blogDao.update(blog);
		
	}
	
	public List getAllBlogs() {
		
		return blogDao.getAllBlogs();
	}
	
	public Blog search(int blogid) {
		// TODO Auto-generated method stub
		return blogDao.getBlog(blogid);
	}
	
	public void delete(int blogid) {
		blogDao.delete(blogid);
		
	}
}
