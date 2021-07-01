package com.service;

import java.util.List;

import com.model.Plane;

public interface PlaneService {
	public Plane updatePlane(Plane plane);
	public Plane getPlane(int planeNo);
	public Plane savePlane(Plane plane);
	public List<Plane> listPlanes();
	public int deletePlane(int planeNo);
	public List<Plane> getAvailablePlanes();
	public int setHangarID(Plane plane);
	public int deallotPlane(int planeNo);
}
