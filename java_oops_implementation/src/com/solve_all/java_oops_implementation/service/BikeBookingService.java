package com.solve_all.java_oops_implementation.service;

import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import com.solve_all.java_oops_implementation.Bookable;
import com.solve_all.java_oops_implementation.entity.Driver;
import com.solve_all.java_oops_implementation.entity.Summary;
import com.solve_all.java_oops_implementation.entity.User;
import com.solve_all.java_oops_implementation.repository.DriverRepo;

public class BikeBookingService extends Bookable {

	
	
	
	public BikeBookingService() {
		super();
	}

	@Override
	public String bookTrip(User user,String source,String destination,int kms)
	{
		
		for(Map.Entry<Driver,Boolean> entry : DriverRepo.getBikeDriverList().entrySet())
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
				entry.setValue(false);
				driver.setAvailableStatus(false);
				
				timer.schedule(new TimerTask() {
					@Override
					public void run() {
					entry.getKey().setAvailableStatus(true);
					entry.setValue(false);
					timer.cancel();
					}
				},1000*kms );
				
				Summary tripSummary = new Summary(source,destination,kms,finalCost,driver);
				return tripSummary.toString();			
			}
		}
		return "sorry but there seems to be a rush and all our drivers are busy please try after some time!!!";
		
		
	}

	

	
	
	
	

}
