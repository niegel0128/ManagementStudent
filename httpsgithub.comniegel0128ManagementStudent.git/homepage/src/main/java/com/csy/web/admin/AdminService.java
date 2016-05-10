package com.csy.web.admin;

import java.util.List;

public interface AdminService {
	public int add(AdminBean AdminBean);
	public List<AdminBean> list();
	public List<AdminBean> getByName(AdminBean AdminBean);
	public AdminBean getById(AdminBean AdminBean);
	public int count();
	public int change(AdminBean AdminBean);
	public int remove(AdminBean AdminBean);
}
