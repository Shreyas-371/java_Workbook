package com.solve_all.java_oops_implementation;

import com.solve_all.java_oops_implementation.entity.User;

public abstract class Bookable {
	
	
	
	public abstract String bookTrip(User user,String source,String destination,int kms);
	
	public int makePayment(User user,int kms) {
		// TODO Auto-generated method stub
		int finalCost = 15*kms;
		if(user.getWallet()>=finalCost)
		{
			user.setWallet(user.getWallet()-finalCost);
			return finalCost;
		}
		else return -1;
		
	}

	
	

}
