package com.solve_all.java_oops_implementation.entity;

import com.solve_all.java_oops_implementation.Person;

public class Driver extends Person {

	private boolean availableStatus;
	private String vehicleType;
	
	public Driver(String name, int id, int age, String gender, String vehicleType) {
		super(name, id, age, gender);
		this.vehicleType = vehicleType;
		this.availableStatus = true;
		// TODO Auto-generated constructor stub
	}

	
	
	public boolean isAvailableStatus() {
		return availableStatus;
	}

	public void setAvailableStatus(boolean availableStatus) {
		this.availableStatus = availableStatus;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}



	@Override
	public String toString() {
		return "Driver [name=" + this.getName() + ", id=" + this.getId() + ", age=" + this.getAge() +
				", gender=" + this.getGender() + ", availableStatus=" + availableStatus + 
				", vehicleType=" + vehicleType + "]";
	}
	
	
	
	

}
