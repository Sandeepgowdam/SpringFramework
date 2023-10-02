package com.hardcoding;

public class Place {
	
	private String state;
	private Address address;
	
	
	public Place(String state, Address address) {
		super();
		this.state = state;
		this.address = address;
	}

	public Place() {
		super();

	}

	

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Place [state=" + state + ", address=" + address + "]";

	}
}

class Address {
	
	private String district;
	private String taluk;
	private int pincode;
	
	
	@Override
	public String toString() {
		return "Address [district=" + district + ", taluk=" + taluk + ", pincode=" + pincode + "]";
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String district, String taluk, int pincode) {
		super();
		this.district = district;
		this.taluk = taluk;
		this.pincode = pincode;
	}

	

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getTaluk() {
		return taluk;
	}

	public void setTaluk(String taluk) {
		this.taluk = taluk;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
}