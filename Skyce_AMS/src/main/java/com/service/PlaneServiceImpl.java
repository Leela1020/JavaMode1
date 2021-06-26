package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.dao.PlaneDAO;
import com.model.Plane;
@Service
@Qualifier
public class PlaneServiceImpl implements PlaneService{

	@Autowired
	PlaneDAO dao;
	
	public void addingPlanes(Plane plane)
	{
		dao.savePlane(plane);
		
	}

}
