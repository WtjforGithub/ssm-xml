package com.ssm.service;

import com.ssm.dao.UserDAO;
import com.ssm.domain.User;

public class UserServiceImpl implements UserService {

	private UserDAO dao;
	
	public void setDao(UserDAO dao) {
		this.dao = dao;
	}


	@Override
	public void addUser(User user) {
		dao.inserUser(user);
	}

}
