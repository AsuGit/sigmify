package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Address;

public interface IAddressRepo extends JpaRepository<Address, Integer> {

}
