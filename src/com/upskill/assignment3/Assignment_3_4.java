package com.upskill.assignment3;

public class Assignment_3_4 extends Practice0077 {

//	 Write a java program that explains runtime polymorphism.
	
	public static void main(String[] args) {

		Assignment_3_4 myobj = new Assignment_3_4();
		
		myobj.weeklyWorkhours();
		
	}

	public static void weeklyWorkhours() {

		int days = 5;
		int weekly = hours * days;

		System.out.println("Weekly Hours Worked ::: " + weekly);
	
}
}