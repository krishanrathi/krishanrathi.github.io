package com.krish.apps.rest.cache;

import java.util.ArrayList;
import java.util.List;

import domain.User;

public class UserCache {

	private static UserCache userCache;
	public static List<User> userNameList = new ArrayList<User>();

	private UserCache() {
	}

	public static UserCache getInstance() {
		if (userCache == null)
			userCache = new UserCache();

		return userCache;
	}
}
