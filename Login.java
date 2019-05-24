/*
* This Class is for the Login. Users will be able
* to login as customers or as employee. For the scope of
* the project, this will also operate as a tool to "show"
* different parts of our project
 */
package com.softwaredevelopmentpractise.complainmanagementsystem;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Login extends CommandsAbstract {

	// attributes
	private final String greetings = "Hello, \n you are in the Login Screen \n please begin the login process with the command \"login\" ";
	private final String help = "\n list of all available commands: \n login: starts the login process \n show : list of all users \n showTickets : list of all tickets";
	private final String askUsername = "please enter your username";
	private final String askPassword = "please enter your password";
	private final String errorLoginFailed = "Username or Password are incorrect, please try again";

	ArrayList<User> users;
	ArrayList<Ticket> tickets;

	public void start() {
		initializeData();
		this.greetings(greetings);
		standby();
	}

	private void standby() {
		String input = this.waitForInput();
		switch (input) {
			case "help":
				this.helpMessage(greetings, help);
				break;
			case "login":
				login();
				break;
			case "show":
				showUsers();
				break;
			case "showTickets":
				showTickets();
				break;
			default:
				this.inputNotSupported();
		}
		standby();
	}

	private void login() {
		String username = this.messageWithResponse(askUsername);
		String password = this.messageWithResponse(askPassword);
		User user = checkLogin(username, password);
		if (user == null) {
			this.message(errorLoginFailed);
		} else {
			changeTo(user);

		}

	}

	private User checkLogin(String username, String password) {
		for (User user : users) {
			if (user.getNameUser().equals(username)) {
				if (user.getPassword().equals(password)) {
					return user;
				}
			}
		}
		return null;
	}

	private void changeTo(User user) {
		switch (user.getStatus()) {
			case "customer":
				UserEnvironment userUI = new UserEnvironment();
				userUI.start();
				break;
			case "assignee":
				System.out.println("ASSIGNEES NOT IMPLEMENTED");
				break;
			default : this.message("problem LOGIN problem");
		}
		this.greetings(greetings);

	}

	private void initializeData() {
		DataCommands data = new DataCommands();
		users = data.getUsers();
		tickets = data.getTickets(users);
	}

	private void showUsers() {
		for (User user : users) {
			System.out.println(user);
		}
	}

	private void showTickets() {
		for (Ticket ticket : tickets) {
			System.out.println(ticket);
		}
	}

}
