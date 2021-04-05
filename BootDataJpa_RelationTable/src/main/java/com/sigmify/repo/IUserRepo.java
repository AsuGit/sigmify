package com.sigmify.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sigmify.entity.User;

public interface IUserRepo extends JpaRepository<User, Integer> {

}
