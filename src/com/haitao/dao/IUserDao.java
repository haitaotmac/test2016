package com.haitao.dao;

import com.haitao.domain.User;

public interface IUserDao {
	public void addUser(User user);
	
	public void editUser(User user);
	
	public User findUserById(Integer id);
	
	public void deleteUserById(Integer id);
}
