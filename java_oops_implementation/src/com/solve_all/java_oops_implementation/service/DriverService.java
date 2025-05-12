package com.solve_all.java_oops_implementation.service;

import com.solve_all.java_oops_implementation.entity.Driver;
import com.solve_all.java_oops_implementation.repository.DriverRepo;

public class DriverService {
	
	public String createNewDriver(String name, int id, int age, String gender, String vehicleType)
	{
		Driver driver = new Driver(name, id, age, gender, vehicleType);
		if(vehicleType.equals("car"))
		{
			DriverRepo.getCarDriverList().put(driver, driver.isAvailableStatus());
			return "new CAR driver added to the platform succesfully!!!";
		}
		if(vehicleType.equals("bike"))
		{
			DriverRepo.getBikeDriverList().put(driver, driver.isAvailableStatus());
			return "new BIKE driver added to the platform succesfully!!!";
		}
		return "there seems to have been a problem please check the details entered for accuracy and try again :)";
	}
	
	public Driver findCarDriverById(int id)
	{
		try {
		Driver driver = DriverRepo.getCarDriverList().entrySet().stream()
				.filter(d -> d.getKey().getId()==id)
				.findFirst()
				.orElseThrow().getKey();
		return driver;
		} catch(Exception e) {
			Driver driver = null;
			return driver;
		}
		
		
	}
	
	public Driver findBikeDriverById(int id)
	{
	
		try {
			Driver driver = DriverRepo.getBikeDriverList().entrySet().stream()
					.filter(d -> d.getKey().getId() == id)
					.findFirst()
					.orElse(null).getKey();
			return driver;
		} catch(Exception e) {
			Driver driver = null;
			return driver;
		}
			
		
	}
	
	public Driver findDriverById(int id)
	{
		Driver a = findCarDriverById(id);
		Driver b = findBikeDriverById(id);
		return pickNonNullDriver(a, b);
		
	}
	
	public Driver pickNonNullDriver(Driver a,Driver b)
	 {
		 if(a!=null)
		 {
			 return a;
		 }
		 else
			 return b;
	 }

}
