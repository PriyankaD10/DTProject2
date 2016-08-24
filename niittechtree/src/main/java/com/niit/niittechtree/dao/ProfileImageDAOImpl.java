package com.niit.niittechtree.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.niittechtree.model.ProfileImage;
import com.niit.niittechtree.model.User;
@EnableTransactionManagement
@Repository
public class ProfileImageDAOImpl implements ProfileImageDAO{

	
	@Autowired
	private SessionFactory sessionFactory;
	
	public ProfileImageDAOImpl(){
		
		
	}
	
	@Transactional
	public boolean insert(ProfileImage profileImage) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(profileImage);
		
		return false;
	}

	@Transactional
	public ProfileImage getProfileImageByUsername(String username) {
		// TODO Auto-generated method stub
		/*String hql = "from ProfileImage where username = '" + username + "'";
		Session session = sessionFactory.getCurrentSession();
		List<ProfileImage> profileImage = session.createQuery(hql).list();

		if (profileImage != null) {

			return profileImage.get(0);
		} else {
			return null;
		}*/
		return null;
	}

}
