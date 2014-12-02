package com.krish.apps.rest.tests.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.krish.apps.rest.dao.impl.UserDAOImpl;

import domain.User;

public class UserDAOImplTest {
	 UserDAOImpl userDao = new UserDAOImpl();
	
	 
	    @Test
	    public void shouldReturnPopulatedUserNameList() {
	    	User user=new User();
	    	user.setName("test");
	    	boolean result = userDao.add(user);
	        assertTrue(result);
	 
	        List<User> userNameList = userDao.show();
	 
	        assertNotNull(userNameList);
	        assertTrue(userNameList.size() == 1);
	    }
	 
}
