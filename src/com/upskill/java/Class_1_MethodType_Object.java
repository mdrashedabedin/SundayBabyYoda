package com.upskill.java;

public class Class_1_MethodType_Object {
	
	static int hourlyIncome = 65; //instance variable, global variable
	//Manual QA = 40-55$, Automation QA = 50-70$, SDET = 60-80$

	public static void main(String[] args) {
		
		//Static Method - can call directly
		weeklyIncomeVoid();
		
		System.out.println("Monthly Income :::" + monthlyIncomeReturn2());
		System.out.println("Job Title :::" +jobTitle());
		
		//Void non-static Method - have to create class object and call it
		Class_1_MethodType_Object myobj = new Class_1_MethodType_Object();
		myobj.annualIncomeVoid();
		
		//Class name			object name = new class name()
		int monthly = myobj.monthlyIncomeReturn();
		System.out.println("Monthly Income ::: " + monthly);
	}
	
/* 	Types of Methods
  	1.Void Method - when method is empty you can write any statement, dont have to return anything
   	2.Static Method - dont have to create object to call
   	3.Return Type Method - must have to return any data    
   	*/
	
	
	//Void non-static Method
	public void annualIncomeVoid(){
		int annual = hourlyIncome * 2000;
		System.out.println("Annual Income ::: " + annual);
	}
	
	//Static Method
	public static void weeklyIncomeVoid(){
		int weekly = hourlyIncome * 40;
		System.out.println("Weekly Income ::: " + weekly);
	}
	
	//Return Type Method - non-static
	public int monthlyIncomeReturn(){
		int monthly = hourlyIncome * 180;
		return monthly;
	}
	
	//Return Type Method - static
	public static int monthlyIncomeReturn2(){
		int monthly = hourlyIncome * 180;
		return monthly;
	}



		public static String jobTitle(){
			String title = "QA Automation Engineer";
			return title;
		}
		
		}


