package ie.gmit.testpackage;


//Java program to demonstrate working of ArrayList in Java 
import java.io.*; 
import java.util.*; 

public class ArrayLists {

	public static void main(String args[]) {
		
		int n = 5; 
		String name;
		int del;
		
		ArrayList<String> emasarray = new ArrayList<String>(n);
		emasarray.add("Steve");
		emasarray.add("Tom");
		emasarray.add("Mark"); //set other elements
		
        // Printing elements 
        System.out.println(emasarray); 
        
        //asks you to add name
        System.out.println("Enter name");
        Scanner inp= new Scanner(System.in);
      
        name= inp.nextLine(); //gets user input
        emasarray.add(name);
        System.out.println(emasarray); 
        
        try {
        	
        	System.out.println(emasarray); 
            
            //asks you to remove index
            System.out.println("remove index");
            Scanner inp2 = new Scanner(System.in);
          
            del = inp2.nextInt(); //gets user input
            emasarray.remove(del);
            System.out.println(emasarray); 
            
        }  catch (ArithmeticException e) { 
	         System.out.println("You should not divide a number by zero");
	      }
	      catch (Exception e) {
	         System.out.println("Exception occurred");
	         
	      }
    
      
  
       
  
        // Displaying ArrayList after deletion 
       // System.out.println(emasarray); 
  
        // Printing elements one by one 
      //  for (int i=0; i<emasarray.size(); i++) 
         //   System.out.print(emasarray.get(i)+" "); 
   // } 
		
	}
}
