package com.basic.main;

public class BasicSyntax {
	
	public static void main(String[] args)
	{
	new	BasicSyntax().mainClassNonSataticMethod();

	}
	
	static void mainClassMethod()
	{
		System.out.println("Hi! this is my first program")	;
		SecondClass.staticMethod();  //call static method through class name
		new SecondClass().nonStaticMethod();  // call default constructor and non static method
		new SecondClass(4); // call parameterized constructor
	}

	void mainClassNonSataticMethod()
	{
		mainClassMethod();
	}
}

class SecondClass
{
	SecondClass()
	{
		System.out.println("second class default constrcutor");
	}
	SecondClass(int te)
	{
		System.out.println("second class parameterized constrcutor" + te);
	}
	
	void nonStaticMethod()
	{
		System.out.println("non static method");
	}
	
	static void staticMethod()
	{
		System.out.println("static method");
	}
	
}
