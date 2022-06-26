package com.upskill.assignment2;

public class Assignment_2_3 {

	/*
	  Write two java functions which will return two different integer values,
	  write a program to compare those numbers and send message that one number
	  is bigger than other. (hints: using if..else)
	 */

	public static void main(String[] args) {
		
		System.out.println("Function A Return ::: " + functionAreturns());
		System.out.println("Function B Returns ::: " + functionBreturns());
		compare();

		
	}
	
	public static int functionAreturns(){
		int valueA = 45;
		return valueA;
	}
	public static int functionBreturns(){
		int valueB = 90;
		return valueB;
	}
	
	public static void compare(){
		
		int number = 88;
				
		if (number > 45 && number <= 90){
			System.out.println("ValueB is bigger than ValueA");
		}
		else if (number <= 45){
			System.out.println("valueA is smaller than valueB");
		}
		else{
			System.out.println("N/A");
		}
	}

}
