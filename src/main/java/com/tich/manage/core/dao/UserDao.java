package com.tich.manage.core.dao;

import com.tich.manage.core.entity.User;

public interface UserDao {
	int deleteByPrimaryKey(String id);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
}
