package com.petpeers;

public class Pet {
	int age;
	String name;
	String breed;
	public Pet(int age,String name,String breed) {
		this.age=age;
		this.name=name;
		this.breed=breed;
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}

}
