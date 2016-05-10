package com.csy.web.admin;

import org.springframework.stereotype.Component;

@Component
public class AdminBean {
	private String id,name,password,tel,email,useYn,profileImg,role,uid;

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getTel() {
		return tel;
	}

	public String getEmail() {
		return email;
	}

	public String getUseYn() {
		return useYn;
	}

	public String getProfileImg() {
		return profileImg;
	}

	public String getRole() {
		return role;
	}

	public String getUid() {
		return uid;
	}
	
////////////////////////////////////////////////
	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}
	
}
