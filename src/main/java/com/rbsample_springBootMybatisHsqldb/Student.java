package com.rbsample_springBootMybatisHsqldb;

public class Student {

	Integer role;
	String name;
	String grade;
	public int getRole() {
		return role;
	}
	public void setRole(Integer role) {
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Student(Integer role, String name, String grade) {
		super();
		this.role = role;
		this.name = name;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return String.format("Student [role=%s, name=%s, grade=%s]", role, name, grade);
	}
	
	
	
	
}
