package sample;

import java.util.Scanner;

public class uppertoLower {

	public static void main(String[] args) {
		
		System.out.println("Please input the String");

		Scanner sc= new Scanner(System.in);
		
		String  st =sc.nextLine();
		
		String st2=st.toLowerCase();
		
		System.out.println(st2);
			
	}

}
