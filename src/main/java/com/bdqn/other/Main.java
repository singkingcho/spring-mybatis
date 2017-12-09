package com.bdqn.other;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bdqn.action.UserService;

public class Main {

	
	@SuppressWarnings("resource")
	@Test
	public void m1() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
//		UserService userService =  (UserService) ctx.getBean("userService");
//		userService.add();
//		SqlSession session =  SessionFactoryUtil.getSession();
//		UsersMapper mapper = session.getMapper(UsersMapper.class);
//		mapper.selectByPrimaryKey(1);
		UserService ua = (UserService) ctx.getBean("userService");
		System.out.println(ua+"((((((((((((((((((((((((((((((((((((((((((((((((((((((");
		ua.select();
	}
}


