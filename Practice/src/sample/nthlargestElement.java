package sample;

import java.util.Arrays;

public class nthlargestElement {
	// 4th highest element of array

	
	public static void main(String[] args) {
		int [] a= {1,3,6,8,10,21,44,2,0,4};
		
		//sort array in ascending order
		Arrays.sort(a);
		//4th highest element index = array length -4
		int index=a.length - 4;
		int fthel=a[index];
		
System.out.println(fthel);		
		

	}

}
