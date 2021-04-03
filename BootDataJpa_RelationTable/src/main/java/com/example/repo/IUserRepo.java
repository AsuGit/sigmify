package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.User;

public interface IUserRepo extends JpaRepository<User, Integer> {

}
