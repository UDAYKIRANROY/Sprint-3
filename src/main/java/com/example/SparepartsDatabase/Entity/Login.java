package com.example.SparepartsDatabase.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Login {

	@Id
	private String email;
	private String passowrd;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassowrd() {
		return passowrd;
	}
	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}
	
}
