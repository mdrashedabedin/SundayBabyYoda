package com.upskill.java;

public class Class_2_Loops extends Class_3_Polymorphism {

		/*Type of loops
		 1. For Loop
		 2. While Loop
		 3. Do While Loop
		 4. Infinite Loop 
		 */	
	public static void main(String[] args) {
	
		Class_2_Loops myobj = new Class_2_Loops ();
	
//		practiceForLoop();
//		practiceWhileLoop();
//		practiceDoWhile();
//		practiceInfiniteLoop();
//		practiceNestedForLoop();
//		multiplicationTable();
		
}

	public static void practiceForLoop(){				//For Loop - do it again and again upper limit	
		int i;											// Initialize Variables
		for(i=1;i<=22;i+=3){							//Setting Lower limit, Upper limit, Increments or Decrement
		System.out.println("For Loops Number = " + i);	//Statement
		}
	}
	
	public static void practiceWhileLoop(){
		
		int i = 1;										//while Loop - Dp again and again upto condition match
		while(i<=100){									//Initialize Variable
		System.out.println("While Loops Number = " + i);	//Statement
		i++;											//Increment or decrement
		}
		
		
	}
	
	public static void practiceDoWhile(){					// Do while Loop - Do action Then match condition
		int i = 1;											// Initialize Variable
		do{System.out.println("Do While Loops Number = " + i);	//Statement
		i++;												// Increment
		} while (i<=1000);									//Checking Condition
		
		
	}
	
	
	public static void practiceInfiniteLoop(){			//Initialize Variables
		int i = 1;				
		for (i=1; ;i++){								//leaveing the upper value empty
		System.out.println("Infinite Loops Number = " + i);	//Statement
		}
			
	}
	
	public static void practiceNestedForLoop(){							//Nested loop = loop inside

		int i;															//Initializing Variable i
		int j;															//Initializing Variable j
		for (i=1; i<10; i++){											//1st loop for i
			for (j=1; j<=10; j++){										//2nd loop for j
		System.out.println("Nested For Loops Number = "+ i + ":" + j);	//Statement for j loop
		}
		System.out.println("Increase value of i -> " + i);				//Statement for i loop
	}
		
		
	}
	
	
	public static void multiplicationTable(){
		
		for (int row = 1; row <=10; row++){
			for (int col = 1; col <= 10; col++){
				int MultiplicationTable = row * col;
				System.out.print(MultiplicationTable + " ");
			}
			System.out.println("");
		}
	}
	
	
}
