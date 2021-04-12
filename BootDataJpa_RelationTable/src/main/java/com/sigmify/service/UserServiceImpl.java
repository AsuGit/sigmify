package com.sigmify.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sigmify.dto.AddressDTO;
import com.sigmify.dto.AddressTypeDTO;
import com.sigmify.dto.UserDTO;
import com.sigmify.dto.UserTypeDTO;
import com.sigmify.entity.Address;
import com.sigmify.entity.AddressType;
import com.sigmify.entity.User;
import com.sigmify.entity.UserType;
import com.sigmify.repo.IAddressRepo;
import com.sigmify.repo.IAddressTypeRepo;
import com.sigmify.repo.IUserRepo;
import com.sigmify.repo.IUserTypeRepo;



@Service("userService")
public class UserServiceImpl implements iUserService {
	
	@Autowired
	private IUserRepo userRepo;
	@Autowired
	private IAddressRepo addressRepo;
	@Autowired
	private IUserTypeRepo userTypeRepo;
	@Autowired
	private IAddressTypeRepo addressTypeRepo;


	@Override
	public Integer saveDataUsingParent(UserDTO userDto)throws Exception {
		User newUser=new User();
		newUser.setId(userDto.getId());
		newUser.setfName(userDto.getfName());
		newUser.setlName(userDto.getlName());
		newUser.setPhone(userDto.getPhone());
		newUser.setEmail(userDto.getEmail());
		newUser.setPassword(userDto.getPassword());
		UserType userType=null;
		if(userDto.getUserTypeDto()!=null) {
			userType=userTypeRepo.findByName(userDto.getUserTypeDto().getName());
		}
		newUser.setUserType(userType);
		//BeanUtils.copyProperties(userDto, newUser);
		List<Address> listAddress=new ArrayList<Address>();
		for(AddressDTO adrsDto:userDto.getAddressesDto()) {
			Address adrs=new Address();
			adrs.setId(adrsDto.getId());
			adrs.setAddress(adrsDto.getAddress());
			adrs.setCityLocality(adrsDto.getCityLocality());
			adrs.setDistrict(adrsDto.getDistrict());
			adrs.setState(adrsDto.getState());
			adrs.setPincode(adrsDto.getPincode());
			AddressType addtype=null;
			if(adrsDto.getAddressTypeDto()!=null) {
				addtype=addressTypeRepo.findByName(adrsDto.getAddressTypeDto().getName());
			}
			adrs.setAddressType(addtype);
			
			//BeanUtils.copyProperties(adrsDto, adrs);
			listAddress.add(adrs);
		}
		newUser.setAddresses(listAddress);
		userRepo.save(newUser);
		return newUser.getId();

	}
	
	

	@Override
	public List<UserDTO> fetchAllUser() {
		List<User> listUser=userRepo.findAll();
		List<UserDTO> listUserDto=new ArrayList();
		for(User user:listUser) {
			UserDTO userDto=new UserDTO();
			userDto.setId(user.getId());
			userDto.setfName(user.getfName());
			userDto.setlName(user.getfName());
			userDto.setPhone(user.getPhone());
			userDto.setEmail(user.getEmail());
			userDto.setPassword(user.getPassword());
			/*UserType userType=null;
			if(user.getUserType()!=null) {
				userType=userTypeRepo.findByName(user.getUserType().getName());
			}
			userDto.setUserType(userType);*/
			UserTypeDTO uTdto= new UserTypeDTO();
			uTdto.setId(user.getUserType().getId());
			uTdto.setName(user.getUserType().getName());
			uTdto.setDesc(user.getUserType().getDesc());
			userDto.setUserTypeDto(uTdto);
			List<AddressDTO> listAddressDto=new ArrayList();
			for(Address adrs:user.getAddresses()) {
				AddressDTO adrsDto=new AddressDTO();
				adrsDto.setId(adrs.getId());
				adrsDto.setAddress(adrs.getAddress());
				adrsDto.setCityLocality(adrs.getCityLocality());
				adrsDto.setDistrict(adrs.getDistrict());
				adrsDto.setState(adrs.getState());
				adrsDto.setPincode(adrs.getPincode());
				 AddressTypeDTO aTdto = new AddressTypeDTO();
		    	 aTdto.setId(adrs.getAddressType().getId());
		    	 aTdto.setName(adrs.getAddressType().getName());
		    	 aTdto.setDesc(adrs.getAddressType().getDesc());
		    	 adrsDto.setAddressTypeDto(aTdto);
				listAddressDto.add(adrsDto);
			}
			userDto.setAddressesDto(listAddressDto);
			listUserDto.add(userDto);
		}
		return listUserDto ;
	}


	@Override
	public Integer updateUser(UserDTO userDto) {
		User user1=fetchSingleUser(userDto.getId());
		//BeanUtils.copyProperties(userDto, user1);
		user1.setId(userDto.getId());
		user1.setfName(userDto.getfName());
		user1.setlName(userDto.getlName());
		user1.setPhone(userDto.getPhone());
		user1.setEmail(userDto.getEmail());
		user1.setPassword(userDto.getPassword());
		UserType userType=null;
		if(userDto.getUserTypeDto()!=null) {
			userType=userTypeRepo.findByName(userDto.getUserTypeDto().getName());
		}
		user1.setUserType(userType);
		List<Address> listadress=new ArrayList();
		for(AddressDTO adrsDto:userDto.getAddressesDto()) {
			Address addrs=new Address();
			//BeanUtils.copyProperties(adrsDto, addrs);
			addrs.setId(adrsDto.getId());
			addrs.setAddress(adrsDto.getAddress());
			addrs.setCityLocality(adrsDto.getCityLocality());
			addrs.setDistrict(adrsDto.getDistrict());
			addrs.setState(adrsDto.getState());
			addrs.setPincode(adrsDto.getPincode());
			AddressType addtype=null;
			if(adrsDto.getAddressTypeDto()!=null) {
				addtype=addressTypeRepo.findByName(adrsDto.getAddressTypeDto().getName());
			}
			addrs.setAddressType(addtype);
			listadress.add(addrs);
		}
		
		
		user1.setAddresses(listadress);
		userRepo.save(user1);
		return user1.getId();
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
		if(userRepo.existsById(id)) {
			userRepo.deleteById(id);
		}
		
		
	}



	@Override
	public void deleteAddress(Integer id) {
		if(addressRepo.existsById(id)) {
			addressRepo.deleteById(id);
		}
		
		
		
	}

	

}
