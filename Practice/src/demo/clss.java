package demo;

import java.util.Iterator;

public class clss {

	public static void main(String[] args) {
		
		
	WebDriver driver new FireFoxDriver();
	
	
	List<WebElement> ls=driver.findElements(By.xpath("//*[@href(contains(), 'header')]"));
	
	
	Iterator<E> it = new Iterator();
	
	String [] str=[ls.size()] ;
	while(it.hasNext()) {
		
		
		String s=it.next().gettext();
		
		str = Arrayr.fill(s);
		
		
		
		
	}
	
	

	
	String smallest=str[i];
	
	for(int i=0; str.length-1; i++) {
		
		if(str[i]<smallest) {
			
			smallest=str[i];
			
			
		}
		
		
		System.out.println(smallest);
		
		
		
		
		
		
		
		
	}
	
	
	
		
		
		

	}

}
