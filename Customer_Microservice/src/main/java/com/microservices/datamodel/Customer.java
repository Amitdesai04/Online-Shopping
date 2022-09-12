package com.microservices.datamodel;

import javax.annotation.Generated;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.NonNull;

@EntityScan
@Table(name = "CUSTOMER")
public class Customer {

	@Id
	@Generated(value = { "" })
	private long id;

	@NonNull
	private String email;

	@NonNull
	private String firstName;

	@NonNull
	private String lastName;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}