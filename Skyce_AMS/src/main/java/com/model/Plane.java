package com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.ToString;

@SuppressWarnings("serial")
@ToString
@Entity
public class Plane implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int planeNo;
	@Column(length=15,unique=true,nullable=false)
	private String planeID;
	@Column(length=40)
	private String modelName;
	@Column(length=30)
	private String planeCompany;
	private int planeCapacity;
	@Column(length=30)
	private String planeType;
	@Column(length=15,nullable=true)
	private String hangarID;
	public int getPlaneNo() {
		return planeNo;
	}
	public void setPlaneNo(int planeNo) {
		this.planeNo = planeNo;
	}
	public String getPlaneID() {
		return planeID;
	}
	public void setPlaneID(String planeID) {
		this.planeID = planeID;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getPlaneCompany() {
		return planeCompany;
	}
	public void setPlaneCompany(String planeCompany) {
		this.planeCompany = planeCompany;
	}
	public int getPlaneCapacity() {
		return planeCapacity;
	}
	public void setPlaneCapacity(int planeCapacity) {
		this.planeCapacity = planeCapacity;
	}
	public String getPlaneType() {
		return planeType;
	}
	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}
	public String getHangarID() {
		return hangarID;
	}
	public void setHangarID(String hangarID) {
		this.hangarID = hangarID;
	}
	
}
