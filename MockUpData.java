/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softwaredevelopmentpractise.complainmanagementsystem;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * this class is to give us some generic data. It will generate different kind
 * of users and tickets
 *
 * @author admin
 */
public class MockUpData {

	Random rand = new Random();

	// attributes for the users
	private String[] nameFirstArray = {"Sophia", "Jackson", "Olivia", "Liam", "Emma", "Noah", "Ava", "Aiden", "Isabella", "Lucas"};
	private String[] nameSecondArray = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miler", "Wilson", "Moore", "Tayler", "Anderson", "Thomas", "Jackson"};
	private String[] nameUserArray = {"kitten", "lizard", "walrus", "toucan", "linnet", "magpie", "locust", "iguana", "marten", "shrimp", "turtle", "beaver"};
	private String[] nameAssigneeArray = {"assignee1", "assignee2", "assignee3", "assignee4"};
	private String[] addressArray = {"happy", "peppy", "clappy", "zappy", "snappy", "debbie", "rabby"};
	private String[] passwordArray = {"123456", "password", "football", "qwerty", "princess", "solo", "flower", "dragon"};
	private String[] statusArray = {"customer", "assignee"};
	private String[] majorTraitArray = {"trait1", "trait2", "trait3"};
	private String[] minorTraitArray = majorTraitArray;

	// attributes for the Tickets
	private String[] priorityArray = {"low", "high"};
	private String[] bodyArray = {"random technical error", "everywhere is smoke... everywhere", "the screen is just black?!", "i think i deleted something", "so this guy sent me an email and wanted to send me money, now my computer doesn't boot anymore", "i can't even"};
	private Service[] ServiceArray = {new Service("random problem with everything hardware related", "hardware", majorTraitArray[0]), new Service("random problem with everything software related", "software", majorTraitArray[1]), new Service("random problem with office equiptment like a printer", "office", majorTraitArray[2])};
	private String[] statusArrayTicket = {"open", "pending", "closed"};

	public ArrayList<Ticket> generateTickets(ArrayList<User> users) {
		ArrayList<Ticket> listTicket = new ArrayList<>();
		for (int i = 0; i < 250; i++) {
			listTicket.add(generateOneTicket(users));
		}
		return listTicket;
	}

	public Ticket generateOneTicket(ArrayList<User> users) {
		String uuid = UUID.randomUUID().toString();

		String priority = priorityArray[rand.nextInt(priorityArray.length)];
		String body = bodyArray[rand.nextInt(bodyArray.length)];
		Service service = ServiceArray[rand.nextInt(ServiceArray.length)];
		String status = statusArrayTicket[rand.nextInt(statusArrayTicket.length)];

		long startTime = Timestamp.valueOf("2017-01-01 00:00:00").getTime();
		long endTime = Timestamp.valueOf("2018-01-01 00:00:00").getTime();
		Date dateCreated = createRandomDateBetween(startTime, endTime);
		Date dateFinished = null;
		if (status.equals("closed")) {
			dateFinished = createRandomDateBetween(dateCreated.getTime(), endTime);
		}
		Assignee assignee = (Assignee) getRandomUser(users, statusArray[1]);
		Customer customer = (Customer) getRandomUser(users, statusArray[0]);

		Ticket ticket = new Ticket(uuid, priority, body, service, status, assignee, customer, dateCreated, dateFinished);
		return ticket;
	}

	private User getRandomUser(ArrayList<User> users, String type) {
		boolean flag = true;
		User user = null;
		while (flag) {
			user = users.get(rand.nextInt(users.size()));
			if (user.getStatus().equals(type)) {
				flag = false;
			}
		}
		return user;
	}

	private Date createRandomDateBetween(long start, long end) {
		long diff = end - start + 1;
		Date randomDate = new Date(start + (long) (Math.random() * diff));
		return randomDate;
	}

	public ArrayList<User> generateUsers() {
		ArrayList<User> listUser = new ArrayList<>();
		for (int i = 0; i < nameUserArray.length; i++) {

			//set firstName 
			String nameFirst = nameFirstArray[rand.nextInt(nameFirstArray.length)];
			//set secondName
			String nameSecond = nameSecondArray[rand.nextInt(nameSecondArray.length)];
			//setUsername
			String nameUser = nameUserArray[i];
			//set address
			String address = addressArray[rand.nextInt(addressArray.length)] + "-street";
			//set password
			String password = passwordArray[rand.nextInt(passwordArray.length)];
			//set status
			String status = statusArray[0];

			String uuid = UUID.randomUUID().toString();

			User test = new Customer(nameUser, nameFirst, nameSecond, address, password, status, uuid);
			listUser.add(test);

		}
		for (int i = 0; i < nameAssigneeArray.length; i++) {

			//set firstName 
			String nameFirst = nameFirstArray[rand.nextInt(nameFirstArray.length)];
			//set secondName
			String nameSecond = nameSecondArray[rand.nextInt(nameSecondArray.length)];
			//setUsername
			String nameUser = nameAssigneeArray[i];
			//set address
			String address = addressArray[rand.nextInt(addressArray.length)] + "-street";
			//set password
			String password = passwordArray[rand.nextInt(passwordArray.length)];
			//set status
			String status = statusArray[1];
			//set majorTrait
			String majorTrait = majorTraitArray[rand.nextInt(majorTraitArray.length)];
			//set minorTrait
			String minorTrait = majorTraitArray[rand.nextInt(minorTraitArray.length)];

			String uuid = UUID.randomUUID().toString();

			User test = new Assignee(majorTrait, minorTrait, nameUser, nameFirst, nameSecond, address, password, status, uuid);
			listUser.add(test);
		}
		addExtraFunctionsAsUsers();
		return listUser;
	}

	private void addExtraFunctionsAsUsers() {
	}
}
