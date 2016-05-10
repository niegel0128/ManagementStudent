package com.csy.web.attend;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.csy.web.mapper.AttendMapper;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:META-INF/*-context.xml")

public class AttendServiceImplTest {
	@Autowired AttendBean AttnedBean;
	@Autowired SqlSession SqlSession;
	
	@Test
	public void test() {
		AttendMapper mapper = SqlSession.getMapper(AttendMapper.class);
		List<AttendBean> list = new ArrayList<AttendBean>();
		list = mapper.selectAll();
		assertThat(list.size(),is(not(0)));
	}

}
