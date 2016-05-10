package com.csy.web.cboard;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.csy.web.mapper.CBoardMapper;


@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:META-INF/*-context.xml")
public class CBoardServiceImplTest {
	@Autowired CBoardBean CBoardBean;
	@Autowired SqlSession SqlSession;
	
	@Test
	public void testList() {
		CBoardMapper mapper = SqlSession.getMapper(CBoardMapper.class);
		List<CBoardBean> list = new ArrayList<CBoardBean>();
		list = mapper.selectAll();
		assertThat(list.size(),is(not(0)));
	}

}
