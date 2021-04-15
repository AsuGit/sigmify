package com.sigmify.dto;

import java.io.Serializable;
import java.util.List;

public class StateDTO implements Serializable {
	private Integer id;
	private String name;
	private String description;
	private List<DistrictDTO> districtDtos;
	
	public List<DistrictDTO> getDistrictDtos() {
		return districtDtos;
	}
	public void setDistrictDtos(List<DistrictDTO> districtDtos) {
		this.districtDtos = districtDtos;
	}
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
	
	

}
