package com.example.dkmh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.dkmh.model.user.User;
import com.example.dkmh.respository.ManageUser;
@Service
public class UserServiceIml implements ServiceOfUser {
	@Autowired
	JdbcTemplate jdbc;
	@Autowired
	ManageUser dao;
	@Override
	public void saveUser(User u) {
		 dao.save(u);
	}
	@Override
	public boolean updateUser(User u) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean checkExsitUser() {
		List<User> list = dao.findAll();
		for(var x : list) {
			
		}
		return false;
	}
	
}
