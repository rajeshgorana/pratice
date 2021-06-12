package sample;

import java.util.Scanner;
//reverse
public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter  Number");
		int a= sc.nextInt();
		
		int rem;
		int sum = 0;
		for(int i=0; i<=a; i++) {
			
			 rem =a%10;
			 sum = sum*10 + rem ;
			 a= a/10;
			
		}
		
		System.out.println(sum);
		
		
		

	}

}
