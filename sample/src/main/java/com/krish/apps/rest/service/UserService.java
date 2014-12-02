package com.krish.apps.rest.service;

import java.util.List;

import domain.Response;
import domain.User;

public interface UserService {

	Response addUser(String name);

	List<User> showUsers();

}
