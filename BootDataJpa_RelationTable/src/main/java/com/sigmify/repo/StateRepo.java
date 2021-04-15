package com.sigmify.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sigmify.entity.State;

public interface StateRepo extends JpaRepository<State,Integer> {
	public State findByName(String name);

}
