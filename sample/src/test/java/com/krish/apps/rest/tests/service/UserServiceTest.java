package com.krish.apps.rest.tests.service;

import static org.junit.Assert.assertEquals;

import java.net.URISyntaxException;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.junit.Test;

import com.krish.apps.rest.constants.CommonConstants;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.test.framework.AppDescriptor;
import com.sun.jersey.test.framework.JerseyTest;
import com.sun.jersey.test.framework.WebAppDescriptor;


public class UserServiceTest extends JerseyTest{

	@Override
	protected AppDescriptor configure() {
		return new WebAppDescriptor.Builder().build();
	}
	
	@Test
	public void testAddUserSuccess() throws JSONException,
			URISyntaxException {
		WebResource webResource = client().resource("http://localhost:8080/");
		JSONObject json = webResource.path("/sample/user/add/krishan")
				.get(JSONObject.class);
		assertEquals(true, json.get("success"));
		assertEquals(CommonConstants.ADD_SUCCESS_MSG, json.get("message"));
	}

}
