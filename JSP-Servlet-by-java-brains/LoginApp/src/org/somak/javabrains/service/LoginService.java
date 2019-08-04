package org.somak.javabrains.service;

import java.util.HashMap;

import org.somak.javabrains.dto.User;

public class LoginService {

	HashMap<String, String> users = new HashMap<String, String>();

	public LoginService() {

		users.put("jon", "John Doe");
		users.put("ron", "Ron Martin");
		users.put("tim", "Tim Thorp");
	}

	// In actual this is the class where we should create the JDBC connection for
	// checking user credentials
	public boolean authenticate(String userId, String password) {
		if (password == null || password.trim() == "") {
			return false;
		}

		return true;
	}

	public User getUserDetails(String userId) {
		
		User user=new User();
		user.setUserName(users.get(userId));
		user.setUserId(userId);
		return user;
	}

}