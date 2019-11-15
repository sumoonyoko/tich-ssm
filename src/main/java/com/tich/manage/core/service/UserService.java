package com.tich.manage.core.service;

import com.tich.manage.core.entity.User;

public interface UserService {
	
	/**
	 * 根据ID获取用户信息
	 */
	public User getUserById(String id);
}	
