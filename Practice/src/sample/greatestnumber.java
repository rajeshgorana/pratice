package sample;

import java.util.Scanner;

public class greatestnumber {
	
	


	public static void main(String[] args){
		  //User input the array
		    int n;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of size you want in array:");
	        n = s.nextInt();
		    int a[] = new int[n];
	       
	        
	        for(int i = 0; i < n; i++)
	        {
	            System.out.println("Enter all the elements:"+ i) ;


	            a[i] = s.nextInt();
	        }
	        int max= a[0];
       	    int min= a[0];
	        //find min max in the array
	        for(int j=0; j<n;j++)
	        {
	        	        	
	        	if(a[j]>max) {
	        		
	        		max = a[j];
       		
	        		
	        	}
	        	else if  (a[j] < min) {
	        		min = a[j];  		
	        		
	        	}    
	        	
	        }
	        System.out.println("Max element of array is: " +max);
	        System.out.println("Min element of array is: " +min);
	        
	}

}
