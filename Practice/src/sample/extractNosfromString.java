package sample;

public class extractNosfromString {

	public static void main(String[] args) {
		
		String s= "mahesh1234";	
		char [] ch= s.toCharArray();	
	StringBuilder sb = new StringBuilder();
	
	for(char c : ch) {
	 if(Character.isDigit(c)) {
		 sb.append(c);	 	 
	      }		
	 }
	     System.out.println(sb);
	}

}
