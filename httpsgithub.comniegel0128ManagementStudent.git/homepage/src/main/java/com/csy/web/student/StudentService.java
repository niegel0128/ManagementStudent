package com.csy.web.student;

import java.util.List;

public interface StudentService {
	public int add(StudentBean StudentBean);
	public List<StudentBean> list();
	public List<StudentBean> getByName(StudentBean StudentBean);
	public StudentBean getById(StudentBean StudentBean);
	public int count();
	public int change(StudentBean StudentBean);
	public int remove(StudentBean StudentBean);
	//////////////////////////////////////////
	public StudentBean login(StudentBean StudentBean);
	
}
