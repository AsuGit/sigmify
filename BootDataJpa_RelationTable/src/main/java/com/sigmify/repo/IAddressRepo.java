package com.sigmify.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sigmify.entity.Address;

public interface IAddressRepo extends JpaRepository<Address, Integer> {

}
