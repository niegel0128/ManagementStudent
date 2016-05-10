package com.csy.web.cboard;

import java.util.List;

import com.csy.web.admin.AdminBean;

public interface CBoardService {
	public int add(CBoardBean cBoardBean);
	public List<CBoardBean> list();
	public List<CBoardBean> getByName(CBoardBean cBoardBean);
	public AdminBean getById(CBoardBean cBoardBean);
	public int count();
	public int change(CBoardBean cBoardBean);
	public int remove(CBoardBean cBoardBean);	
}
