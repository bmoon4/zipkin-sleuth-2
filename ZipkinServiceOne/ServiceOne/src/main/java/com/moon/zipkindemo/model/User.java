package com.moon.zipkindemo.model;

import java.util.List;

public class User {
	String name;
	String email;
	List<Item> itemList;
	List<Location> locationList;
	List<Message> messageList;

	public User() {
	}

	public User(String name, String email, List<Item> itemList, List<Location> locationList, List<Message> messageList) {
		this.name = name;
		this.email = email;
		this.itemList = itemList;
		this.locationList = locationList;
		this.messageList=messageList;

	}

	public List<Location> getLocationList() {
		return locationList;
	}

	public void setLocationList(List<Location> locationList) {
		this.locationList = locationList;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMessageList(List<Message> messageList) {
		this.messageList = messageList;
	}

	public List<Message> getMessageList() {
		return messageList;
	}
}