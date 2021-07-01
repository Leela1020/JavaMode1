package com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@SuppressWarnings("serial")
@Embeddable
public class Address implements Serializable{
	@Column(length=15,nullable=false)
	private String PIN;
	@Column(length=30,nullable=false)
	private String city;
	@Column(length=50,nullable=false)
	private String state;
	@Column(length=30,nullable=false)
	private String country;
	@Column(length=30,nullable=false)
	private String street;
	@Column(length=15,nullable=false)
	private String doorNo;
	public String getPIN() {
		return PIN;
	}
	public void setPIN(String pIN) {
		PIN = pIN;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	
}
