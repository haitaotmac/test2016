package com.haitao.service;

import com.haitao.domain.User;

public interface IUserService {
	public void add(User user);
	
	public void edit(User user);
	
	public void delete(User user);
	
	public User findUserById(Integer id);
}
