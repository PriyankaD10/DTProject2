package com.niit.niittechtreebackend.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.niittechtreebackend.model.Blog;
@EnableTransactionManagement
@Repository("blogDAO")
public class BlogDAOImpl implements BlogDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public BlogDAOImpl(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
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
	public boolean delete(Blog blog) {
		// TODO Auto-generated method stub
		try{
			sessionFactory.getCurrentSession().delete(blog);
			return true;
		}catch(HibernateException ex){
		return false;
		}
	}

	@Transactional
	public Blog getBlog(int id) {
		// TODO Auto-generated method stub
		String hql="from blog where id = '"+id+"'";
		Session session = sessionFactory.getCurrentSession();
		Query query=(Query) session.createQuery(hql);
		List<Blog> bloglist=(List<Blog>) query.getSingleResult();
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
		String hql="from blog ";
		Session session = sessionFactory.getCurrentSession();
		Query query=(Query) session.createQuery(hql);
		List<Blog> bloglist=query.getResultList();
		if(bloglist!=null){
			
		return bloglist;
		}
		else{
		return null;
		}
		
	}

	
}
