package com.sigmify.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sigmify.dto.AddressDTO;
import com.sigmify.dto.UserDTO;
import com.sigmify.entity.Address;
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
	public Integer saveDataUsingParent(UserDTO userDto)throws Exception {
		User newUser=new User();
		/*newUser.setfName(userDto.getfName());
		newUser.setlName(userDto.getlName());
		newUser.setPhone(userDto.getPhone());
		newUser.setEmail(userDto.getEmail());
		newUser.setPassword(userDto.getPassword());
		newUser.setRepeatPassword(userDto.getRepeatPassword());
		newUser.setAddresses(userDto.getAddresses());*/
		BeanUtils.copyProperties(userDto, newUser);
		List<Address> listAddress=new ArrayList<Address>();
		for(AddressDTO adrsDto:userDto.getAddresses()) {
			Address adrs=new Address();
			BeanUtils.copyProperties(adrsDto, adrs);
			listAddress.add(adrs);
		}
		newUser.setAddresses(listAddress);
		userRepo.save(newUser);
		return newUser.getId();

	}

	@Override
	public List<User> fetchAllUser() {
		
		return userRepo.findAll();
	}

	@Override
	public User fetchSingleUser(Integer id) {
		Optional<User> opt=userRepo.findById(id);
		User user=null;
		if(opt.isPresent()) {
			user=opt.get();
		}
		
		return user;
	}

	@Override
	public void deleteUser(Integer id) {
		User user=fetchSingleUser(id);
		userRepo.delete(user);
		
	}

}
