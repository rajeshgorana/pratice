package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;



public class readExcelFile {

	
	public static void main() {
		
		try {
			FileInputStream fis = new FileInputStream(new File("C:\\Users\\Admin\\Documents\\Feedback.xlsx"))
					
					XSSFWorkBook wb=new XSSFWorkBook(fis);   
					;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			fis.close();
		}
		
		
	}
	

}
