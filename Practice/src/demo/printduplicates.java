package demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class printduplicates {
	

        public static void main(String[] args) {
                // TODO Auto-generated method stub
   String  input = "hcl-tech";
   findDuplicates(input);
        }
        
        public static void findDuplicates(String input) {
                char[] ch = input.toCharArray();
                HashMap<Character,Integer> map = new HashMap<>();
                for(Character c: ch) {
                        if(!map.containsKey(c)) {
                                map.put(c, 1);
                        }else {
                                map.put(c, map.get(c)+1);
                        
                        }
                }
                Set<Map.Entry<Character,Integer>> set= map.entrySet();
                for(Map.Entry<Character,Integer>entry : set) {
                     if(entry.getValue()>0){
                        System.out.printf("%s : %d %n", entry.getKey(),entry.getValue());
                         }
                }
}

}
