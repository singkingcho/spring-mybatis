package com.bdqn.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestUserMapper {

	@Test
	public void testSelectUserAndRoleById () {
		// 如果查出一条是可以的，如果查出了多条那就不可以，应为这里是1对1的关系
		
		SqlSession session =  SessionFactoryUtil.getSession();
		UsersMapper mapper = session.getMapper(UsersMapper.class);
		
	}
	
	 
	

 
}
