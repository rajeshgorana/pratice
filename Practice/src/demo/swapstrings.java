package demo;

public class swapstrings {

//swap two string siwhtout using third string
	    public static void main(String args[]) {  
	        String a = "Love";  
	        String b = "You";  
	        System.out.println("Before swap: " + a + " " + b);  
	        a = a + b;  
	        b = a.substring(0, a.length() - b.length());  
	        a = a.substring(b.length());  
	        System.out.println("After Swap: " + a + " " + b);  
	    }  
	}  

