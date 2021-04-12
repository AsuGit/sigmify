package com.sigmify.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sigmify.entity.AddressType;

public interface IAddressTypeRepo extends JpaRepository<AddressType, Integer> {
	public AddressType findByName(String name);

}
