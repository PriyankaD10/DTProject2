package com.niit.niittechtree.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.niittechtree.model.Blog;
@Repository
public interface BlogDAO {
 boolean insert(Blog blog);
 boolean update(Blog blog);
 boolean delete(int blog);
 Blog getBlog(int id);
 List<Blog> getAllBlogs();
}
