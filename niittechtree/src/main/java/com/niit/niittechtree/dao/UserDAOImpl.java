package com.niit.niittechtree.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.niittechtree.model.User;

@EnableTransactionManagement
@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public UserDAOImpl() {

	}

	@Transactional
	public boolean insert(User user) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(user);
			return true;
		} catch (HibernateException ex) {
			return false;
		}
	}

	@Transactional
	public boolean update(User user) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(user);
			return true;
		} catch (HibernateException ex) {

			return false;
		}

	}

	@Transactional
	public boolean delete(int userid) {
		// TODO Auto-generated method stub
		boolean result = false;
		try {
			Session session = sessionFactory.getCurrentSession();
			User user = (User) session.get(User.class, userid);
			if (user != null) {
				session.delete(user);
				result = true;
			}
			return result;
		} catch (HibernateException ex) {
			return false;
		}

	}

	@Transactional
	public User getUser(int id) {
		// TODO Auto-generated method stub
		String hql = "from User where id = '" + id + "'";
		Session session = sessionFactory.getCurrentSession();
		List<User> Userlist = session.createQuery(hql).list();

		if (Userlist != null) {

			return Userlist.get(0);
		} else {
			return null;
		}
	}

	@Transactional
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		String hql = "from User ";
		Session session = sessionFactory.getCurrentSession();
		List<User> Userlist = session.createQuery(hql).list();

		if (Userlist != null) {

			return Userlist;
		} else {
			return null;
		}

	}

	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		String hql = "from User where username= '" + username + "'";
		Session session = sessionFactory.getCurrentSession();
		List<User> userlist = session.createQuery(hql).list();
		if (userlist != null) {

			return userlist.get(0);
		} else {
			return null;
		}
	}
}