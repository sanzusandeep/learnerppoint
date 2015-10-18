package com.sl.web.security;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

public class RCAuthenticationProvider implements AuthenticationProvider {

	
	protected final Log logger = LogFactory.getLog(getClass());
	
	@Override
	public Authentication authenticate(Authentication arg0)
			throws AuthenticationException {
		logger.debug("In authenticate");
		return null;
	}

	@Override
	public boolean supports(Class<? extends Object> arg0) {
		return false;
	}

}
