/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softwaredevelopmentpractise.complainmanagementsystem;

/**
 * This is a user class for all users in our application.
 *
 * @author admin
 */
public class User {

	// all typical user data and stuff
	private String nameUser;
	private String nameFirst;
	private String nameSecond;
	private String address;
	private String uuid;
	// yes, plaintext. This is just to simulate a User. This is enough for the scope of the project. We would have to add encryption in a bigger project.
	private String password;

	// this is to differentiate between users, employees and also, for the demo of the project, other functions of the application 
	private String status;

	/**
	 *
	 * @param nameUser
	 * @param nameFirst
	 * @param nameSecond
	 * @param address
	 * @param password
	 * @param status
	 * @param uuid
	 */
	public User(String nameUser, String nameFirst, String nameSecond, String address, String password, String status, String uuid) {
		this.nameUser = nameUser;
		this.nameFirst = nameFirst;
		this.nameSecond = nameSecond;
		this.address = address;
		this.password = password;
		this.status = status;
		this.uuid = uuid;
	}

	@Override
	public String toString() {
		return "User{" + "nameUser=" + nameUser + ", nameFirst=" + nameFirst + ", nameSecond=" + nameSecond + ", address=" + address + ", password=" + password + ", status=" + status + ", uuid=" + uuid +'}';
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public String getNameFirst() {
		return nameFirst;
	}

	public void setNameFirst(String nameFirst) {
		this.nameFirst = nameFirst;
	}

	public String getNameSecond() {
		return nameSecond;
	}

	public void setNameSecond(String nameSecond) {
		this.nameSecond = nameSecond;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
}
