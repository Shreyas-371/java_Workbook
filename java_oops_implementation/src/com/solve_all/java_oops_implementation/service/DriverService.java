package com.solve_all.java_oops_implementation.service;

import com.solve_all.java_oops_implementation.entity.Driver;
import com.solve_all.java_oops_implementation.repository.DriverRepo;

public class DriverService {
	
	public String createNewDriver(String name, int id, int age, String gender, String vehicleType)
	{
		Driver driver = new Driver(name, id, age, gender, vehicleType);
		if(vehicleType == "car")
		{
			DriverRepo.getCarDriverList().put(driver, driver.isAvailableStatus());
			return "new CAR driver added to the platform succesfully!!!";
		}
		if(vehicleType == "bike")
		{
			DriverRepo.getBikeDriverList().put(driver, driver.isAvailableStatus());
			return "new BIKE driver added to the platform succesfully!!!";
		}
		return "there seems to have been a problem please check the details entered for accuracy and try again :)";
	}
	
	public Driver findDriverById(int id)
	{
		Driver driver = DriverRepo.getCarDriverList().entrySet().stream()
				.filter(d -> d.getKey().getId()==id)
				.findFirst()
				.orElse(null).getKey();
		if(driver != null)
		{
			return driver;
		}
	
			driver = DriverRepo.getBikeDriverList().entrySet().stream()
					.filter(d -> d.getKey().getId() == id)
					.findFirst()
					.orElse(null).getKey();
			if(driver !=null)
			{
				return driver;
			}
		
		return null;
		
	}

}
