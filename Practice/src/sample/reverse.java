package sample;

public class reverse {
// reverse hthe string words o/p-  Woh ErA Uoy
	public static void main(String[] args) {
    String s= "How Are You";
    
    String[] s2 =s.split("\\s");
  
    for(String s1: s2) {
    	
    	String r="";  

for(int i=s1.length()-1; i>=0; --i) {
	
	r= r+ s1.charAt(i);
	
}    

System.out.print(r+" ");


	
    	
    }	
    
    
    

	}

}
