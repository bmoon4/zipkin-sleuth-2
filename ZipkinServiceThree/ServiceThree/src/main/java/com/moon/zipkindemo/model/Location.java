package com.moon.zipkindemo.model;

public class Location {
	String province;
	int storeid;

	public Location() {
	}
	public Location(String province,int storeid) {
		this.province= province;
		this.storeid= storeid;
		
	}
	public String getProvince() {
		return province;
	}

	public int getStoreid() {
		return storeid;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}
}
