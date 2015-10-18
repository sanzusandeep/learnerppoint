package com.sl.web.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.web.filter.GenericFilterBean;

public class RCAuthenticationFilter extends GenericFilterBean{

	protected final Log logger = LogFactory.getLog(getClass());
	
	  private AuthenticationManager authenticationManager; 
	  private AuthenticationFailureHandler failureHandler = new SimpleUrlAuthenticationFailureHandler(); 
	  
	  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException { 
	    Authentication authentication = SecurityContextHolder.getContext().getAuthentication(); 
	  
	    logger.debug("in doFilter");
	    chain.doFilter(request, response); 
	  } 
	  
	  public void setAuthenticationManager(AuthenticationManager authenticationManager) { 
	    this.authenticationManager = authenticationManager; 
	  } 
	  
	  public void setFailureHandler(AuthenticationFailureHandler failureHandler) { 
	    this.failureHandler = failureHandler; 
	  } 
}
