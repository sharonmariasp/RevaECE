package com.tnsif.day6.firstpackage;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name,city;
		int age;
		name=sc.nextLine();
		city=sc.nextLine();
		age=sc.nextInt();
	
		Person obj= new Person();
		
		obj.setName(name);
		obj.setCity(city);
		obj.setAge(age);
		System.out.println(obj);

	}

}
