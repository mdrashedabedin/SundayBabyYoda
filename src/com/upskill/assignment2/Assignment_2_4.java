package com.upskill.assignment2;

public class Assignment_2_4 {
	//  Write a for loop upto 500 which will increase the value double every time.
	

	public static void main(String[] args) {

		loop();
	}
	
	public static void loop(){
		int i;
		for (i = 1; i<=512; i*=2 ){
			System.out.println("VALUE DOUBLED NUMBER " + i);
			
		}
	}

}
