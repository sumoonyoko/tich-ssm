package com.tich.manage.core.service.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;

import com.tich.manage.core.dao.UserDao;
import com.tich.manage.core.entity.User;
import com.tich.manage.core.service.UserService;

public class ServiceDemoImp implements UserService{

	@Autowired
	private UserDao userDao;
	
	public User getUserById(String id) {
		return userDao.selectByPrimaryKey(id);
	}

}
