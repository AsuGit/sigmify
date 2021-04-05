package com.sigmify.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sigmify.entity.User;
import com.sigmify.repo.IAddressRepo;
import com.sigmify.repo.IUserRepo;

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
		newUser.setRepeat_password(user.getRepeatPassword());
		userRepo.save(newUser);
		System.out.println("User details saved with id"+newUser.getId() );

	}

}
