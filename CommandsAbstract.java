/*
* This class will act as a Blueprint for all
* commands that can be used in the application
 */
package com.softwaredevelopmentpractise.complainmanagementsystem;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public abstract class CommandsAbstract {
	

	// attributes
	protected Scanner scanner = new Scanner ( System.in);

	private final String inputNotSupportedMessage = "can't recognize this Command, please try again. you can type help to get all commands";


	/*
	* acts as a blueprint for all greeting notifications
	* will be displayed at the start and when the 
	* user asks for help
	*/
	protected void greetings (String greetings) {
	 	System.out.println(greetings);	
	}

	protected void helpMessage (String greetings, String helpCommand) {
		System.out.println(greetings + "\n" + helpCommand);
	}

	protected void message (String output) {
		System.out.println(output);
	}
	
	protected String messageWithResponse (String output) {
		System.out.println(output);
		String input = scanner.nextLine();
		return input;
	}

	protected String waitForInput() {
		String input = scanner.nextLine();
		return input;
	}

	protected void inputNotSupported() {
		System.out.println(inputNotSupportedMessage);
	}

}
