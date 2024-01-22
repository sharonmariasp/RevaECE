package com.tnsif.day5;

public class Customer {
	private String  customerName;
	private String customerCity;
	private String customrId;
	//default constructor
	public Customer() {
		System.out.println("Default constructor");
	}
	//parameterized constructor
	public Customer(String customerName, String customerCity, String customrId) {
		System.out.println("Parametrized constructor");
		this.customerName = customerName;
		this.customerCity = customerCity;
		this.customrId = customrId;
	}
	//getters and setters
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	public String getCustomrId() {
		return customrId;
	}
	public void setCustomrId(String customrId) {
		this.customrId = customrId;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerCity=" + customerCity + ", customrId=" + customrId
				+ "]";
	}
	
	
	

}
