package sample;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		System.out.println("Enter the word");
		Scanner sc = new Scanner(System.in);
		
		String st=sc.nextLine();
		
		String rev ="";
		
		
		for(int i=st.length()-1;i>=0;i--) {
			
			rev = rev + st.charAt(i);
		}
		
		
		System.out.println(rev);
		
		if(rev.equalsIgnoreCase(st)) {
			
			System.out.println("Palindrome");
		}
		
		else {
			
			System.out.println("not a palindrome");
		}
		
		

	}

}
