package com.dao;

import com.model.Plane;
import com.model.User;

public interface MainDAOIntf {

	public void registerAdmin(User user);
	public User registerManager();
	public User loginAdmin();
	public User loginManager();
	public void savePlane(Plane plane);
	
}
