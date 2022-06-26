package com.upskill.assignment2;

public class Assignment_2_7 {
	/*
	 * You are given two integer number (a=25, b=30), write a program to swap
	 * them and display result on the screen.
	 */

	public static void main(String[] args) {
		swap();

	}

	public static void swap() {
		int a = 25;
		int b = 30;
		int temp;

		temp = a;
		a = b;
		b = temp;

		System.out.println("Swap a " + a);
		System.out.println("Swap b " + b);
	}
}
