package sample;

public class smallestnumber {

	public static void main(String[] args) {
		
		int [] a= {21,21,7,3,5,6,7,8,9};
		
		int smallest =a[0];
		
		for (int i=0; i<a.length; i++) {
			
			if(a[i]< smallest) {
				
				smallest = a[i];
				
			}
			
		}
		
		System.out.println("smallest number is: " + smallest);
		
		

	}

}
