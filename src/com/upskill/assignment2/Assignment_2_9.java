package com.upskill.assignment2;

public class Assignment_2_9 {

/* 9. Write a program to swap two string variables (Talen, Tech) and display result on the 
     screen. */
	
	public static void main(String[] args) {
swapTT();
	}

	public static void swapTT(){
		
		String a = "talent";
		String b = "tech";
		String temp;
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println(" A Swap " + a);
		System.out.println(" B swap " + b);
		
	}
	
}
