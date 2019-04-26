

import java.util.Scanner;	// use the Scanner class located in the "java.util" directory


		
		// Assignment #: 1
		// Arizona State University - CSE205
		// Name: Ernesto Silva
		// StudentID: 1204937171
		// Lecture: MW 4:30-5:45
		//Description: This class reads an integer from a keyboard. I will implement conditional statements and loops to provide the correct output. 

	  

	public class Assignment2 {
	
	
		 
	
		public static void main (String[] args) {
	     
		  
		  int number;
		  int count = 0;
		  int sum = 0;
		  int min = 0;
		  int minEven = 0;
		  
	     
	     
	     
	     Scanner console = new Scanner(System.in);

	     
	     
	     
	     
	     
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	     
	     
	     
	     
	     do {
	     
	     
	    	 number = console.nextInt();     // read an integer entered by a user
	    	 
	    	
	    	 
	    	
	    	 
	    	 
	    	 if ( number % 2 == 0 || number % -2 == 0 ) {		// If number is even ( + or - ) make that the smallest even integer. 
	    		 												// Going off provided input
    			 
	    		 
	    		 if ( number < 0 )
    			 
    			 minEven = number;
    			//System.out.println();
    			 
    		
	    	 }
	    	 
	    	 
	    	 
	    	 
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 if ( number < 0 ) {	
	    		 
	    		 
	    		 count++;			// For every negative number add one to count
	    		 
	    		 
	    		 
	    		 min = number;		// If number is less than 0 then store it here. ( Went by provided input )
	    	
	    		 
	    	 }
	    	 
	    	 
	    	 
	    	 
	    	
	   
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 if ( number % 2 == 1 || number % -2 == -1 ) {   // This "Or" will add both + and - odd numbers.
	    		 
	    		 
	    		 
	    		 
	    		 sum += number;						// For every odd number ( + or -) will then be added to the sum. 
	    		 									// Compounds over with every odd number until input is 0.
	    		 
	    		 
	    		 
	    		 }
	    	 
	    	 
	    	 
	    	 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    	 

	    		 
	    		 
	    		
	    	 }
	    	
	    	
	     	
	     
	     
	     	while ( number != 0 ); {		// Program runs until input is 0.
	     		
	     		
	     	
	     		
	     
	     	System.out.print("The minimum integer is " + min + ".\n" +
	     			"The smallest even integer in the sequence is " + minEven + ".\n" +
	     			"The count of negative integers in the sequence is " + count + ". \n" +
	     			"The sum of odd integers is " + sum + ".\n");
	 
		
		
		
		
		
	     	
	     	
	     	}
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
