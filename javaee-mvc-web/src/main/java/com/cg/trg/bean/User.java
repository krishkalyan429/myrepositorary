package com.cg.trg.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Domain/DTO/VO

@Entity
@Table(name = "user_b0450")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String userId;
	private String userName;
	private String password;
	private String email;
	private Long mobile;
	
	public User() {
		
	}
	
	public User( String userId, String userName, String password, String email, Long mobile) {
		super();
		
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
	}

	public User(Integer id, String userId, String userName, String password, String email, Long mobile) {
		super();
		this.id = id;
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userId=" + userId + ", userName=" + userName + ", password=" + password
				+ ", email=" + email + ", mobile=" + mobile + "]";
	}
	
	
}
