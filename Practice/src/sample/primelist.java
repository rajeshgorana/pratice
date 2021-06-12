package sample;

import java.util.ArrayList;
import java.util.List;
//import java.awt.List;
import java.util.stream.IntStream;

public class primelist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int[] a = new int[100];	
        for (int i=1;i <=100;++i){
        	a[i]=i;
        	}
        
        int count=0;
        for(int i=1;i<=a.length;i++) {
        	
        	if(a[i]%i==0) {
        		
        		count++;
        	}
        	
        	else {
        		
        		System.out.println("nt a prime number");
        	}
        	
                if(a[i]==2) {
        		
        		System.out.println("its prime number");
        		
        		
        	}
        }

	}

}
