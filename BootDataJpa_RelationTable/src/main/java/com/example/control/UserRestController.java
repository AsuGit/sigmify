package com.example.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.iUserService;

@RestController
@RequestMapping("/user")
public class UserRestController {
	
	@Autowired
	private iUserService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveUser(
			@RequestBody User user
			)
	{
		service.saveDataUsingParent(user);
		return new ResponseEntity<String>(HttpStatus.OK);
	}

}
