package com.sigmify.control;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
			@RequestBody UserDTO userDto
			) throws Exception
	{
		
		/*UserDTO userDto=new UserDTO();
		AddressDTO addDto=new AddressDTO();
		userDto.setId(user.getId());
		userDto.setfName(user.getfName());
		userDto.setlName(user.getfName());
		userDto.setPhone(user.getPhone());
		userDto.setEmail(user.getEmail());
		userDto.setPassword(user.getPassword());
		userDto.setRepeatPassword(user.getRepeatPassword());*/
		//userDto.setAddresses(user.getAddresses());
		Integer id=service.saveDataUsingParent(userDto);
		return new ResponseEntity<String>("User data saved with id "+id,HttpStatus.OK);
	}
	@GetMapping("/getall")
	public ResponseEntity<List<UserDTO>> getUsers(@RequestBody User user){
		List<UserDTO> usersList=service.fetchAllUser();
		
		return new ResponseEntity<List<UserDTO>>(usersList,HttpStatus.OK);
		
	}
	@GetMapping("/get/{id}")
	public ResponseEntity<User>getSingleUser(@PathVariable Integer id){
		User user=service.fetchSingleUser(id);
		return new ResponseEntity<User>(user,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable Integer id){
		service.deleteUser(id);
		return new ResponseEntity<String>("User deleted with id "+id,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/adrs/{id}")
	public ResponseEntity<String> deleteAddress(@PathVariable Integer id){
		service.deleteAddress(id);
		return new ResponseEntity<String>("Address deleted with id "+id,HttpStatus.OK);
	}
	
	@PutMapping("/modify")
	public ResponseEntity<String> updateNewUser(
			@RequestBody UserDTO userDto
			) throws Exception{

		Integer id1=service.updateUser(userDto);
		return new ResponseEntity<String>("User updated with id "+id1,HttpStatus.OK);
		
	}
	
	

}
