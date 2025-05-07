package com.solve_all.java_oops_implementation.entity;

import com.solve_all.java_oops_implementation.Person;

public class User extends Person {

	private int wallet;

	public User(String name, int id, int age, String gender) {
		super(name, id, age, gender);
		
		wallet =0;
	}
		

	public int getWallet() {
		return wallet;
	}

	public void setWallet(int wallet) {
		this.wallet = wallet;
	}
	
	
	
	
	
}
