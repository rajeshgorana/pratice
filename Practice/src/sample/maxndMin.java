package sample;

public class maxndMin {
	
	public static void main (String[] args) {
		
		int[] a = {1,3,5,6,10,21};
		
		int minimum= a[0];
		
		int max =a[0];
		
		for(int i=0; i<a.length;i++) {
			
			if(a[i]<minimum) {
				
				minimum = a[i];
				
				
			}
				else if(a[i]>max) {
					
					max = a[i];
					
					System.out.println(max);
				}
				
			
			
		}
		System.out.println("max is:"+max);
		
		System.out.println("min is"+minimum);
		
		int diff = max-minimum;
		
		System.out.println("differenece is:"+ diff);
		
		
	}

}
