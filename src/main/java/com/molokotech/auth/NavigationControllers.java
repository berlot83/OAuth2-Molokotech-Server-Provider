package com.molokotech.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationControllers {
	@GetMapping("/")
	public String index() {
		return "index";
	}
}
