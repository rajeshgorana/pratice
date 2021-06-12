package sample;

import java.util.Scanner;

public class printpermsString {
	
	static void printPerms(String st, String ans) {	
        if (st.length() == 0) {
            System.out.print(ans +" ");
            return;
        }		
		for(int i=0; i<st.length();i++) {		
			char ch = st.charAt(i);
			String ret=  st.substring(0, i) + st.substring(i+1) ;
            // recursive call
			printPerms(ret, ans+ ch);
		   }		
		}		
	
	static  String userInput() {
		
		System.out.println("Enter the Word");
		
		Scanner sc= new Scanner(System.in);
		
		String s =sc.nextLine();
		
		return s;
		
		
		
	}
	public static void main(String[] args) {
		
		//String st ="DEV";	
		
		String st=userInput();
		printPerms(st, "");
	}
}
