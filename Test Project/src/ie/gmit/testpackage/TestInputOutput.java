package ie.gmit.testpackage;
import java.io.*;
import java.util.*;

public class TestInputOutput {

	 public static void main(String args[]) throws IOException {  
	      FileInputStream in = null;
	      FileOutputStream out = null;

	      try {
	         in = new FileInputStream("in.txt");
	         out = new FileOutputStream("output.txt");
	         
	
	         int c;
	         while ((c = in.read()) != -1) {
	            out.write(c);
	         }
	      }finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }
	   }
}