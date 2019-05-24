/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softwaredevelopmentpractise.complainmanagementsystem;

/**
 *
 * @author markhagelauer
 */
public class Service {

	private String description;
	private String title;
	private String requiredTrait;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRequiredTrait() {
		return requiredTrait;
	}

	public void setRequiredTrait(String requiredTrait) {
		this.requiredTrait = requiredTrait;
	}

	public Service(String description, String title, String requiredTrait) {
		this.description = description;
		this.title = title;
		this.requiredTrait = requiredTrait;
	}

	@Override
	public String toString() {
		return "Service{" + "description=" + description + ", title=" + title + ", requiredTrait=" + requiredTrait + '}';
	}

	
}
