package com.bikash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ActuatorController {
	@GetMapping("/hello")
	public String helloUser() {
		return "hello User";
	}

}
