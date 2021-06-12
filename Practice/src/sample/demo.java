package sample;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class demo {
// separate 10*8 
	public static void main(String[] args) {
		System.out.println("Enter the number");
		
		Scanner sc = new Scanner(System.in);
	   String s=	sc.nextLine();   
	    
	    String [] st1= s.split("(?<=[-+*/])|(?=[-+*/])");
	    
		        double  o =0;
	
			String  op = st1[1];
		
				
				switch(op.charAt(0)) {
		         case '+':
		        	 
		        	 o= Integer.parseInt(st1[0]) + Integer.parseInt(st1[2]) ;  
		        	 
		        	 break;
		         case '-':
		        	 o= Integer.parseInt(st1[0]) - Integer.parseInt(st1[2]) ;  
		        	 
		        	 break;

		         case '*':
		        	 o= Integer.parseInt(st1[0]) * Integer.parseInt(st1[2]) ;  
		        	 
		        	 break;

		         case '/':
		        	 
		        	 o= Integer.parseInt(st1[0]) / Integer.parseInt(st1[2]) ;  
		        	 
		        	 break;
		        	 
		         default:
		 			System.out.println("Wrong inout is entered");
		 			
		 			break;

		        
		           
		     }

		    	System.out.println(o);
				
				
			
			


	    
	    }
	  
	
		
		
		
	}


