package com.bean;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Admin_Table")
public class Loginbean {

	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int Admin_ID;
	
	@Column
	private String Username;
	
	
	@Column
	private String password;
	
	
	public Loginbean() {
		
	}
	public Loginbean(String username, String password) {
		super();
		Username = username;
		this.password = password;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
}
