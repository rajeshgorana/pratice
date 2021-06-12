package sample;

import java.util.Scanner;

public class calcProgram {

	public static void main(String[] args) {
		
		System.out.println("Enter the numbers");
		
	Scanner sc= new Scanner(System.in);
	
	double num1=sc.nextDouble();
	
	double num2=sc.nextDouble();
	
	System.out.println("ENter the operator");
	
	char op = sc.next().charAt(0);
	
	double o =0;
	
	switch(op) {
		case'+':
			
			o= num1 + num2;
			
			break;
			
		case'-':
			o= num1- num2;
			break;
			
		case'*':
			o= num1*num2;
			break;
		
			
		case'/':
			o= num1/num2;
			break;
			
		default:
			System.out.println("Wrong inout is entered");
			
			break;
	}
	
	//System.out.println("output is:" +o);
	System.out.println(num1 + " " + op + " " + num2 + " ="  + o );	


	}

}
