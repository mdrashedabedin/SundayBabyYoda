package com.upskill.assignment1;

public class Practice007 {

	
	/*A rectangle width and length are: 9 and 13 inches. Write a method to 
	 display the perimeter of rectangle in console output. */


	public static void main(String[] args) {
		
		Practice007 object = new Practice007();
		object.perimeter();
		object.student1();
		object.student2();
		object.student3();
		
		
				
	}
	public void perimeter(){
		
		int a = 9;
		int b = 13;
		int c = 2;
		int value = c*(a+b);
		
		System.out.println("Rectangle parameter :::"+value);
		
	}
	
	public void student1(){
		int imtiaz = 30;
		System.out.println("Imtiaz :::"+ imtiaz);
	}
	public void student2(){
		int ashiq = 31;
		System.out.println("Ashiq :::" + ashiq);
	}
	public void student3(){
		int jafrin = 32;
		System.out.println("Jafrin :::" + jafrin);
	}
	
	
	
}
	