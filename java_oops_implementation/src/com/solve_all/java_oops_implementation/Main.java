package com.solve_all.java_oops_implementation;

import java.util.Timer;
import java.util.TimerTask;

import com.solve_all.java_oops_implementation.service.CarBookingService;
import com.solve_all.java_oops_implementation.service.DriverService;
import com.solve_all.java_oops_implementation.service.UserService;

public class Main {
	
	public static void main(String[] args)
	{
		System.out.println("hi there");
		
		UserService userService = new UserService();
		userService.addNewUser("shreyas", 1, 23, "male");
		userService.addNewUser("adesh", 2, 28, "male");
		
		System.out.println(userService.findUserById(1));
		System.out.println(userService.findUserById(2));
		
		DriverService driverService = new DriverService();
		driverService.createNewDriver("vignesh", 1, 32, "male", "car");
		
		System.out.println(driverService.findDriverById(1));
		
		System.out.println(userService.rechargeUserWallet(userService.findUserById(1), 10000));
		
		CarBookingService carBookingService = new CarBookingService();
		System.out.println(carBookingService.bookTrip(userService.findUserById(1), "nagar", "pune", 10));
		
		System.out.println(driverService.findDriverById(1).isAvailableStatus());
		
		Timer timer = new Timer();
		
		timer.schedule(new TimerTask() {
			public void run() {
				System.out.println(driverService.findDriverById(1).isAvailableStatus());
				timer.cancel();
			}
		}, 1000*11);
		
		System.out.println();
		
		
		
		
	}

}
