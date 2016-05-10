package com.csy.web.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.csy.web.admin.AdminBean;
import com.csy.web.cboard.CBoardBean;
@Repository
public interface CBoardMapper {
	public int insert(CBoardBean cBoardBean);
	public List<CBoardBean> selectAll();
	public List<CBoardBean> selectByName(CBoardBean cBoardBean);
	public AdminBean selectById(CBoardBean cBoardBean);
	public int count();
	public int update(CBoardBean cBoardBean);
	public int delete(CBoardBean cBoardBean);	
}
