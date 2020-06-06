package com.chinasoft.pojo;

public class Student {
	private int id;
	private String user;
	private String pwd;
	private String phone;
	private String address;
	private String email;
	private int cid;
	private Gender gender;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public Student(int id, String user, String pwd, String phone, String address, String email, int cid) {
		super();
		this.id = id;
		this.user = user;
		this.pwd = pwd;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.cid = cid;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String user, String pwd, String phone, String address, String email, int cid,
			Gender gender) {
		super();
		this.id = id;
		this.user = user;
		this.pwd = pwd;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.cid = cid;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", user=" + user + ", pwd=" + pwd + ", phone=" + phone + ", address=" + address
				+ ", email=" + email + ", cid=" + cid + ", gender=" + gender + "]";
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
	
	
}
