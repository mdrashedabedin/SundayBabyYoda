package com.upskill.java;

public class Class_6_Singleton {

//	Singleton is class that can have only one object
//	Private constructor, it prevents any other class from instantiating 

	private Class_6_Singleton(){
		
		
		
		
	}
	
	private static Class_6_Singleton objSingleton = new Class_6_Singleton ();
	
//	Static Instance Method
	
	public static Class_6_Singleton getInstance(){
		return objSingleton;
	}
	
	protected static void demo (){
		System.out.println("Demo method for singleton class");
	}
	
	
	
}
