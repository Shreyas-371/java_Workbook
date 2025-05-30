package com.solve_all.java_oops_implementation;

public abstract class Person {
	
	 private String name;
	 private int id;
	 private int age;
	 private String gender;
	 
	 
	public Person(String name, int id,  int age, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", age=" + age + ", gender=" + gender + "]";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}
	 
	
	 
	 
	 
	

}
