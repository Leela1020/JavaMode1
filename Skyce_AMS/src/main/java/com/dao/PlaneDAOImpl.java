package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.model.Plane;
@Qualifier("plane")
@Repository
public class PlaneDAOImpl implements PlaneDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	public void savePlane(Plane plane) 
	{
		sessionFactory.openSession().save(plane);
		
	}
	public List<Plane> getPlane()
	{
		List<Plane> ls=sessionFactory.openSession().createQuery("from Plane").list();
		return ls;
	}
	
/*	public void addingPlanes(Plane plane) {
		// TODO Auto-generated method stub
		
	} */
	

}
