package com.service;

import java.util.List;

import com.model.User;

public interface UserService {
	public User registerAdmin(User user);
	public User registerManager(User user);
	public String loginAdmin(String adminID,String password);
	public String loginManager(String managerID,String password);
	public List<User> listManagerRequest();
	public boolean approveManager(int userID);
	public boolean deleteManager(int userId);
}
