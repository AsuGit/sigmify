package com.sigmify.dto;

import java.io.Serializable;


public class AddressDTO implements Serializable {
	private Integer Id;
	private String address;
	private String cityLocality;
	private String district;
	private String state;
	private Integer pincode;
	private Integer userDtoId;
	private AddressTypeDTO addressTypeDto;
	private boolean delete;
	
	public Integer getId() {
		return Id;
	}
	public boolean isDelete() {
		return delete;
	}
	public void setDelete(boolean delete) {
		this.delete = delete;
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
	
	public Integer getUserDtoId() {
		return userDtoId;
	}
	public void setUserDtoId(Integer userDtoId) {
		this.userDtoId = userDtoId;
	}
	public AddressTypeDTO getAddressTypeDto() {
		return addressTypeDto;
	}
	public void setAddressTypeDto(AddressTypeDTO addressTypeDto) {
		this.addressTypeDto = addressTypeDto;
	}
	

	
	
	

}
