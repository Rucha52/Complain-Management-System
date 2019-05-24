/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softwaredevelopmentpractise.complainmanagementsystem;

/**
 *
 * @author admin
 */
public class Assignee extends User {

	private String majorTrait;
	private String minorTrait;

	public Assignee(String majorTrait, String minorTrait, String nameUser, String nameFirst, String nameSecond, String address, String password, String status, String uuid) {
		super(nameUser, nameFirst, nameSecond, address, password, status, uuid);
		this.majorTrait = majorTrait;
		this.minorTrait = minorTrait;
	}

	@Override
	public String toString() {
		return "Assignee{" + "majorTrait=" + majorTrait + ", minorTrait=" + minorTrait + "nameUser=" + this.getNameUser() + ", nameFirst=" + this.getNameFirst() + ", nameSecond=" + this.getNameSecond() + ", address=" + this.getAddress() + ", password=" + this.getPassword() + ", status=" + this.getStatus() + ", uuid=" + this.getUuid() + '}';
	}

}