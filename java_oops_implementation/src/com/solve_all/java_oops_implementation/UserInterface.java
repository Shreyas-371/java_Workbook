package com.solve_all.java_oops_implementation;

import java.util.Scanner;

import com.solve_all.java_oops_implementation.entity.User;
import com.solve_all.java_oops_implementation.service.BikeBookingService;
import com.solve_all.java_oops_implementation.service.CarBookingService;
import com.solve_all.java_oops_implementation.service.UserService;

public class UserInterface {
	 
	 private Scanner scan = new Scanner(System.in);
	 private UserService userService= new UserService();
	 CarBookingService carBookingService = new CarBookingService(); 
	 BikeBookingService bikeBookingService = new BikeBookingService();
	
	 public void launchInterface()
	 {
		 System.out.println("//////////////////////////////////////////////\n"
		 		+ "hi user please enter your id to log-in\n");
		 
		 int id = scan.nextInt();
		 User currentUser = userService.findUserById(id);
		 
		
		 boolean exit = false;
		 while(!exit)
		 {
			System.out.println("\nhello " + currentUser.getName() + " welcome!!!\n"
				 		+ "please select from below actions to perform");
				 
			System.out.println("1] view user profile\n"
				 		+ "2] book a car taxi\n"
				 		+ "3] book a bike taxi\n"
				 		+ "4] recharge wallet\n"
				 		+ "5] Exit");
				 
			int option = scan.nextInt();
			scan.nextLine();
			 switch(option) {
			 
			 case 1:
				 System.out.println(currentUser.toString());
				 break;
			 case 2:
				 System.out.println("enter following details\n"
				 		+ "source : ");
				 String source = scan.nextLine();
				 System.out.println("destination : ");
				 String destination = scan.nextLine();
				 System.out.println("distance in kilometers : ");
				 int kms = scan.nextInt();
				 System.out.println(carBookingService.bookTrip(currentUser, source, destination, kms)); 
				 break;
			 case 3:
				 System.out.println("enter following details\n"
					 		+ "source : ");
				 String sourceBike = scan.nextLine();
				 System.out.println("destination : ");
				 String destinationBike = scan.nextLine();
				 System.out.println("distance in kilometers : ");
				 int kmsBike = scan.nextInt();
				 System.out.println(bikeBookingService.bookTrip(currentUser, sourceBike, destinationBike, kmsBike));
				 break;
			 case 4:
				 System.out.println("eneter the amount to recharge your wallet with!");
				 int amount = scan.nextInt();
				 System.out.println(userService.rechargeUserWallet(currentUser, amount));
				 break;
			 case 5:
				 exit = true;
				 break;
			 default:
				 System.out.println("try again by entering valid option number");
				 
			
			 }
		 }
			 
		 
	 }
	 
	 public void newUserRegistrationInterface()
	 {
		 System.out.println("hello new User welcome to Ride Share!!!\n"
			 		+ "your first step is to get registered!!\n"
			 		+ "please enter required information as promted ->\n");
			 
			 System.out.println("name :\n");
			 String name = scan.nextLine();
			 System.out.println("id :\n");
			 int id = scan.nextInt();
			 System.out.println("age :\n");
			 int age = scan.nextInt();
			 System.out.println("gender :\n");
			 String gender = scan.nextLine();
			 
			 System.out.println(userService.addNewUser(name, id, age, gender));
		 
	 }
	

}
