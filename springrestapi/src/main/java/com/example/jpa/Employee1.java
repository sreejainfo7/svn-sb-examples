package com.example.jpa;

public class Employee1 {

	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "email=" + email;
	}

}
