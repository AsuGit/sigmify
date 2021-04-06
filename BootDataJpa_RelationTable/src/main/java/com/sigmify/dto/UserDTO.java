package com.sigmify.dto;

import java.io.Serializable;
import java.util.List;



public class UserDTO implements Serializable {
	
	private Integer id;
	private String fName;
	private String lName;
	private Long phone;
	private String email;
	private String password;
	private String repeatPassword;
	private List<AddressDTO> addressesDto;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
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
	public String getRepeatPassword() {
		return repeatPassword;
	}
	public void setRepeatPassword(String repeatPassword) {
		this.repeatPassword = repeatPassword;
	}
	public List<AddressDTO> getAddresses() {
		return addressesDto;
	}
	public void setAddresses(List<AddressDTO> addressesDto) {
		this.addressesDto = addressesDto;
	}
	
	

}
