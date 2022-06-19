package com.example.SmallWebApp;

import java.util.Arrays;

public class UserRegistation {
	private String UName;
	private String EmailId;
	private String Password;
	private byte Gender;
	private String[] Hobby;
	
	public String getUName() {
		return UName;
	}
	public void setUName(String uName) {
		UName = uName;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public byte getGender() {
		return Gender;
	}
	public void setGender(byte gender) {
		Gender = gender;
	}
	public String[] getHobby() {
		return Hobby;
	}
	public void setHobby(String[] hobby) {
		this.Hobby = hobby;
	}
	
	@Override
	public String toString() {
		return "UserRegistation [UName=" + UName + ", EmailId=" + EmailId + ", Password=" + Password + ", Gender="
				+ Gender + ", Hobby=" + Arrays.toString(Hobby) + "]";
	}
	
}
