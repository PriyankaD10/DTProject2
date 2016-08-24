package com.niit.niittechtree.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.niittechtree.model.ProfileImage;
@Service
@Transactional
public class ProfileImageService {

	@Autowired
	ProfileImageDAOImpl profileImageDao;

	public ProfileImageService(){}
	
	public void insert(ProfileImage ProfileImage) {
		profileImageDao.insert(ProfileImage);
		
	}
	
	
	public ProfileImage search(String username) {
		// TODO Auto-generated method stub
		return profileImageDao.getProfileImageByUsername(username);
	}
	
	
}
