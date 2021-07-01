package com.dao;

import java.util.List;

import com.model.User;

public interface UserDAO {
		public User registerAdmin(User user);
		public User registerManager(User user);
		public String loginAdmin(String adminID,String password);
		public String loginManager(String managerID,String password);
		public boolean approveManager(int userID);
		public List<User> listManagerRequest();
		public boolean deleteManager(int userID);
	}