package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class finBiggestno {

	public static void main(String[] args) throws IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter first number");
	int a= Integer.parseInt(br.readLine());
	System.out.println("Enter second number");

	int b= Integer.parseInt(br.readLine());
	System.out.println("Enter third number");

	int c= Integer.parseInt(br.readLine());
	
	if(a>b && a>c) {
		
		System.out.println("the biggestno is: "+ a);
		
		
	} else if(b>a&&b>c){
		
		System.out.println("the biggestno is: "+ b);

	} else if (c>a&&c>b) {
		
		System.out.println("the biggestno is: "+ c);

	}
	else {
		
		System.out.println("Nos are equals");
	}
	
	
	

	}

}
