package com.niit.niittechtree.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.niittechtree.model.Forum;
@Repository
public interface ForumDAO {
	 boolean insert(Forum forum);
	 boolean update(Forum forum);
	 boolean delete(int forum);
	 Forum getForum(int forum);
	 List<Forum> getAllForums();
}
