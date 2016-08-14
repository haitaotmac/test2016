package com.haitao.dao.impl;

import com.haitao.dao.IUserDao;
import com.haitao.domain.User;

public class UserDaoImpl implements IUserDao{

	@Override
	public void addUser(User user) {
		System.out.println("add user into dba");
	}

	@Override
	public void editUser(User user) {
		System.out.println("modify user into dba");
	}

}
