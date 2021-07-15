package demo;

public class printnoswoloop {
	//print 1 to 100 without using any loop
	public static void number(int n) {
		if(n<=100) {
			
			System.out.println(n);
			n++;
			//recursive function--fn is called from inside the funtion
			number(n);
			
			
		}

	}
	
	public static void main(String[] args) {
		
		number(1);
		

	}

}
