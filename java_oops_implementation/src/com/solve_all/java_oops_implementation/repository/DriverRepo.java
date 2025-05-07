package com.solve_all.java_oops_implementation.repository;

import java.util.HashMap;
import java.util.Map;

import com.solve_all.java_oops_implementation.entity.Driver;

public class DriverRepo {
	
	private static Map<Driver,Boolean> carDriverList = new HashMap<>();
	private static Map<Driver,Boolean> bikeDriverList = new HashMap<>();
	
	
	
	public static Map<Driver, Boolean> getCarDriverList() {
		return carDriverList;
	}
	public static void setCarDriverList(Map<Driver, Boolean> carDriverList) {
		DriverRepo.carDriverList = carDriverList;
	}
	public static Map<Driver, Boolean> getBikeDriverList() {
		return bikeDriverList;
	}
	public static void setBikeDriverList(Map<Driver, Boolean> bikeDriverList) {
		DriverRepo.bikeDriverList = bikeDriverList;
	}
	
	
	
	
	
	

}
