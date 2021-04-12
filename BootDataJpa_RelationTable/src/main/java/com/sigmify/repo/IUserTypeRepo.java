package com.sigmify.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sigmify.entity.UserType;

public interface IUserTypeRepo extends JpaRepository<UserType, Integer> {
	public UserType findByName(String name);

}
