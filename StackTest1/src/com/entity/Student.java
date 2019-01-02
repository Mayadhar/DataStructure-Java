package com.entity;

import java.util.Date;

public class Student {

	private Long id;
	private Long roll;
	private String fname;
	private String lname;
	private String city;
	private Date dob;

	public Student(Long id, Long roll, String fname, String lname, String city, Date dob) {
		super();
		this.id = id;
		this.roll = roll;
		this.fname = fname;
		this.lname = lname;
		this.city = city;
		this.dob = dob;
	}

	public Student() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRoll() {
		return roll;
	}

	public void setRoll(Long roll) {
		this.roll = roll;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", roll=" + roll + ", fname=" + fname + ", lname=" + lname + ", city=" + city
				+ ", dob=" + dob + "]";
	}

}
