package com.haitao.service.impl;

import com.haitao.dao.IUserDao;
import com.haitao.domain.User;
import com.haitao.service.IUserService;

public class UserServiceImpl implements IUserService{
	private IUserDao userDao;
	
	@Override
	public void add(User user) {
		this.userDao.addUser(user);
	}

	@Override
	public void delete(User user) {
		this.userDao.deleteUserById(user.getId());
	}

	@Override
	public void edit(User user) {
		this.userDao.editUser(user);
	}

	@Override
	public User findUserById(Integer id) {
		return this.userDao.findUserById(id);
	}

}
