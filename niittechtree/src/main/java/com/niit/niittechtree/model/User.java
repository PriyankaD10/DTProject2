package com.niit.niittechtree.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="Users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotNull(message = "enter name")
	@Size(min = 2, max = 50, message = "name can be min 2-50 characters ")
	private String name;

	@NotNull(message = "enter username")
	@Size(min = 2, max = 15, message = "username can be min 2-50 characters ")
	private String username;

	@NotNull(message = "enter password")
	@Size(min = 4, max = 6, message = "password can be min 4-6 characters ")
	private String password;

	@NotNull(message = "enter email")
	@Email(message = "email is not in correct format")
	private String email;

	@NotNull(message = "enter mobile no")
	@Size(min = 10, max = 10, message = "mobile no should be 10 digits")
	private String phoneno;

	@NotNull(message = "enter location")
	private String location;
	private int enabled;

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

}
