package com.niit.niittechtreebackend.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.niittechtreebackend.model.Blog;
@Repository
public interface BlogDAO {
 boolean insert(Blog blog);
 boolean update(Blog blog);
 boolean delete(Blog blog);
 Blog getBlog(int id);
 List<Blog> getAllBlogs();
}
