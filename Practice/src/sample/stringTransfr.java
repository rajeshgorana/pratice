package sample;
import java.lang.reflect.Array;
import java.util.Arrays;

public class stringTransfr {

	public static void main(String[] args) {
		
		//input=tomorrow    Output=t$m$$rr$$$w
		
		String  s1 = "tomorrow";	
		int num=0;  
		int rep=1;  
				
		for(int i=0;i<s1.length(); i++) {		
			if(s1.charAt(i)=='o') {			
				num =rep;
				while(num!=0) {				
                 System.out.print("$");					
					num--;	
				}			
				rep++;			
			}
			else {	
				System.out.print(s1.charAt(i));
			}
			
		}
	}

}
