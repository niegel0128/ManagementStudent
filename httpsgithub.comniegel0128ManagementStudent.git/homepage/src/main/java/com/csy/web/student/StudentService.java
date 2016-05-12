package com.csy.web.student;

import java.util.List;

public interface StudentService {
	public abstract int add(StudentDTO stu);
	public List<StudentDTO> list();
	public List<StudentDTO> getByName(StudentDTO StudentBean);
	public StudentDTO getById(StudentDTO StudentBean);
	public int count();
	public int change(StudentDTO StudentBean);
	public int remove(StudentDTO StudentBean);
	//////////////////////////////////////////
	public StudentDTO login(StudentDTO StudentBean);
	
}
