package com.niit.niittechtree.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.niittechtree.model.Blog;
@EnableTransactionManagement
@Repository
public class BlogDAOImpl implements BlogDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public BlogDAOImpl(){
		
	}
	@Transactional
	public boolean insert(Blog blog) {
		// TODO Auto-generated method stub
		try{
		sessionFactory.getCurrentSession().save(blog);
		return true;
		}
		catch(HibernateException ex){
		return false;
		}
	}

	@Transactional
	public boolean update(Blog blog) {
		// TODO Auto-generated method stub
		try{
			sessionFactory.getCurrentSession().update(blog);
			return true;
		}catch(HibernateException ex){
		
			return false;
		}
		
	}

	@Transactional
	public boolean delete(int blogid) {
		// TODO Auto-generated method stub
		boolean result=false;
		try{
			Session session=sessionFactory.getCurrentSession();
			Blog blog=(Blog)session.get(Blog.class,blogid);
			if(blog!=null){
				session.delete(blog);
				result=true;
			}
			return result;
		}catch(HibernateException ex){
		return false;
		}
		
	}

	@Transactional
	public Blog getBlog(int id) {
		// TODO Auto-generated method stub
		String hql="from Blog where id = '"+id+"'";
		Session session = sessionFactory.getCurrentSession();
		List<Blog> bloglist= session.createQuery(hql).list();
	
		if(bloglist!=null){
			
		return bloglist.get(0);
		}
		else{
		return null;
		}
	}
	@Transactional
	public List<Blog> getAllBlogs() {
		// TODO Auto-generated method stub
		String hql="from Blog ";
		Session session = sessionFactory.getCurrentSession();
		List<Blog> bloglist=session.createQuery(hql).list();
		
		if(bloglist!=null){
			
		return bloglist;
		}
		else{
		return null;
		}
		
	}

	
}
