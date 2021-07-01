package com.petpeers;

public class User {
	int id;
    String name;
    String password;
    String confirmPassword;

    public User() {
    }

    public User(int id, String name, String password, String confirmPassword) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.confirmPassword =confirmPassword;
    }

    public User(String name, String password, String confirmPassword) {
        this.name = name;
        this.password =  password;
        this.confirmPassword = confirmPassword;
    }
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
    
}

