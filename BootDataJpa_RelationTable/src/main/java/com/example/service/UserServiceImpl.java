package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repo.IAddressRepo;
import com.example.repo.IUserRepo;

@Service("userService")
public class UserServiceImpl implements iUserService {
	
	@Autowired
	private IUserRepo userRepo;
	@Autowired
	private IAddressRepo addressRepo;

	@Override
	public void saveDataUsingParent(User user) {
		User newUser=new User();
		newUser.setfName(user.getfName());
		newUser.setlName(user.getlName());
		newUser.setPhone(user.getPhone());
		newUser.setEmail(user.getEmail());
		newUser.setPassword(user.getPassword());
		newUser.setRepeat_password(user.getRepeat_password());
		newUser.setUser_type_id(user.getUser_type_id());
		userRepo.save(newUser);
		System.out.println("User details saved with id"+newUser.getId() );

	}

}
