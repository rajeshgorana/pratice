package sample;

import java.util.Iterator;
import java.util.LinkedList;


public class linkedList {

	public static void main(String[] args) {

		LinkedList<String> ls = new LinkedList<String>();
		
		ls.add("rajesh");
		ls.add("test");
		ls.add("35");
		
		Iterator<String> it=ls.iterator();      
  		
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
			
		}
		
		
		
		
	}

}
