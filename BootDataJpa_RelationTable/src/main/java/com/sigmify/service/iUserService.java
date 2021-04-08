package com.sigmify.service;

import java.util.List;

import com.sigmify.dto.UserDTO;
import com.sigmify.entity.User;

public interface iUserService {
	public Integer saveDataUsingParent(UserDTO user)throws Exception;
	public List<User> fetchAllUser();
	public User fetchSingleUser(Integer id);
	public void deleteUser(Integer id);
	public Integer updateUser(UserDTO userDto);

}
