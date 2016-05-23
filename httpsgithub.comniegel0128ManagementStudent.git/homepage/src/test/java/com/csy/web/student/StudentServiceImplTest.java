package com.csy.web.student;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.csy.web.mapper.StudentMapper;
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:META-INF/*-context.xml")
public class StudentServiceImplTest {
	@Autowired StudentDTO StudentBean;
	@Autowired SqlSession SqlSession;
	@Test
	public void testList() {
		StudentMapper mapper = SqlSession.getMapper(StudentMapper.class);
		List<StudentDTO> list = new ArrayList<StudentDTO>();
		list = mapper.selectAll();
		assertThat(list.size(),is(not(0)));
	}
	
	
}
