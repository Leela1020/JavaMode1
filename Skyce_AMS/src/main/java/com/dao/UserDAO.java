package com.dao;

import com.model.User;

public interface UserDAO 
{
		public void registerAdmin(User user);
		public User registerManager();
		public User loginAdmin();
		public User loginManager();
}