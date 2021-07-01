package com.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.PlaneDAO;
import com.model.Plane;

@Service
@Transactional
public class PlaneServiceImpl implements PlaneService{
	@Autowired
	PlaneDAO dao;
	
	public int deletePlane(int planeNo) {
		return dao.deletePlane(planeNo);
	}
	public List<Plane> listPlanes(){
		return dao.listPlanes();
	}
	public int deallotPlane(int PlaneNo) {
	    return dao.deallotPlane(PlaneNo);
	}
	public int setHangarID(Plane plane) {
		return dao.setHangarID(plane);
	}
	
	public Plane getPlane(int planeNo) {
		return dao.getPlane(planeNo);
	}
	public Plane savePlane(Plane plane) {
		return dao.savePlane(plane);
	}
	public Plane updatePlane(Plane plane) {
		return dao.updatePlane(plane);
	}
	public List<Plane> getAvailablePlanes(){
		return dao.getAvailablePlanes();
	}

}
