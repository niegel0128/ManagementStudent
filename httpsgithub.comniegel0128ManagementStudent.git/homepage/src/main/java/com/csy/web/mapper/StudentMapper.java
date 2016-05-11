 package com.csy.web.mapper;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.csy.web.student.StudentBean;
@Repository
public interface StudentMapper {
	public int insert(StudentBean StudentBean);
	public List<StudentBean> selectAll();
	public List<StudentBean> selectByName(StudentBean StudentBean);
	public StudentBean selectById(StudentBean StudentBean);
	public int count();
	public int update(StudentBean StudentBean);
	public int delete(StudentBean StudentBean);
	//////////////////////////////////////////
	
	public StudentBean login(StudentBean StudentBean);
	public StudentBean signup(StudentBean stu);
}
