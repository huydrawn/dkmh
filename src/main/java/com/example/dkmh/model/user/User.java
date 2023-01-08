package com.example.dkmh.model.user;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
	public User() {
		
	}
	public User(int iD, String name,String email , String type , String phone , String dayOfBirth, String password) {
		super();
		this.type = type;
		this.email = email;
		ID = iD;
		this.phone = phone;
		this.name = name;
		this.setDayOfBirth(dayOfBirth);
		this.password = password;
	}

	public int getID() {
		return ID;
	}
	@NotNull
	private String name;
	@NotNull
	private String type;
	@NotNull
	@Pattern(regexp = "../../....")
	private String dayOfBirth;
	@NotNull
	@Size(min = 6)
	private String password;
	@NotNull
	private String email;
	@NotNull
	private String phone;
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	public String getDayOfBirth() {
		return dayOfBirth;
	}
	public void setDayOfBirth(String dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
