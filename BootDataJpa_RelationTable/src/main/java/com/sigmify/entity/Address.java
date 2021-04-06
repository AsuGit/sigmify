package com.sigmify.entity;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "ADDRESS_MAP")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer addId;
	private String address;
	private String cityLocality;
	private String district;
	private String state;
	private Integer pincode;
	
	@ManyToOne(targetEntity = User.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id",referencedColumnName = "id" )
	private User user;
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
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
	public void setCity_locality(String cityLocality) {
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
	
	
	
	@Override
	public String toString() {
		return "Address [address=" + address + ", cityLocality=" + cityLocality + ", district=" + district
				+ ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
	

}
