package com.pranav.model;

import java.util.List;

public class StudentDetails {
	
	String rollNo;
	String StuName;
	List<Address> Address;
	String contact;
	@Override
	public String toString() {
		return "StudentDetails [rollNo=" + rollNo + ", StuName=" + StuName + ", Address=" + Address + ", contact="
				+ contact + "]";
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getStuName() {
		return StuName;
	}
	public void setStuName(String stuName) {
		StuName = stuName;
	}
	public List<Address> getAddress() {
		return Address;
	}
	public void setAddress(List<Address> address) {
		Address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public StudentDetails(String rollNo, String stuName, List<Address> address, String contact) {
		super();
		this.rollNo = rollNo;
		StuName = stuName;
		Address = address;
		this.contact = contact;
	}
	public StudentDetails() {
		super();
	}

}
