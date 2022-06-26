package com.upskill.assignment3;

// 2.    Write a java program which will display 5 employee information(name, age, salary and address).


public class Assignment_3_2 {
	
	String employee;
	int adAge;
	int pays;
	String location;
	
	
	public Assignment_3_2(String name, int age, int salary, String address){
		
		employee = name;
		adAge = age;
		pays = salary;
		location = address;
		
		
	}


	public static void main(String[] args) {
		
		Assignment_3_2 myobj = new Assignment_3_2("Imtiaz", 34, 75000, "Queens, NY");
		
		System.out.println("Employee Name ::: " + myobj.employee);
		System.out.println("Employee Age ::: " + myobj.adAge);
		System.out.println("Employee Salary ::: " + myobj.pays);
		System.out.println("Employee Address ::: " + myobj.location);
		
Assignment_3_2 myobj2 = new Assignment_3_2("Ashiq", 32, 72000, "Brooklyn, NY");
		
		System.out.println("Employee Name ::: " + myobj2.employee);
		System.out.println("Employee Age ::: " + myobj2.adAge);
		System.out.println("Employee Salary ::: " + myobj2.pays);
		System.out.println("Employee Address ::: " + myobj2.location);
		
Assignment_3_2 myobj3 = new Assignment_3_2("Azad", 33, 68000, "Bronx, NY");
		
		System.out.println("Employee Name ::: " + myobj3.employee);
		System.out.println("Employee Age ::: " + myobj3.adAge);
		System.out.println("Employee Salary ::: " + myobj3.pays);
		System.out.println("Employee Address ::: " + myobj3.location);
		
Assignment_3_2 myobj4 = new Assignment_3_2("Jafrin", 30, 70000, "Queens, NY");
		
		System.out.println("Employee Name ::: " + myobj4.employee);
		System.out.println("Employee Age ::: " + myobj4.adAge);
		System.out.println("Employee Salary ::: " + myobj4.pays);
		System.out.println("Employee Address ::: " + myobj4.location);
		
Assignment_3_2 myobj5 = new Assignment_3_2("Rasel", 34, 100000, "Newark, NJ");
		
		System.out.println("Employee Name ::: " + myobj5.employee);
		System.out.println("Employee Age ::: " + myobj5.adAge);
		System.out.println("Employee Salary ::: " + myobj5.pays);
		System.out.println("Employee Address ::: " + myobj5.location);





	}

}
