package com.example.domain;

public class Student {
	
	private Long sno;
	private String sname;
	private String address;
	
	public Student() {
		System.out.println("Student 0-param constructor");
	}
	
	public Student(Long sno, String sname, String address) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.address = address;
	}
	public Long getSno() {
		return sno;
	}
	public void setSno(Long sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", address=" + address + "]";
	}
	

}
