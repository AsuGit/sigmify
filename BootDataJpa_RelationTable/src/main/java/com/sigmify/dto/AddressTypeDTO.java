package com.sigmify.dto;

import java.io.Serializable;

public class AddressTypeDTO implements Serializable {
	private Integer id;
	private String name;
	private String desc;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
