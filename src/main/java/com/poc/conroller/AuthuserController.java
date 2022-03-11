package com.poc.conroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthuserController {
	
	@GetMapping("/page")
	public String page() {
		return "Successfully Logged In !";
	}

}
