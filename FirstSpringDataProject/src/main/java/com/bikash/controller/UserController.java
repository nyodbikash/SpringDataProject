package com.bikash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("/")
	public String homePage() {
		System.out.println("From User controller class");
		return "home.jsp";
	}

}
