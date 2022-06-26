package com.upskill.assignment1;

public class Assignment_1_4 {
	
/*A function returns 30, another function returns 50. 
 Write a java program which will display subtraction value from bigger number to smaller.*/
	

	public static void main(String[] args) {
		value();
		System.out.println("Function A Return ::: " + functionreturnA());
		System.out.println("Function B Return ::: " + functionreturnB());
		
	}
	public static void value(){
		int valuereturn1 = 50;
		int valuereturn2 = 30;
		int substruction = valuereturn1-valuereturn2;
		
		System.out.println("Substraction ::: " +substruction);

	}
	
	public static int functionreturnA(){
		
		int functionreturnA = 30;
		return functionreturnA;
		
	}
	
	public static int  functionreturnB(){
		
		int functionreturnB = 50;
		return functionreturnB;
	}

}
