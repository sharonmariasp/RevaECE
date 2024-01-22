package com.tnsif.day5;

import java.util.Scanner;

public class CustomerDemo {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		String name,id,city;
		
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter id");
		id=sc.nextLine();
		System.out.println("enter City");
		city=sc.nextLine();
		
	
		//default constructor
		Customer c1=new Customer();
		c1.setCustomerName(name);
		c1.setCustomrId(id);
		c1.setCustomerCity(city);
		System.out.println(c1);
	
	//parameterized constructor
	Customer c2 = new Customer(name,id,city);
	System.out.println("Enter Name:");
	name=sc.nextLine();
	System.out.println("Enter id");
	id=sc.nextLine();
	System.out.println("enter City");
	city=sc.nextLine();
	
	System.out.println(c2);
	sc.close();
	
	}
	

}

