package com.rbsample_springBootMybatisHsqldb;

public class User {

	Integer id;
	String name;
	String address;
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public User(Integer id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return String.format("User [id=%s, name=%s, address=%s]", id, name, address);
	}
	
	
}
