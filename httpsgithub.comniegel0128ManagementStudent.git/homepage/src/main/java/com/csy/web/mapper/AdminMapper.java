package com.csy.web.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.csy.web.admin.AdminBean;
@Repository
public interface AdminMapper {
	public int insert(AdminBean bean);
	public List<AdminBean> selectAll();
	public List<AdminBean> selectByName(AdminBean bean);
	public AdminBean selectById(AdminBean bean);
	public int count();
	public int update(AdminBean bean);
	public int delete(AdminBean bean);
	
	public AdminBean login(AdminBean bean);
}
