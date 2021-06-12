package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class checkforVowels {
	private static final String VOWELS = "aeiou";

	public static void main(String[] args) throws IOException {
		
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter the character");
   char ch=(char)br.read();
   if(VOWELS.contains((ch +"").toLowerCase())) {   
	   System.out.println("Input char is a wovel");
   }   
   else {	   
	   System.out.println("Input char is not a wovel");
   }  
	}
}
