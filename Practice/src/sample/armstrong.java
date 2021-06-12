package sample;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// Armstrong Number in Java: A positive number is called armstrong number if it is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.


System.out.println("Enter number");

Scanner sc= new Scanner(System.in);

int n= sc.nextInt();

int temp=n;

int a, c = 0;

while(n>0) {
	
	  a=n%10; 
	  n=n/10;
	  
	   c = c + (a*a*a);

}   
if(temp==c) {
	
	System.out.println("Armstrong");
		
}

else {
	
	System.out.println("not a armstrong");
	
	

}


	}

}
