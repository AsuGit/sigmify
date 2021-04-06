package com.sigmify.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sigmify.dto.UserDTO;
import com.sigmify.entity.User;
import com.sigmify.repo.IAddressRepo;
import com.sigmify.repo.IUserRepo;

import net.bytebuddy.asm.Advice.Return;

@Service("userService")
public class UserServiceImpl implements iUserService {
	
	@Autowired
	private IUserRepo userRepo;
	@Autowired
	private IAddressRepo addressRepo;

	@Override
	public Integer saveDataUsingParent(UserDTO user) {
		User newUser=new User();
		newUser.setfName(user.getfName());
		newUser.setlName(user.getlName());
		newUser.setPhone(user.getPhone());
		newUser.setEmail(user.getEmail());
		newUser.setPassword(user.getPassword());
		newUser.setRepeatPassword(user.getRepeatPassword());
		newUser.setAddresses(user.getAddresses());
		userRepo.save(newUser);
		return newUser.getId();

	}

}
