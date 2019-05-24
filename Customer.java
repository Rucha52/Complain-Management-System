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
public class Customer extends User {

	public Customer(String nameUser, String nameFirst, String nameSecond, String address, String password, String status, String uuid) {
		super(nameUser, nameFirst, nameSecond, address, password, status, uuid);
	}

}