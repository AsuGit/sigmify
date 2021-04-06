package com.sigmify.dto;

import java.io.Serializable;

import com.sigmify.entity.User;

public class AddressDTO implements Serializable {
	
	private String address;
	private String city_locality;
	private String district;
	private String state;
	private Integer pincode;
	private User user;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity_locality() {
		return city_locality;
	}
	public void setCity_locality(String city_locality) {
		this.city_locality = city_locality;
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	

}
