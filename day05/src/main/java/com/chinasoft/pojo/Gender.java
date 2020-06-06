package com.chinasoft.pojo;

import java.util.ArrayList;

public class Gender {
	private int id;
	private String name;
	private String teacher;
	//重点，要声明一个集合属性
	private ArrayList<User> list;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public Gender(int id, String name, String teacher) {
		super();
		this.id = id;
		this.name = name;
		this.teacher = teacher;
	}
	public Gender() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Gender [id=" + id + ", name=" + name + ", teacher=" + teacher + ", list=" + list + "]";
	}
	public ArrayList<User> getList() {
		return list;
	}
	public void setList(ArrayList<User> list) {
		this.list = list;
	}
	public Gender(int id, String name, String teacher, ArrayList<User> list) {
		super();
		this.id = id;
		this.name = name;
		this.teacher = teacher;
		this.list = list;
	}
	
}
