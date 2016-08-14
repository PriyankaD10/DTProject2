package com.niit.niittechtree.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.niittechtree.model.User;

@Service
@Transactional
public class UserService {

	@Autowired
	UserDAOImpl userDao;

	public UserService() {
	}

	public void insert(User User) {
		userDao.insert(User);

	}

	public void update(User User) {
		userDao.update(User);

	}

	public List getAllUsers() {

		return userDao.getAllUsers();
	}

	public User search(int userid) {
		// TODO Auto-generated method stub
		
		return userDao.getUser(userid);
	}

	public User getUserByUsername(String username) {
		return userDao.getUserByUsername(username);
	}

	public void delete(int userid) {
		userDao.delete(userid);

	}
}
