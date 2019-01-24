package com.example.domain;

public class Employee {
	
	private int empNo;
	private String eName;
	private String eAdd;
	
	public Employee() {
		System.out.println("Employee() construtor");
	}
	
	public Employee(int empNo, String eName, String eAdd) {
		super();
		this.empNo = empNo;
		this.eName = eName;
		this.eAdd = eAdd;
	}

	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteAdd() {
		return eAdd;
	}
	public void seteAdd(String eAdd) {
		this.eAdd = eAdd;
	}
	
	

}
