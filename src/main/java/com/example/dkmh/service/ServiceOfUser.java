package com.example.dkmh.service;

import com.example.dkmh.model.user.User;

public interface ServiceOfUser {
	void saveUser(User u);
	boolean updateUser(User u);
	boolean checkExsitUser();
}
