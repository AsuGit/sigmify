package com.sigmify.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sigmify.entity.District;
import com.sigmify.entity.State;

public interface DistrictRepo extends JpaRepository<District, Integer> {
	public District findByName(String name);

}
