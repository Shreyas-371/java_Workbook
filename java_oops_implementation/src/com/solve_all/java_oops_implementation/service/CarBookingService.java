package com.solve_all.java_oops_implementation.service;

import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import com.solve_all.java_oops_implementation.Bookable;
import com.solve_all.java_oops_implementation.entity.Driver;
import com.solve_all.java_oops_implementation.entity.Summary;
import com.solve_all.java_oops_implementation.entity.User;
import com.solve_all.java_oops_implementation.repository.DriverRepo;

public class CarBookingService extends Bookable {

	
	
	
	public CarBookingService() {
		super();
	}

	@Override
	public String bookTrip(User user,String source,String destination,int kms)
	{
		
		for(Map.Entry<Driver,Boolean> entry : DriverRepo.getCarDriverList().entrySet())
		{
			if(entry.getValue())
			{
				Timer timer = new Timer();
				Driver driver = entry.getKey();
				int finalCost = makePayment(user,kms);
				if(finalCost<0)
				{
					return "insufficient balance in wallet add funds to wallet too make required payment!!!";
				}
				entry.getKey().setAvailableStatus(false);
				driver.setAvailableStatus(false);
				
				timer.schedule(new TimerTask() {
					@Override
					public void run() {
					entry.getKey().setAvailableStatus(true);
					timer.cancel();
					}
				},1000*kms );
				
				Summary tripSummary = new Summary(source,destination,kms,finalCost,driver);
				return tripSummary.toString();			
			}
		}
		return "sorry but there seems to be a rush and all our drivers are busy please try after some time!!!";
		
		
	}

	

	@Override
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
