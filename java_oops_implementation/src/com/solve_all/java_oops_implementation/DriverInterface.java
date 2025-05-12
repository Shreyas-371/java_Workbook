package com.solve_all.java_oops_implementation;

import java.util.Scanner;

import com.solve_all.java_oops_implementation.entity.Driver;
import com.solve_all.java_oops_implementation.service.BikeBookingService;
import com.solve_all.java_oops_implementation.service.CarBookingService;
import com.solve_all.java_oops_implementation.service.DriverService;

public class DriverInterface {
	 
	 private Scanner scan = new Scanner(System.in);
	 private DriverService driverService= new DriverService();
	 CarBookingService carBookingService = new CarBookingService(); 
	 BikeBookingService bikeBookingService = new BikeBookingService();
	
	 public void launchInterface()
	 {
		 System.out.println("//////////////////////////////////////////////\n"
		 		+ "hi user please enter your id to log-in\n");
		 
		 int id = scan.nextInt();
		 Driver currentUser = driverService.findDriverById(id);
	
		 boolean exit = false;
		 while(!exit)
		 {
			System.out.println("\nhello " + currentUser.getName() + " welcome!!!\n"
				 		+ "please select from below actions to perform");
				 
			System.out.println("1] view Driver profile\n"
				 		+ "2] Exit");
				 
			int option = scan.nextInt();
			scan.nextLine();
			 switch(option) {
			 
			 case 1:
				 System.out.println(currentUser.toString());
				 break;
			 case 2:
				 exit = true;
				 break;
			 default:
				 System.out.println("try again by entering valid option number");
				 
			
			 }
		 }
			 
		 
	 }
	 
	 
	 
	 public void newDriverRegistrationInterface()
	 {
		 System.out.println("hello new Driver welcome to Ride Share!!!\n"
		 		+ "your first step is to get registered!!\n"
		 		+ "please enter required information as promted ->\n");
		 
		 System.out.println("name :\n");
		 String name = scan.nextLine();
		 System.out.println("id :\n");
		 int id = scan.nextInt();
		 System.out.println("age :\n");
		 int age = scan.nextInt();
		 scan.nextLine();
		 System.out.println("gender :\n");
		 String gender = scan.nextLine();
		 System.out.println("vehicleType :\n");
		 String vehicleType = scan.nextLine();
		 
		 System.out.println(driverService.createNewDriver(name, id, age, gender, vehicleType));
	 }
	

}
