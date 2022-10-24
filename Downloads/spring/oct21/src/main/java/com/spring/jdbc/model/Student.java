package com.spring.jdbc.model;

import java.util.Date;

public class Student {

	private String stu_id;
	private String first_name;
	private String last_name;
	private Date joining_date;
	public String getStu_id() {
		return stu_id;
	}
	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Date getJoining_date() {
		return joining_date;
	}
	public void setJoining_date(Date joining_date) {
		this.joining_date = joining_date;
	}
	public Student(String stu_id, String first_name, String last_name, Date joining_date) {
		super();
		this.stu_id = stu_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.joining_date = joining_date;
	}
	
	public Student() {
		super();
	}
	
	@Override
	public String toString() {
		return "Student [stu rollno=" + stu_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", joining_date=" + joining_date + "]";
	}
	
}
