package com.school.mmc;

public class Student {
	
	private int rollNo;
	private String name;
	private String course;
	private String city;
	
	public Student(int rollNo, String name, String course, String city) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
		this.city = city;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", course=" + course + ", city=" + city + "]";
	}
	
	
}
