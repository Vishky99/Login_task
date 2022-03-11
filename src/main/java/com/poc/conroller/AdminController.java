package com.poc.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.model.Authuser;
import com.poc.repository.AuthuserRepository;

@RestController
@RequestMapping("/secure")
public class AdminController {
	
	@Autowired
	private AuthuserRepository userRep;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@PostMapping("/add")
	public String addUser(@RequestBody Authuser user) {
		String pwd = user.getPassword();
		String encpwd = passwordEncoder.encode(pwd);
		user.setPassword(encpwd);
		userRep.save(user);
		return "User added successfully";
	}

}
