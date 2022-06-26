package com.upskill.assignment2;

public class practice {

	public static void main(String[] args) {
		
		 // Check for number prime or not
	    static boolean isPrime(int n)
	    {
	 
	        // Check if number is less than
	        // equal to 1
	        if (n <= 1)
	            return false;
	 
	        // Check if number is 2
	        else if (n == 2)
	            return true;
	 
	        // Check if n is a multiple of 2
	        else if (n % 2 == 0)
	            return false;
	 
	        // If not, then just check the odds
	        for (int i = 3; i <= Math.sqrt(n); i += 2)
	        {
	            if (n % i == 0)
	                return false;
	        }
	        return true;
	    }
	}
	
	
	
	
	int value = 53;

	if (value <= 50) {
		System.out.println("FAILURE");
	}

	else {
		if (value >= 90 && value <= 100) {
			System.out.println("MASTER");
		} else {
			System.out.println("PROFESSIONAL");
		}
	}

