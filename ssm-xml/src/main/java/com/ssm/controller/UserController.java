package com.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.ssm.domain.User;
import com.ssm.service.UserService;

public class UserController implements Controller {

	private UserService service;
	
	public void setService(UserService service) {
		this.service = service;
	}


	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String name = request.getParameter("name");
		String ageStr = request.getParameter("age");
		int age = Integer.parseInt(ageStr);
		String gender = request.getParameter("gender");
		
		User user = new User(name, age, gender);
		
		service.addUser(user);
		
		return new ModelAndView("/welcome.jsp");
	}

}
