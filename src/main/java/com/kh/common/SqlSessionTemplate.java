package com.kh.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionTemplate {
	public static SqlSession getSqlSession() {
		SqlSession session = null;
		String resource = "mybatis-config.xml";
		try {
			InputStream is = Resources.getResourceAsStream(resource);
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder(); 
			// 공장 만드는 기술자
			SqlSessionFactory factory = builder.build(is); // 공장 만들어짐
			// 공장 만들 때  xml 파일 참조해서 만듦
			session = factory.openSession();			   // 공장에서 연결 만들어줌
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return session; // 필요한 곳에서 가져다 쓸 수 있도록 리턴
	}
}
