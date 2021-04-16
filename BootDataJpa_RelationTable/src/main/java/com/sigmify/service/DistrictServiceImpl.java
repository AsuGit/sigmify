package com.sigmify.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sigmify.dto.DistrictDTO;
import com.sigmify.dto.StateDTO;
import com.sigmify.entity.District;
import com.sigmify.entity.State;
import com.sigmify.repo.DistrictRepo;
import com.sigmify.repo.StateRepo;


@Service("districtService")
public class DistrictServiceImpl implements iDistrictService {
	
	@Autowired
	private StateRepo stateRepo;
	@Autowired
	private DistrictRepo districtRepo;
	


	@Override
	public Integer saveStateData(StateDTO stateDto)throws Exception {
		State state1=new State();
		//copy properties from UserDTO to User
		state1.setId(stateDto.getId());
		state1.setName(stateDto.getName());
		state1.setDescription(stateDto.getDescription());
		//BeanUtils.copyProperties(userDto, newUser);
		List<District> listDistrict=new ArrayList<District>();
		for(DistrictDTO districtDto:stateDto.getDistrictDtos()) {
			District district=new District();
			//copy properties from AddressDTO to Address
			district.setId(districtDto.getId());
			district.setName(districtDto.getName());
			district.setDescription(districtDto.getDescription());
			/*State state=null;
			if(districtDto.getStateDto()!=null) {
				state=stateRepo.findByName(stateDto.getName());
			}
			district.setState(state);*/
			//BeanUtils.copyProperties(adrsDto, adrs);
			//add address to AddressList
			listDistrict.add(district);
		}
		state1.setDistricts(listDistrict);
		stateRepo.save(state1);
		return state1.getId();
	}

	/*@Override
	public List<UserDTO> fetchAllUser() {
		List<User> listUser=userRepo.findAll();
		List<UserDTO> listUserDto=new ArrayList();
		for(User user:listUser) {
			UserDTO userDto=new UserDTO();
			//copy properties from user to userDto
			userDto.setId(user.getId());
			userDto.setfName(user.getfName());
			userDto.setlName(user.getfName());
			userDto.setPhone(user.getPhone());
			userDto.setEmail(user.getEmail());
			userDto.setPassword(user.getPassword());
			UserTypeDTO uTdto= new UserTypeDTO();
			uTdto.setId(user.getUserType().getId());
			uTdto.setName(user.getUserType().getName());
			uTdto.setDesc(user.getUserType().getDesc());
			userDto.setUserTypeDto(uTdto);
			List<AddressDTO> listAddressDto=new ArrayList();
			for(Address adrs:user.getAddresses()) {
				AddressDTO adrsDto=new AddressDTO();
				//copy properties from Address to AddressDTO 
				adrsDto.setId(adrs.getId());
				adrsDto.setAddress(adrs.getAddress());
				adrsDto.setCityLocality(adrs.getCityLocality());
				adrsDto.setDistrict(adrs.getDistrict());
				adrsDto.setState(adrs.getState());
				adrsDto.setPincode(adrs.getPincode());
				adrsDto.setUserDtoId(userDto.getId());
				 AddressTypeDTO aTdto = new AddressTypeDTO();
		    	 aTdto.setId(adrs.getAddressType().getId());
		    	 aTdto.setName(adrs.getAddressType().getName());
		    	 aTdto.setDesc(adrs.getAddressType().getDesc());
		    	 adrsDto.setAddressTypeDto(aTdto);
		    	 //add AddressDTO to AddressDTOList
				listAddressDto.add(adrsDto);
			}
			userDto.setAddressesDto(listAddressDto);
			//add UserDTO to UserDTOList
			listUserDto.add(userDto);
		}
		return listUserDto ;
	}*/
	
	
	@Override
	public Integer updateState(StateDTO stateDto) {
		Optional<State> opt=stateRepo.findById(stateDto.getId());
		State state=null;
		if(opt.isPresent()) {
			state=opt.get();
		}
		List<DistrictDTO> districtDtoList=new ArrayList();
		for(DistrictDTO districtDto:stateDto.getDistrictDtos()) {
			District district=null;
			
		}

	
		
		stateRepo.save(state);
		return state.getId();
	}
	
	@Override
	public StateDTO fetchSingleState(Integer id) {
		Optional<State> opt=stateRepo.findById(id);
		State state=null;
		if(opt.isPresent()) {
			state=opt.get();
		}
		StateDTO stateDto=new StateDTO();
		stateDto.setId(state.getId());
		stateDto.setName(state.getName());
		stateDto.setDescription(state.getDescription());
		List<DistrictDTO> districtDtoList=new ArrayList();
		for(District district:state.getDistricts()) {
			DistrictDTO districtDto=new DistrictDTO();
			districtDto.setId(district.getId());
			districtDto.setName(district.getName());
			districtDto.setDescription(district.getDescription());
			districtDtoList.add(districtDto);
		}
		stateDto.setDistrictDtos(districtDtoList);
		return stateDto;
	}
	
	@Override
	public void deleteState(Integer id) {
		if(stateRepo.existsById(id)) {
			stateRepo.deleteById(id);
		}
	}
	
	/*@Override
	public void deleteAddress(Integer id) {
		if(addressRepo.existsById(id)) {
			addressRepo.deleteById(id);
		}
	}
	
	@Override
	public Integer updateAddress(UserDTO userDto) {
		Optional<User> opt=userRepo.findById(userDto.getId());
		User user=null;
		if(opt.isPresent()) {
			user=opt.get();
		}
		List<Address> listadress=new ArrayList();
		for(AddressDTO adrsDto:userDto.getAddressesDto()) {
			Address  addrs =null;
			if(adrsDto.getId()!=null) {
				Optional<Address> opt1=addressRepo.findById(adrsDto.getId());
				if(opt.isPresent()) {
					addrs=opt1.get();
					if(addrs!=null && adrsDto.isDelete()) {
						addressRepo.delete(addrs);
						continue;
					} 
					if(addrs!=null && adrsDto.getAddress()!=null) {
						addrs.setAddress(adrsDto.getAddress());
						addrs.setCityLocality(adrsDto.getCityLocality());
						addrs.setPincode(adrsDto.getPincode());
						addrs.setDistrict(adrsDto.getDistrict());
					}
				}
				
			}
			else {
			addrs=new Address();
			//copy properties from AddressDTO to Address 
			//BeanUtils.copyProperties(adrsDto, addrs);
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
			//add Address to AddressList
			listadress.add(addrs);
			
			}//else
			
	      // addressRepo.save(addrs);
			
		}//for
		for(Address adrs1:user.getAddresses()) {
			listadress.add(adrs1);
		}
		user.setAddresses(listadress);
		userRepo.save(user);
		return user.getId();
	}
	*/
}
