package com.kgm.controller;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HOME_PAGE extends AbstractController {
	private String LOGIN_PAGE = "userHome";

	public HOME_PAGE() {
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName(LOGIN_PAGE);
		return mv;
	}

}
