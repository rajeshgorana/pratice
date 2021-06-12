package sample;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		
          String str2 = "";
		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter a Valid String to be reversed");
		 
           String str= sc.nextLine();

          char[] chr =str.toCharArray();

         for(int i=chr.length-1; i>=0; i--) {
	          str2 = str2 + chr[i];
	
             }

               System.out.println(str2);
		
	    }

}
