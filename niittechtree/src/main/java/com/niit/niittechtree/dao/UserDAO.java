package com.niit.niittechtree.dao;

import java.util.List;

import com.niit.niittechtree.model.User;

public interface UserDAO {
	boolean insert(User User);

	boolean update(User User);

	boolean delete(int User);

	User getUser(int id);
	
	User getUserByUsername(String username);

	List<User> getAllUsers();
}
