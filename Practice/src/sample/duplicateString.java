package sample;

public class duplicateString {

	public static void main(String[] args) {

		int [] arr = {1,2,0,3,0,4,0,5,6};
		
		//int [] arr2 = new int [8];
		int i=0;
		for(int j=0; j<arr.length; j++) {
			if(arr[j]!= 0) {
				arr[i++] = arr[i]; 
				
				while(i < arr.length)
					
					arr[i++] =0;
					
			}
			
			
			
		}
		
		for(int item : arr ){
			System.out.println(item);
		}
		
	}
	
	
}	
	


