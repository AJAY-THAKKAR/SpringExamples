package com.jspider.app.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class SignUpDto implements Serializable {
	
	@Id
	@GeneratedValue(generator="xr")
	@GenericGenerator(name="xr",strategy="increment")
	private long signupId;
	
	private String name;
	
	private String userName;
	
	private String password;

	@Override
	public String toString() {
		return "SignUpDto [name=" + name + ", userName=" + userName + ", password=" + password + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public SignUpDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SignUpDto(String name, String userName, String password) {
		super();
		this.name = name;
		this.userName = userName;
		this.password = password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
