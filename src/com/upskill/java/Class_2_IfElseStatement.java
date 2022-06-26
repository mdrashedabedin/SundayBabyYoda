package com.upskill.java;

public class Class_2_IfElseStatement {

	public static void main(String[] args) {

		//nested if else Statement
	 int year = 3000;
	 
	 if (year<2000){
		 System.out.println("20st Century");
	 } else {
		 if (year>= 2019 && year <=2022){
			 System.out.println("Pandamic");
		 }
		 else if(year>=2000 && year <=2099){
			 System.out.println("21st Century");
			 
		 }
		 else {
			 System.out.println("30th Century");
		 }
	 }
		
		
		
		
		
		
		
		
		
	}
	// if else Statement
	
		public void ifElse (){
			
			//Requirements
			// less than 13 = Children
			// 13-17 = Teenager
			//18-59 = Adult
			//60-99 = Senior
			//100+ = Champion
			
			int age = 19;
			
			if (age<=13){
				System.out.println("You are Chindren!!!");
			} else if (age >= 13 && age < 18) {
	        System.out.println("You are Teenager!!!");		}
			else if (age >= 18 && age < 60) {
		        System.out.println("You are Adult!!!");		}
			else if (age >= 60 && age < 100) {
		        System.out.println("You are !!!");		}
			else {
				System.out.println("You are Champion!!!");
			}
		
		}


		}
	

