/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softwaredevelopmentpractise.complainmanagementsystem;

import java.util.Date;

/**
 *
 * @author admin
 */
public class Ticket {

	private String uuid;
	private String priority;
	private String body;
	private Service service;
	private String status;
	private User assignee;
	private User customer;
	private long dateTimestampCreated;
	private Date dateCreated;
	private Date dateFinished;

	public Ticket(String uuid, String priority, String body, Service service, String status, User assignee, User customer, Date dateCreated, Date dateFinished) {
		this.uuid = uuid;
		this.priority = priority;
		this.body = body;
		this.service = service;
		this.status = status;
		this.assignee = assignee;
		this.customer = customer;
		this.dateCreated = dateCreated;
		this.dateFinished = dateFinished;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public User getAssignee() {
		return assignee;
	}

	public void setAssignee(User assignee) {
		this.assignee = assignee;
	}

	public User getCustomer() {
		return customer;
	}

	public void setCustomer(User customer) {
		this.customer = customer;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateFinished() {
		return dateFinished;
	}

	public void setDateFinished(Date dateFinished) {
		this.dateFinished = dateFinished;
	}

	public String getUuid() {
		return uuid;
	}

	@Override
	public String toString() {
		return "Ticket{" + "uuid=" + uuid + ", priority=" + priority + ", body=" + body + ", service=" + service + ", status=" + status + ", assignee=" + assignee + ", customer=" + customer + ", dateCreated=" + dateCreated + ", dateFinished=" + dateFinished + '}';
	}

}
