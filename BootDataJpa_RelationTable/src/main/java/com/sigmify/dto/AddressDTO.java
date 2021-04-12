package com.sigmify.dto;

import java.io.Serializable;


public class AddressDTO implements Serializable {
	private Integer Id;
	private String address;
	private String cityLocality;
	private String district;
	private String state;
	private Integer pincode;
	private UserDTO userDto;
	private AddressTypeDTO addressTypeDto;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer Id) {
		this.Id = Id;
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
	public UserDTO getUserDto() {
		return userDto;
	}
	public void setUserDto(UserDTO userDto) {
		this.userDto = userDto;
	}
	public AddressTypeDTO getAddressTypeDto() {
		return addressTypeDto;
	}
	public void setAddressTypeDto(AddressTypeDTO addressTypeDto) {
		this.addressTypeDto = addressTypeDto;
	}
	

	
	
	

}
