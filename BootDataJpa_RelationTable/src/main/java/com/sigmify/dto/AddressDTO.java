package com.sigmify.dto;

import java.io.Serializable;


public class AddressDTO implements Serializable {
	private Integer addId;
	private String address;
	private String cityLocality;
	private String district;
	private String state;
	private Integer pincode;
	private UserDTO userDto;
	
	public Integer getAddId() {
		return addId;
	}
	public void setAddId(Integer addId) {
		this.addId = addId;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCityLocality() {
		return cityLocality;
	}
	public void setCityLocality(String cityLocality) {
		this.cityLocality = cityLocality;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public UserDTO getUser() {
		return userDto;
	}
	public void setUser(UserDTO userDto) {
		this.userDto = userDto;
	}
	
	

}
