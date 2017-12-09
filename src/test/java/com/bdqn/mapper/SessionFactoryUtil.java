package com.bdqn.mapper;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionFactoryUtil {

	private static SqlSessionFactory sessionFactory;
	
	static{
		init();
	}

	private static void init() {
		Reader reader  = null;
		try {
			reader = Resources.getResourceAsReader("mybatis-config.xml");
			sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	
	public static SqlSessionFactory geteSessionFactory() {
		return sessionFactory;
	}
	
	public static SqlSession getSession() {
		if(sessionFactory != null) {
			return sessionFactory.openSession();
		}
		
		return null;
	}
}
