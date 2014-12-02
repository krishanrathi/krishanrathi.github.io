package com.krish.apps.rest.dao;

import java.util.List;

import domain.User;

public interface UserDAO {
	List<User> show();

	boolean add(User user);
}