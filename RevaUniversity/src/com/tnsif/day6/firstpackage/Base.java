package com.tnsif.day6.firstpackage;

public class Base {
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	void methodDefault()
	{
		System.out.println("Default variable"+varDefault);
		System.out.println("Default Method");
	}
	void methodPublic()
	{
		System.out.println("public variable"+varPublic);
		System.out.println("Public Method");
	}
	void methodPrivate()
	{
		System.out.println("private variable"+varPrivate);
		System.out.println("Private Method");
	}
	
	void methodProtected()
	{
		System.out.println("protected variable"+varProtected);
		System.out.println("protected Method");
	}

}
