package com.sigmify.entity;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author Dell
 *
 */

@Entity
@Table(name = "address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
	private String address;
	private String cityLocality;
	private String district;
	private String state;
	private Integer pincode;
	
	@ManyToOne(targetEntity = User.class,cascade = CascadeType.PERSIST)
	@JoinColumn(name = "user_id",referencedColumnName = "id" )
	private User user;
	
	@ManyToOne(targetEntity = AddressType.class,cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinColumn(name = "address_type_id",referencedColumnName = "id")
	private AddressType addressType;
	
	
	public AddressType getAddressType() {
		return addressType;
	}
	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
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
	public Integer getId() {
		return Id;
	}
	public void setId(Integer Id) {
		this.Id = Id;
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
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	@Override
	public String toString() {
		return "Address [address=" + address + ", cityLocality=" + cityLocality + ", district=" + district
				+ ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
	

}
