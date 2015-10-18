package com.sl.web.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

public class RCAuthenticationEntryPoint implements AuthenticationEntryPoint {
	protected final Log logger = LogFactory.getLog(getClass());
	
	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException)
	throws IOException, ServletException {
		logger.debug("In RCAuthenticationEntryPoint");
		response.sendRedirect(request.getContextPath()+"/login");
	}

}
