/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softwaredevelopmentpractise.complainmanagementsystem;

import java.util.ArrayList;

/**
 * this class will be responsible for all "database" actions. If another class wants to 
 * get tickets, users etc. this class will provide them.
 * @author admin
 */
public class DataCommands {

	MockUpData mockUp = new MockUpData();

	
	public ArrayList<User> getUsers() {
		return mockUp.generateUsers();
	}

	public ArrayList<Ticket> getTickets(ArrayList<User> users){
		return mockUp.generateTickets(users);
	}
	
}
