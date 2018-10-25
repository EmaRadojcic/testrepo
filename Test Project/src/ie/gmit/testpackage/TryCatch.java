package ie.gmit.testpackage;

import java.util.*;

public class TryCatch {

	public static void main(String args[]) {
		int num1, num2;
	      boolean keepRunning = true;
	     
	      while(keepRunning) {
	      try {
	    	  System.out.println("Enter first and second number:");
	          Scanner inp= new Scanner(System.in);
	        
	          num1 = inp.nextInt();
	          num2 = inp.nextInt();
	          
	         System.out.println(num1/num2);
	         System.out.println("good, try again");
	      }
	      catch (ArithmeticException e) { 
	         System.out.println("You should not divide a number by zero");
	      }
	      catch (Exception e) {
	         System.out.println("Exception occurred");
	         
	      }
	      
	}

}

}
