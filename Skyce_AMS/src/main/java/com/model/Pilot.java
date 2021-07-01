package com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.ToString;

@SuppressWarnings("serial")
@Entity
@ToString
public class Pilot implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pilotNo;
	@Column(length=30)
	private String firstName;
	@Column(length=30)
	private String lastName;
	private int age;
	@Column(length=45,unique=true)
	private String email;
	@Column(length=10,unique=true,nullable=false)
	private String dgcaPilotID;
	public int getPilotNo() {
		return pilotNo;
	}
	public void setPilotNo(int pilotNo) {
		this.pilotNo = pilotNo;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDgcaPilotID() {
		return dgcaPilotID;
	}
	public void setDgcaPilotID(String dgcaPilotID) {
		this.dgcaPilotID = dgcaPilotID;
	}
	
}
