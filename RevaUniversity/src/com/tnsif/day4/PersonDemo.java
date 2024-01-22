package com.tnsif.day4;

import java.util.*;

public class PersonDemo {

	public static void main(String[] args) {
		
		Person obj=new Person();
		String name,gender;
		int income,age,tax;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		name =sc.next();
		System.out.println("enter gender");
		gender=sc.next();
		System.out.println("enter income");
		income=sc.nextInt();
		System.out.println("enter age");
		age=sc.nextInt();
		System.out.println("enter tax");
		tax=sc.nextInt();
		obj.setName(name);
		obj.setGender(gender);
		obj.setIncome(income);
		obj.setAge(age);
		obj.setTax(tax);
		System.out.println(obj);
		sc.close();
				
		
		

	}

}
