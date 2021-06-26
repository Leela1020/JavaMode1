package com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plane {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private String planeID;
	private String modelName;
	private String planeCompany;
	private int planeCapacity;
	private String planeType;
    private List<Pilot> pilots;
	
	 public String getPlaneID() {
		return planeID;
	}

	public void setPlaneID(String iD) {
		this.planeID = iD;
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

	public List<Pilot> getPilots() {
		return pilots;
	}

	public void setPilots(List<Pilot> pilots) {
		this.pilots = pilots;
	}

	/* public void setPlaneID(String iD) {
		// TODO Auto-generated method stub
		
	}  */
    
	
}
