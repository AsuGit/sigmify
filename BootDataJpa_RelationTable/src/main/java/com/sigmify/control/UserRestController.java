package com.sigmify.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sigmify.dto.UserDTO;
import com.sigmify.entity.User;
import com.sigmify.service.iUserService;

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
		
		UserDTO userDto=new UserDTO();
		userDto.setId(user.getId());
		userDto.setfName(user.getfName());
		userDto.setlName(user.getfName());
		userDto.setPhone(user.getPhone());
		userDto.setEmail(user.getEmail());
		userDto.setPassword(user.getPassword());
		userDto.setRepeatPassword(user.getRepeatPassword());
		userDto.setAddresses(user.getAddresses());
		Integer id=service.saveDataUsingParent(userDto);
		return new ResponseEntity<String>("User data saved with id"+id,HttpStatus.OK);
	}

}
