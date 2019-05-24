/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softwaredevelopmentpractise.complainmanagementsystem;

/**
 * This class will handle everything for the user once he logged in.
 * @author admin
 */
public class UserEnvironment extends CommandsAbstract {
	
	private final String greetings = "Hello, \n you are in the User Screen "
		+ "\n you can file tickets and get the status of your existing tickets  ";
	private final String help = "\n list of all available commands: "
		+ "\n createTicket: initiates the ticket process"
		+ "\n logout: logs you out and you get back to the login screen";
	private final String error = "";
	
	
	public void start() {
		this.greetings(greetings);
		standby();
	}

	private void standby() {
		String input = this.waitForInput();
		switch (input) {
			case "help":
				this.helpMessage(greetings, help);
				break;
			case "createTicket":
				createTicket();
				break;
			case "logout": 
				break;
			default:
				this.inputNotSupported();
		}
		if (!input.equals("logout")) {
		standby();
		}
	}

	private void createTicket() {
		System.out.println("create ticket to be implemented");
	}
}
