package com.upskill.java;

import java.util.HashMap;
import java.util.HashSet;

public class Class_4_Array_Hashmap {

	public static void main(String[] args) {

		// Variable

		int age = 30;

		System.out.println("Variable Value " + age);

		// Array store multiple value using index

		int[] ageYoda = new int[] { 30, 24, 28, 32, 55, 48, 52 };

		// Array Index [0] [1] [2] [3] [4] [5]

		System.out.println("Array Value " + ageYoda[3]);

		System.out.println("Array length " + ageYoda.length);

		// Write an array called nameYoda

		String[] nameYoda = new String[] { "Jafrin", "Imtiaz", "Kazi", "Aastha", "Rishi", "Azad" };

		System.out.println("String Array Value " + nameYoda[5]);

		System.out.println("String Array length " + nameYoda.length);

		// Multi-dimensional Array

		int[][] ageYoda2D = { { 30, 24, 28, 32, 55 }, // [0][0] [0][1] [0][2]
														// [0][3] [0][4]
				{ 95, 49, 11 } }; // [1][0] [1][1] [1][2]

		System.out.println("2D Array Value " + ageYoda2D[1][1]);

		// Multi-dimensional Print Array

		for (int i = 0; i < ageYoda2D.length; i++) {
			for (int j = 0; j < ageYoda2D[i].length; j++) {
				System.out.println("Full 2D Array " + ageYoda2D[i][j]);

			}
		}

		// Hashmap store multiple data using key-value pair, Implementation of
		// Map interface

		HashMap<String, Integer> Student = new HashMap<String, Integer>();

		Student.put("Azad", 30);
		Student.put("Aastha", 21);
		Student.put("Kazi", 27);
		Student.put("Imtiz", 30);
		Student.put("Rishi", 31);
		Student.put("Jafrin", 28);

		System.out.println("Hashmap Value, Student Age " + Student.get("Azad"));

		HashMap<String, String> Country = new HashMap<String, String>();

		Country.put("USA", "Washington DC");
		Country.put("BD", "Dhaka");
		Country.put("India", "Delhi");
		Country.put("PK", "Islamabad");

		System.out.println("HashMap Result " + Country.get("USA"));

		// Hashset store unordered collection containing unique value,
		// Implimentation of Set interface

		HashSet<String> Car = new HashSet<String>();
		Car.add("Toyota");
		Car.add("Honda");
		Car.add("Mazda");
		Car.add("Lexus");
		Car.add("Ford");

		System.out.println("HashSet Value " + Car);

	}
}
