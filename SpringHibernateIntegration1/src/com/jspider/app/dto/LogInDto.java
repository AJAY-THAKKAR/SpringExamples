package com.jspider.app.dto;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

public class LogInDto implements Serializable{

	@Id
	@GeneratedValue(generator="xr")
	@GenericGenerator(name="xr", strategy="increment")
	private long loginId;
	
	public LogInDto(long loginId, String userName, String password) {
		super();
		this.loginId = loginId;
		this.userName = userName;
		this.password = password;
	}

	public long getLoginId() {
		return loginId;
	}

	public void setLoginId(long loginId) {
		this.loginId = loginId;
	}

	private String userName;
	
	private String password;

	@Override
	public String toString() {
		return "LogInDto [loginId=" + loginId + ", userName=" + userName + ", password=" + password + "]";
	}

	public LogInDto(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public LogInDto() {
		super();
		// TODO Auto-generated constructor stub
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

	public void setPassword(String password) {
		this.password = password;
	}
		
}
