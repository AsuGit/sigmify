package com.sigmify.service;

import java.util.List;

import com.sigmify.dto.DistrictDTO;
import com.sigmify.dto.StateDTO;
import com.sigmify.entity.State;

public interface iDistrictService {
	public Integer saveStateData(StateDTO stateDto)throws Exception;
	//public List<StateDTO> fetchAllState();
	public StateDTO fetchSingleState(Integer id);
	public void deleteState(Integer id);
	//public void deleteDistrict(Integer id);
	public Integer updateState(StateDTO stateDto);
	//public Integer updateDistrict(DistrictDTO districtDto);
	
}
