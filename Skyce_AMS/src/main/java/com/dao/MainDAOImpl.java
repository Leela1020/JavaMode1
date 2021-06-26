package com.dao;

import java.util.List;
import java.util.Random;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Plane;
import com.model.User;
@Repository
public class MainDAOImpl implements MainDAOIntf {
	@Autowired
	SessionFactory sessionFactory;

	
	public void registerAdmin(User user) {
		String ID=generateID();
		user.setAdminID(ID);
		sessionFactory.openSession().save(user);
		
	}
	public static String generateID() {
		String ID="";
		Random random=new Random();
		for (int i=0;i<5;i++) {
		@SuppressWarnings("deprecation")
		String num=new Integer(random.nextInt(10-0)+0).toString();
		ID=ID+num;}
		return ID;
	}
	
	public User registerManager() {
		
		return null;
	}

	
	public User loginAdmin() {
		
		return null;
	}

	
	public User loginManager() {
		
		return null;
	}

	public void savePlane(Plane plane) {
		sessionFactory.openSession().save(plane);
		
	}
	public List<Plane> getPlane()
	{
		@SuppressWarnings("unchecked")
		List<Plane> ls=sessionFactory.openSession().createQuery("from Plane").list();
		return ls;
	}
	
	
}
