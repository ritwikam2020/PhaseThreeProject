package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;

@Entity
@Table(name = "user_table")
@EnableTransactionManagement
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userid")
	private int id;
	@Column(name = "username")
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phnum")
	private String phNum;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getuserName() {
		return userName;
	}

	public void setusername(String userName) {
		this.userName = userName;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}
	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}
	
	public String getphnum() {
		return phNum;
	}

	public void setphnum(String phNum) {
		this.phNum = phNum;
	}

}
