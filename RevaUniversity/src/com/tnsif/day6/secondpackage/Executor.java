package com.tnsif.day6.secondpackage;

import com.tnsif.day6.firstpackage.Base;
import com.tnsif.day6.firstpackage.Person;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj=new Person();
		obj.setAge(23);
		obj.setCity("Bangalore");
		obj.setName("Sharon");
		
		Base obj2=new Base();
		obj2.methodPublic();

	}

}
