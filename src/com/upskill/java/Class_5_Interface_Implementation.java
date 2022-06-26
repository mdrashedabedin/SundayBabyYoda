package com.upskill.java;

public class Class_5_Interface_Implementation implements Class_5_Interface {

	public static void main(String[] args) {
		Class_5_Interface_Implementation myobj = new Class_5_Interface_Implementation();
		myobj.iDoor();
		System.out.println("Number of Wheel in Car : " + myobj.iwheels());
		System.out.println("Color of the Car : " + myobj.iColor());
		myobj.iSeat();
	}

	public void iDoor() {
		int numDoor = 2;
		System.out.println("Number of Door in Car : " + numDoor);
	}


	public int iwheels() {
int numWheel = 4;
		return numWheel;
	}


	public String iColor() {
		String color = "Blue";
		return color;
	}

	public void iSeat() {
		int numSeat = 5;
		System.out.println("Number of Seats in Car : " + numSeat);
		
	}
	
	
/*
 	(Parent)				(Keyword)				(Child)
 	  Class					extends					Class
 	  Abstract Class			extends				class
 	Interface				Impliments				Class
 	Interface				extends					Interface
 */
	
	
	
}
