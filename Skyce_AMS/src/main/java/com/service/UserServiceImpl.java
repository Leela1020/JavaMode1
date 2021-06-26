package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MainDAOIntf;
import com.model.User;

@Service
public class UserServiceImpl implements UserServiceIntf {
	@Autowired
	MainDAOIntf dao;
	public void registerAdmin(User user) {
		dao.registerAdmin(user);
	}
	

}
