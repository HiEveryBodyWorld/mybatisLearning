package com.iot.mybatis.first;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.iot.mybatis.po.User;

public class MybatisFirst {
	
	@Test
	public void findUserByIdTest() throws IOException{
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		User user = sqlSession.selectOne("test.findUserById",1);
		
		System.out.print(user);
		
		sqlSession.close();
	
	}

}
