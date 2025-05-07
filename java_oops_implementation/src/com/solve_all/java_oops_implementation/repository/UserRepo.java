package com.solve_all.java_oops_implementation.repository;

import java.util.ArrayList;
import java.util.List;

import com.solve_all.java_oops_implementation.entity.User;

public class UserRepo {
	
	private static List<User> userList = new ArrayList<>();

	
	
	public static List<User> getUserList() {
		return userList;
	}

	public static void setUserList(List<User> userList) {
		UserRepo.userList = userList;
	}
	
	

}
