package com.dao;

import java.util.List;

import com.model.Plane;

public interface PlaneDAO {
	public List<Plane> listPlanes();
	public Plane savePlane(Plane plane);
	public Plane updatePlane(Plane plane);
	public Plane getPlane(int planeNo);
	public int deletePlane(int planeNo);
	public List<Plane> getAvailablePlanes();
	public int setHangarID(Plane plane);
	public int deallotPlane(int planeNo);
}
