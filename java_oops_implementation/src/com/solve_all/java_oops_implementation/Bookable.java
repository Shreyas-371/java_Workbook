package com.solve_all.java_oops_implementation;

import com.solve_all.java_oops_implementation.entity.User;

public abstract class Bookable {
	
	
	
	public abstract String bookTrip(User user,String source,String destination,int kms);
	
	public abstract int makePayment(User user,int kms);

	
	

}
