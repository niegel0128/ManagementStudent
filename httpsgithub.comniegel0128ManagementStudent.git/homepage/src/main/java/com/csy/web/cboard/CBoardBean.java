package com.csy.web.cboard;

import org.springframework.stereotype.Component;

@Component
public class CBoardBean {
	private String title,des,useYn,regUserId,regDate,fileSrc1,fileSrc2,uid;
	private int seq;
	
	public String getTitle() {
		return title;
	}
	public String getDes() {
		return des;
	}
	public String getUseYn() {
		return useYn;
	}
	public String getRegUserId() {
		return regUserId;
	}
	public String getRegDate() {
		return regDate;
	}
	public String getFileSrc1() {
		return fileSrc1;
	}
	public String getFileSrc2() {
		return fileSrc2;
	}
	public String getUid() {
		return uid;
	}
	public int getSeq() {
		return seq;
	}
	/////////////////////////////////////
	public void setTitle(String title) {
		this.title = title;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}
	public void setRegUserId(String regUserId) {
		this.regUserId = regUserId;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public void setFileSrc1(String fileSrc1) {
		this.fileSrc1 = fileSrc1;
	}
	public void setFileSrc2(String fileSrc2) {
		this.fileSrc2 = fileSrc2;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
}
