package com.niit.niittechtree.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.niittechtree.model.Forum;

@EnableTransactionManagement
@Repository
public class ForumDAOImpl implements ForumDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public ForumDAOImpl() {
	
	}
	@Transactional
	public boolean insert(Forum forum) {
		// TODO Auto-generated method stub
		try{
			sessionFactory.getCurrentSession().save(forum);
			return true;
			}
			catch(HibernateException ex){
			return false;
			}
	}
	@Transactional
	public boolean update(Forum forum) {
		// TODO Auto-generated method stub
		try{
			sessionFactory.getCurrentSession().update(forum);
			return true;
		}catch(HibernateException ex){
		
			return false;
		}
	}
	@Transactional
	public boolean delete(int forumid) {
		// TODO Auto-generated method stub
		boolean result=false;
		try{
			Session session=sessionFactory.getCurrentSession();
			Forum forum=(Forum)session.get(Forum.class,forumid);
			if(forum!=null){
				session.delete(forum);
				result=true;
			}
			return result;
		}catch(HibernateException ex){
		return result;
		}
	}
	@Transactional
	public Forum getForum(int forumid) {
		// TODO Auto-generated method stub
		String hql="from Forum where id = '"+forumid+"'";
		Session session = sessionFactory.getCurrentSession();
		List<Forum> forumlist= session.createQuery(hql).list();
	
		if(forumlist!=null){
			
		return forumlist.get(0);
		}
		else{
		return null;
		}
	}
	@Transactional
	public List<Forum> getAllForums() {
		// TODO Auto-generated method stub
		String hql="from Forum ";
		Session session = sessionFactory.getCurrentSession();
		List<Forum> forumlist=session.createQuery(hql).list();
		
		if(forumlist!=null){
			
		return forumlist;
		}
		else{
		return null;
		}
		
	}
	

}
