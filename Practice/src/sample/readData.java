package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class readData {

	public static void main(String[] args) throws IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("enter the string");
	 String str=br.readLine();
	 
	 System.out.println(str);
		System.out.println("enter the integer");

	   int a=Integer.parseInt(br.readLine());
	   
	   System.out.println(a);
	   
	   System.out.println("Enter double");
	   
	   double d=Double.parseDouble(br.readLine());
	   
	   System.out.println(d);
	    
	   System.out.println("Enetr character");
	   
	   char c=(char)br.read();
	   
	   System.out.println(c);
	   
	
	}

}
