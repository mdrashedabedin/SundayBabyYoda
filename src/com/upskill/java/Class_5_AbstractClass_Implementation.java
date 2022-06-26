package com.upskill.java;

public class Class_5_AbstractClass_Implementation extends Class_5_AbstractClass {

	public static void main(String[] args) {

		Class_5_AbstractClass_Implementation myobj = new Class_5_AbstractClass_Implementation();
		myobj.iDoor();
		System.out.println("Number of Wheel in Car : " + myobj.iWheel());
		System.out.println("Color of the Car : " + myobj.iColor());
		myobj.iSeat();
		myobj.iMirror();
		myobj.iHeadLight();
	}

	public void iDoor() {
		int numDoor = 2;
		System.out.println("Number of Door in Car : " + numDoor);
	}

	public int iWheel() {
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

	public void iMirror() {

		int mirror = 2;
		System.out.println("Number of Mirror : " + mirror);

	}

	public void iHeadLight() {
		int headLight = 4;
		System.out.println("Number of Headlight : ");
	}

}
