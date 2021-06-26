package com.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
/*
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor; 


@Data
@NoArgsConstructor
@AllArgsConstructor*/
@Embeddable 
public class Address implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String PIN;
	private String city;
	private String state;
	private String country;
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
	private String street;
	private String doorNo;
}

