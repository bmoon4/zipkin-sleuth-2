package com.moon.zipkindemo.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
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
