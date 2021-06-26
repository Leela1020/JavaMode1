package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDAO;
import com.model.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDAO dao;
	public void registerAdmin(User user) {
		dao.registerAdmin(user);
	}
	

}
