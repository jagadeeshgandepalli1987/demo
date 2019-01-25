package com.example.domain;

public class Customer {
	
	private int custId;
	private String cname;
	private String address;
	
	public Customer() {
		System.out.println("0-param constructor");
	}

	public Customer(int custId, String cname, String address) {
		super();
		this.custId = custId;
		this.cname = cname;
		this.address = address;
	}
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
