package com.sl.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;




@Controller


public class LoginController {

	@RequestMapping(value="/defaultLogin", method= RequestMethod.GET)
	public ModelAndView getDefaultLoginPage() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		return mav;
	}

}