package com.Ci.address;

public class Address {
	private String district;
	private String taluk;
	private int pincode;
//	public Address() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	                   // when we are using constructor injection complsoury we need to create parameterized constructor
	@Override
	public String toString() {
		return "Address [district=" + district + ", taluk=" + taluk + ", pincode=" + pincode + "]";
	}
	public Address(String district, String taluk, int pincode) {
		super();
		this.district = district;
		this.taluk = taluk;
		this.pincode = pincode;
		System.out.println("constructor is called");
	}
}
