package com.csy.web.attend;

import org.springframework.stereotype.Component;

@Component
public class AttendBean {
	private String startDate,endDate,uid;	
	private int seq,date;
	
	public String getStartDate() {
		return startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public String getUid() {
		return uid;
	}
	public int getSeq() {
		return seq;
	}
	public int getDate() {
		return date;
	}
	////////////////////////////////////////////
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
	
}
