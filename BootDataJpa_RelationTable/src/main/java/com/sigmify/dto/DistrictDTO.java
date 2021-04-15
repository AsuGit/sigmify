package com.sigmify.dto;

import java.io.Serializable;

public class DistrictDTO implements Serializable{
	private Integer id;
	private String name;
	private String description;
	private StateDTO stateDto;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public StateDTO getStateDto() {
		return stateDto;
	}
	public void setStateDto(StateDTO stateDto) {
		this.stateDto = stateDto;
	}
	
	

}
