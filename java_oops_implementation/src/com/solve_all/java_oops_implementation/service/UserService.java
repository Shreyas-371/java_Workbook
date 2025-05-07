package com.solve_all.java_oops_implementation.service;

import com.solve_all.java_oops_implementation.entity.User;
import com.solve_all.java_oops_implementation.repository.UserRepo;

public class UserService {
	
	public String addNewUser(String name, int id, int age, String gender) 
	{
		try {
			User newUser = new User(name,id,age,gender);
			UserRepo.getUserList().add(newUser);
			return "new user created succesfully";
		}
		 catch(Exception e)
		{
			return "sorry but there seems to be a problem with the data you entered!! user creation failed!!";
		}
	}
	
	public User findUserById(int id)
	{
		User user = UserRepo.getUserList().stream()
				.filter(u -> u.getId() == id)
				.findFirst()
				.orElse(null);
		if(user != null)
		{
			return user;
		}
//		return "the user record you are looking for does not exist try searching with different userId";
		return null;
		
	}
	
	public String rechargeUserWallet(User user,int amount)
	{
		if(amount>0)
		{
			int wallet = user.getWallet();
			wallet += amount;
			user.setWallet(wallet);
			return "user wallet recharged new balance is = "+ user.getWallet();
		}
		return "amount is invalid user wallet recharge failed";
	}

}
