package com.krish.apps.rest.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.krish.apps.rest.constants.CommonConstants;
import com.krish.apps.rest.dao.UserDAO;
import com.krish.apps.rest.dao.impl.UserDAOImpl;

import domain.Response;
import domain.User;

@Path(CommonConstants.USERSERVICE_PATH)
public class UserServiceImpl implements UserService{
	UserDAO userDAO = new UserDAOImpl();
	@GET
	@Path(CommonConstants.ADD_OPERATION_PATH)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addUser(
			@PathParam(CommonConstants.ADD_OPERATION_PARAM) String name) {
		User user = new User();
		user.setName(name);
		boolean success = userDAO.add(user);
		Response response = new Response();
		response.setSuccess(success);
		response.setMessage(CommonConstants.ADD_SUCCESS_MSG);
		return response;
	}
	@GET
	@Path(CommonConstants.SHOW_OPERATION_PATH)
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> showUsers() {
		return userDAO.show();
	}
}
