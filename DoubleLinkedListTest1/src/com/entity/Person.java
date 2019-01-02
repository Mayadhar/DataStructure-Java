package com.entity;

import java.util.Date;

public class Person {

	private Long id;
	private String fname;
	private String mname;
	private String lname;
	private String city;
	private Date dob;

	public Person() {
		super();
	}

	public Person(Long id, String fname, String mname, String lname, String city, Date dob) {
		super();
		this.id = id;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.city = city;
		this.dob = dob;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
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
		return "Person [id=" + id + ", fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", city=" + city
				+ ", dob=" + dob + "]";
	}

}
