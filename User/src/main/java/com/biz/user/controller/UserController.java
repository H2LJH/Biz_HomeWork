package com.biz.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.biz.user.service.UserService;

public class UserController 
{
	@Autowired
	private UserService uService;
	
	
	@RequestMapping(value = "/")
	public String main()
	{
		return "home";
	}
}
