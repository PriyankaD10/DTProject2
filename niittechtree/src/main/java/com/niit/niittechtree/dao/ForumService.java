package com.niit.niittechtree.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.niittechtree.model.Forum;

@Service
@Transactional
public class ForumService {
	@Autowired
	ForumDAOImpl forumDao;

	public ForumService(){}
	
	public void insert(Forum forum) {
		forumDao.insert(forum);
		
	}
	
	public void update(Forum forum) {
		forumDao.update(forum);
		
	}
	
	public List<Forum> getAllForums() {
		
		return forumDao.getAllForums();
	}
	
	public Forum search(int forumid) {
		// TODO Auto-generated method stub
		return forumDao.getForum(forumid);
	}
	
	public void delete(int forumid) {
		forumDao.delete(forumid);
		
	}
}
