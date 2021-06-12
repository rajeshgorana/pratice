package sample;

import java.util.ArrayList;
import java.util.Iterator;

public class arrList {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("rajesh");
		al.add("gorana");	
		al.add("33");
		
		Iterator it = al.iterator();
				
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}	

	}

}
