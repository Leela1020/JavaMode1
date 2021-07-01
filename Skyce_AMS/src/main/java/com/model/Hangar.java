package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.ToString;

@Entity
@ToString
public class Hangar {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int hangarNo;
	@Column(length=15)
	private String hangarType;
	@Column(length=15,unique=true)
	private String hangarID;
	private int status;
	public int getHangarNo() {
		return hangarNo;
	}
	public void setHangarNo(int hangarNo) {
		this.hangarNo = hangarNo;
	}
	public String getHangarType() {
		return hangarType;
	}
	public void setHangarType(String hangarType) {
		this.hangarType = hangarType;
	}
	public String getHangarID() {
		return hangarID;
	}
	public void setHangarID(String hangarID) {
		this.hangarID = hangarID;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
