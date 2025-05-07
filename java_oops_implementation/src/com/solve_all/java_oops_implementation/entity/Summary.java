package com.solve_all.java_oops_implementation.entity;

public class Summary {

	private String source;
	private String destination;
	private int kms;
	private int finalCost;
	private Driver driver;
	
	
	public Summary(String source, String destination, int kms, int finalCost, Driver driver) {
		super();
		this.source = source;
		this.destination = destination;
		this.kms = kms;
		this.finalCost = finalCost;
		this.driver = driver;
	}

	public String getSource() {
		return source;
	}


	public String getDestination() {
		return destination;
	}


	public int getKms() {
		return kms;
	}


	public int getFinalCost() {
		return finalCost;
	}


	public Driver getDriver() {
		return driver;
	}





	@Override
	public String toString() {
		return "Summary [source=" + source + ", destination=" + destination + ", kms=" + kms + ", finalCost="
				+ finalCost +"\n"+ driver.toString() + "]" ;
	}
	
	
	
	
	
}
