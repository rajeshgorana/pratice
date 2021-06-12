package sample;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println( "Enter a  number");
		
		Scanner sc = new Scanner(System.in);
		
		int num=sc.nextInt();
		
		sc.close();
		
		
		primecalc(num);
		
		
	}
		
	public static void primecalc(int num) {
			 
			 int count =0;
			 
			 for (int i=1;i<=num;i++) {
				 
				 if(num%i==0) {
					 
					 count++;
					 				 
				 }
				 
				 	 
			 }
			if(count==2){
				
				System.out.println("its Prime number");
			}
			
			else {
				
				System.out.println("not a prime number");
			}
				
			
		}
		
		
		
	
}
