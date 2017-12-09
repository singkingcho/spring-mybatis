package com.bdqn.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.bdqn.bean.Users;
import com.bdqn.mapper.UsersMapper;


@Service 
public class UserService {

//	
	@Autowired
	private UsersMapper usersMapper;
	
	
	
	public void select() {
		Users u =  usersMapper.selectByPrimaryKey(2);
		System.out.println(u);
	}
}
