package com.china.Maven.Maven_1.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.china.Maven.Maven_1.bean.User;
import com.china.Maven.Maven_1.dao.IuserDao;
import com.china.Maven.Maven_1.service.IuserService;

@Service("userService")
public class UserServiceImpl implements IuserService{

	@Resource
	private IuserDao userMapper;
	
	@Override
	public User queryUser(User user) {
		
		return userMapper.queryUser(user);
	}

}
