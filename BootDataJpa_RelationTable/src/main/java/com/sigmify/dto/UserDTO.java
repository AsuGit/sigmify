package com.sigmify.dto;

import java.io.Serializable;
import java.util.List;

import com.sigmify.entity.UserType;



public class UserDTO implements Serializable {
	
	private Integer id;
	private String fName;
	private String lName;
	private Long phone;
	private String email;
	private String password;
	private List<AddressDTO> addressesDto;
	private UserTypeDTO userTypeDto;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public List<AddressDTO> getAddressesDto() {
		return addressesDto;
	}
	public void setAddressesDto(List<AddressDTO> addressesDto) {
		this.addressesDto = addressesDto;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserTypeDTO getUserTypeDto() {
		return userTypeDto;
	}
	public void setUserTypeDto(UserTypeDTO userTypeDto) {
		this.userTypeDto = userTypeDto;
	}
	
	
	
	

}
