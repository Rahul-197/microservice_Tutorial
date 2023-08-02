package com.user.entity;

public class Contact {
	private long cId;
	private String email;
	private String conctName;
	private Long userId;
	public Contact() {
		// TODO Auto-generated constructor stub
	}
	public Contact(long cId, String email, String conctName, Long userId) {
		this.cId = cId;
		this.email = email;
		this.conctName = conctName;
		this.userId = userId;
	}
	public long getcId() {
		return cId;
	}
	public void setcId(long cId) {
		this.cId = cId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getConctName() {
		return conctName;
	}
	public void setConctName(String conctName) {
		this.conctName = conctName;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
}
