package com.csy.web.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.csy.web.attend.AttendBean;
@Repository
public interface AttendMapper {
	public int insert(AttendBean AttendBean);
	public List<AttendBean> selectAll();
	public List<AttendBean> selectByName(AttendBean AttendBean);
	public AttendBean selectById(AttendBean AttendBean);
	public int count();
	public int update(AttendBean AttendBean);
	public int delete(AttendBean AttendBean);
	
}
