package com.jse.inheritance;

public class Phone {
	private String phoneNumber;
	private String name;
	private String company;
	public Phone(String phoneNumber,String name,String company) {
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.company = company;
	}
	public void setPhonNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
}
	public String getPhonNumber(){
		return phoneNumber;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getname() {
		return name;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCompany() {
		return company;
	}
	@Override
	public String toString() {
		return "Phone : phoneNumber=" + phoneNumber + ", name=" + name + ", company=" + company;
	}

	
}