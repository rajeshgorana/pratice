package demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class removeDupArraylist {

  
		    public static void main(String[] args) {  
		        List<String> l = new ArrayList<String>();  
		        l.add("Mango");  
		        l.add("Banana");  
		        l.add("Mango");  
		        l.add("Apple");  
		        System.out.println(l.toString());  
		        Set<String> s = new HashSet<String>(l);  
		        System.out.println(s);  
		    }  
		}  
	


