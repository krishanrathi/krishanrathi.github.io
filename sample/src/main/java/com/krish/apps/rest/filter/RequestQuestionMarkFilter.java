/**
 * 
 */
package com.krish.apps.rest.filter;

import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerRequestFilter;

/**
 * @author krathi
 *
 */
public class RequestQuestionMarkFilter implements ContainerRequestFilter {

	/* (non-Javadoc)
	 * @see com.sun.jersey.spi.container.ContainerRequestFilter#filter(com.sun.jersey.spi.container.ContainerRequest)
	 */
	public ContainerRequest filter(ContainerRequest request) {
		String requestUri = request.getRequestUri().toString();
		if(!requestUri.contains("=")){
	        requestUri = requestUri.replace('?', '/');
	        request.setUris(request.getBaseUri(), UriBuilder.fromUri(requestUri).build());
		}
        return request;
	}

}
