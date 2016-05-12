 package com.csy.web.mapper;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.csy.web.student.StudentDTO;
@Repository
public interface StudentMapper {
	public int insert(StudentDTO StudentDTO);
	public List<StudentDTO> selectAll();
	public List<StudentDTO> selectByName(StudentDTO StudentDTO);
	public StudentDTO selectById(StudentDTO StudentDTO);
	public int count();
	public int update(StudentDTO StudentDTO);
	public int delete(StudentDTO StudentDTO);
	//////////////////////////////////////////
	
	public StudentDTO login(StudentDTO StudentDTO);
	public StudentDTO signup(StudentDTO stu);
}
