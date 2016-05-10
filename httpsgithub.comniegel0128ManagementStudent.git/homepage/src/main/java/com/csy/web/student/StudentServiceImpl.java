package com.csy.web.student;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csy.web.mapper.StudentMapper;

@Service
public class StudentServiceImpl implements StudentService{
	private static final Logger LOGGER = LoggerFactory.getLogger(StudentService.class);
	@Autowired SqlSession session;
	@Autowired StudentBean student;
	@Override
	public int add(StudentBean StudentBean) {
		LOGGER.info("StudentServiceImpl: add");
		return 0;
	}

	@Override
	public List<StudentBean> list() {
		LOGGER.info("StudentServiceImpl: list");
		List<StudentBean> list = new ArrayList<StudentBean>();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		list = mapper.selectAll();
		LOGGER.info("서비스 학생수 :{}",list.size());
		return list;
	}

	@Override
	public List<StudentBean> getByName(StudentBean StudentBean) {
		LOGGER.info("StudentServiceImpl: getByName");
		return null;
	}

	@Override
	public StudentBean getById(StudentBean StudentBean) {
		LOGGER.info("StudentServiceImpl: getById");
		return null;
	}

	@Override
	public int count() {
		LOGGER.info("StudentServiceImpl: count");
		return 0;
	}

	@Override
	public int change(StudentBean StudentBean) {
		LOGGER.info("StudentServiceImpl: change");
		return 0;
	}

	@Override
	public int remove(StudentBean StudentBean) {
		LOGGER.info("StudentServiceImpl: remove");
		return 0;
	}


	@Override
	public StudentBean login(StudentBean stu) {
		// TODO Auto-generated method stub
		LOGGER.info("StudentServiceImpl:login");
		StudentMapper StudentMapper = session.getMapper(StudentMapper.class);
		student = StudentMapper.login(stu);
		if(student != null){
			LOGGER.info("StudentServiceImpl:login : login()  tjdrhd gn  id= {}",stu.getId());
			return student;
		} else {
			LOGGER.info("StudentServiceImpl:login 실패");
			return null;
		}
	}
}
