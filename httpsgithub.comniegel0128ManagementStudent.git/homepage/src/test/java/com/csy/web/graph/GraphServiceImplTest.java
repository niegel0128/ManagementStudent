package com.csy.web.graph;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.csy.web.mapper.GraphMapper;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:META-INF/*-context.xml")
public class GraphServiceImplTest {
	@Autowired GraphDTO graph;
	@Autowired SqlSession SqlSession;
	
	@Test
	public void testList() {
		GraphMapper mapper = SqlSession.getMapper(GraphMapper.class);
		List<GraphDTO> list = new ArrayList<GraphDTO>();
		list = mapper.selectAll();
		assertThat(list.size(),is(not(0)));
	}
}
