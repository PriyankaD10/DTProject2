package com.niit.niittechtree.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.niittechtree.model.Blog;
import com.niit.niittechtree.model.ProfileImage;
@Repository
public interface ProfileImageDAO {

	 boolean insert(ProfileImage profileImage);
	 ProfileImage getProfileImageByUsername(String username);
	 
}
