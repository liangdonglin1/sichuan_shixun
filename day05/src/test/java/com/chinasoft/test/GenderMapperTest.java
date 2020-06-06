package com.chinasoft.test;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.chinasoft.mapper.GenderMapper;
import com.chinasoft.pojo.Gender;
import com.chinasoft.util.SessionUtil;

public class GenderMapperTest {
	public SqlSessionFactory factory = SessionUtil.getSession();

	@Test
	public void testSelectGenderWithUser() {
		SqlSession session = factory.openSession();
		GenderMapper mapper = session.getMapper(GenderMapper.class);
		Gender gender = mapper.selectGenderWithUser(1);
		System.out.println(gender);
		session.close();
	}

}
