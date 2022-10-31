package com.te.springmvc.service;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
private String email;
private String username;
private String pass;
private String confpass;

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String getConfpass() {
	return confpass;
}
public void setConfpass(String confpass) {
	this.confpass = confpass;
}
@Override
public String toString() {
	return "User [email=" + email + ", username=" + username + ", pass=" + pass + ", confpass=" + confpass + "]";
}



}
