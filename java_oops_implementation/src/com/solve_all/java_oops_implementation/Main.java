package com.solve_all.java_oops_implementation;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import com.solve_all.java_oops_implementation.service.CarBookingService;
import com.solve_all.java_oops_implementation.service.DriverService;
import com.solve_all.java_oops_implementation.service.UserService;

public class Main {
	
	private static Scanner scan = new Scanner(System.in);
	private static UserInterface userInterface = new UserInterface();
	private static UserService userService = new UserService();
	private static DriverService driverService = new DriverService();
	private static DriverInterface driverInterface = new DriverInterface();

	
	public static void main(String[] args)
	{
		
		userService.addNewUser("shreyas", 1, 23, "male");
		userService.addNewUser("adesh", 2, 28, "male");
		driverService.createNewDriver("vignesh", 1, 32, "male", "car");
		driverService.createNewDriver("raju", 2, 32, "male", "bike");
		
		runner();		
		
	}

	public static void runner()
	{
		System.out.println("hi welcome to the ride hailing app \nplease select your role!!\n"
				+ "1] User\n"
				+ "2] Driver\n"
				+ "3] new User\n"
				+ "4] new Driver");
		String userRole = scan.nextLine();
		if(userRole.equals("user"))
		{
			userInterface.launchInterface();
			runner();
		}
		if(userRole.equals("driver"))
		{
			driverInterface.launchInterface();
			runner();
		}
		if(userRole.equals("new driver"))
		{
			driverInterface.newDriverRegistrationInterface();
			runner();
		}
		if(userRole.equals("new user"))
		{
			userInterface.newUserRegistrationInterface();
			runner();
		}
		else 
			{
				System.out.println("please enter valid intput option!!!");
				runner();
			}
	}

}
