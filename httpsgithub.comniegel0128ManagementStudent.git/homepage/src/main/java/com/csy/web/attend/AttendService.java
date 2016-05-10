package com.csy.web.attend;

import java.util.List;

public interface AttendService {
	public int add(AttendBean AttendBean);
	public List<AttendBean> list();
	public List<AttendBean> getByName(AttendBean AttendBean);
	public AttendBean getById(AttendBean AttendBean);
	public int count();
	public int change(AttendBean AttendBean);
	public int remove(AttendBean AttendBean);
	
}
