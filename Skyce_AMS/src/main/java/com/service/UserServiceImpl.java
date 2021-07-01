package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDAO;
import com.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	UserDAO doa;

	public User registerManager(User user) {
		return doa.registerManager(user);
	}
	
	

	public User registerAdmin(User user) {
		return doa.registerAdmin(user);
	}

	public String loginAdmin(String adminID, String password) {
		return doa.loginAdmin(adminID, password);
	}

	public String loginManager(String managerID, String password) {
		return doa.loginManager(managerID, password);
	}
	
	

	public List<User> listManagerRequest() {
		return doa.listManagerRequest();
	}
	
	public boolean deleteManager(int userId) {
		return doa.deleteManager(userId);
	}

	public boolean approveManager(int userID) {
		return doa.approveManager(userID);
	}
	

}
