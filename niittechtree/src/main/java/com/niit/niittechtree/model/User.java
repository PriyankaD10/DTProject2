package com.niit.niittechtree.model;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Entity
@Component
public class User {
private int id ;
private String username;
private String password;
private String email;
private String phoneno;
private String location;
private int enabled;
private  byte[] photo;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhoneno() {
	return phoneno;
}
public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}
public byte[] getPhoto() {
	return photo;
}
public void setPhoto(byte[] photo) {
	this.photo = photo;
}

public int getEnabled() {
	return enabled;
}
public void setEnabled(int enabled) {
	this.enabled = enabled;
}


}
