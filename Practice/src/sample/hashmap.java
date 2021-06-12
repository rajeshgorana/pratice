package sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hashmap {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();	
		map.put(1, "rajesh");	
		map.put(2, "khushi");	
		for(Entry<Integer, String> m : map.entrySet()) {		
			System.out.println(m.getKey() +"-"+ m.getValue());
		}
		
	}

}
