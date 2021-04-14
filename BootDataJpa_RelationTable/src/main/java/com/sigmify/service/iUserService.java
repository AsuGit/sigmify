package com.sigmify.service;

import java.util.List;

import com.sigmify.dto.UserDTO;
import com.sigmify.entity.User;

public interface iUserService {
	public Integer saveDataUsingParent(UserDTO user)throws Exception;
	public List<UserDTO> fetchAllUser();
	public User fetchSingleUser(Integer id);
	public void deleteUser(Integer id);
	public void deleteAddress(Integer id);
	public Integer updateUser(UserDTO userDto);
	public Integer updateAddress(UserDTO userDto);

}
