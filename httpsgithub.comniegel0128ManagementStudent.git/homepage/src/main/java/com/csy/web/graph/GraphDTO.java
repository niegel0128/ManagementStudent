package com.csy.web.graph;

import org.springframework.stereotype.Component;

@Component
public class GraphDTO {
	private String id; //아이디
	private String name; //이름
	private String attendDay; //출석일
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAttendDay() {
		return attendDay;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAttendDay(String attendDay) {
		this.attendDay = attendDay;
	}
}