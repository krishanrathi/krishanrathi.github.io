package com.krish.apps.rest.dao.impl;


import java.util.List;

import com.krish.apps.rest.cache.UserCache;
import com.krish.apps.rest.dao.UserDAO;

import domain.User;

public class UserDAOImpl implements UserDAO {

	public List<User> show() {
		return UserCache.userNameList;
	}

	public boolean add(User user) {
		UserCache.userNameList.add(user);
		return true;
	}

}
