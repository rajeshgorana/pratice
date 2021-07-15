package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class swap {

	public static void main(String[] args) {

List<Integer> st = new ArrayList<Integer>();


st.add(1);
st.add(2);
st.add(1);

//int[] a=new Int[]

int [] temp= new int [st.size()] ;
int[] a = new int [st.size()];
for(int i=0; i<a.length-1; i++) {
	
	if(a[i]==a[i+1]) {
		
		System.out.println("Duplicate");
		
		
		
	}else {
		
	temp[st.size()-i]=a[i];
		
		
		
	}
	
	
	System.out.println(Arrays.toString(temp));
	
	
	
	
}


		
		
		
		
	}

}
