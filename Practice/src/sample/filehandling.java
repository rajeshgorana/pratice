package sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filehandling {

	public static void main(String[] args) throws IOException {
		String path= "C:\\Users\\Admin\\Documents\\file.txt";
		
		

		
		
		FileInputStream fip= null;

		try {
			
			
			fip = new FileInputStream(new File(path));
			
			int c=0;
			while((c= fip.read())!=-1 ) {
				
				System.out.print((char)c);
			}		
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
			
		}finally {
			
			fip.close();
		}
		
	
	}
}
