package com.Di.address;

public class Address {
private String district;
private String taluk;
private int pincode;
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
@Override
public String toString() {
	return "Address [district=" + district + ", taluk=" + taluk + ", pincode=" + pincode + "]";
}



}
