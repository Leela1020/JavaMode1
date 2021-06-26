package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pilot {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private String serialNumber;
	//@Column
	private String pilotID;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private String email;
	public String getPilotID() {
		return pilotID;
	}
	public void setPilotID(String pilotID) {
		this.pilotID = pilotID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
