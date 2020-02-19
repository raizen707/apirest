package com.udeo.apirest.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity(name="user")
@Table(name="user")
public class User {
/*PK == Primary Key*/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	

	@Column(name="user")
	private String user;
	
	/*parametros nombrados*/
	public User() {}
	public User(int id, String email, String password, String user) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.user = user;
	}
	/*GET*/
	
	public int getId() {
		return this.id;
	}
	
	public String getEmail() {
		return this.email;
	}

	public String getUser() {
		return this.user;
	}
	/*SET*/
	
	public void setId(int id) {
		this.id = id;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setUser(String user) {
		this.user = user;
	}
	/*OVERRIDE*/
	@Override
	public String toString() {
		return "User [id]"+ id +", email= "+ email + ",password= "+ randomPassword() + "User =" + user;
	}
	
	public String randomPassword() {
		return "";
	}
}
