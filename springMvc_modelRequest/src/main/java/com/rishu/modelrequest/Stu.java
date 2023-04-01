package com.rishu.modelrequest;

public class Stu {
	private String email;
	private String userid;
	private String password;
	public Stu() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Stu [email=" + email + ", userid=" + userid + ", password=" + password + "]";
	}
	public String getEmail() {
		return email;
	}
	public Stu(String email, String userid, String password) {
		super();
		this.email = email;
		this.userid = userid;
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
