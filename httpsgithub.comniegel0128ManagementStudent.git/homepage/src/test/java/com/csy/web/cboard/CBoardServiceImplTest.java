package com.csy.web.cboard;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.* ;

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
	@Autowired CBoardDTO cboard;
	@Autowired SqlSession SqlSession;
	
	@Test
	public void testList() {
		CBoardMapper mapper = SqlSession.getMapper(CBoardMapper.class);
		List<CBoardDTO> list = new ArrayList<CBoardDTO>();
		list = mapper.selectAll();
		assertThat(list.size(),is(not(0)));
	}
	
	@Test
	public void testgetById(){
		CBoardMapper mapper = SqlSession.getMapper(CBoardMapper.class);
		List<CBoardDTO> list = new ArrayList<CBoardDTO>();
		cboard.setRegUserId("cho");
		list = mapper.selectById(cboard);
		assertEquals("cho",cboard.getRegUserId());
	}
	
	@Test
	public void testgetByName(){
		CBoardMapper mapper = SqlSession.getMapper(CBoardMapper.class);
		List<CBoardDTO> list = new ArrayList<CBoardDTO>();
		cboard.setRegUserName("조조조");
		list = mapper.selectByName(cboard);
		assertEquals("조조조",cboard.getRegUserName());
	}
	
	@Test
	public void count(){
		CBoardMapper mapper = SqlSession.getMapper(CBoardMapper.class);
		int count = mapper.count();
		assertThat(count,is(not(0))); 
	}
	
	@Test
	public void testadd(){
		CBoardMapper mapper = SqlSession.getMapper(CBoardMapper.class);
		cboard.setTitle("테스트777");
		cboard.setDes("cboard내용777");
		cboard.setRegUserId("cho");
		cboard.setFileSrc1("cboard777.txt");
		cboard.setFileSrc2("cboard777.txt");
		cboard.setRegUserName("조조조");
		assertThat(mapper.insert(cboard),is(1));
	}
	
	@Test
	public void testchange(){
		CBoardMapper mapper = SqlSession.getMapper(CBoardMapper.class);
		cboard.setTitle("테스트변경");
		cboard.setDes("내용변경");
		cboard.setFileSrc1("test99.txt");
		cboard.setFileSrc2("test88.txt");
		cboard.setSeq(3);
		assertThat(mapper.update(cboard), is(1));
	}
	
	@Test
	public void testremove(){
		CBoardMapper mapper = SqlSession.getMapper(CBoardMapper.class);
		cboard.setSeq(2);
		assertThat(mapper.delete(cboard), is(1));
	}
}
