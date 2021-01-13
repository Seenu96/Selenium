import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Seenu\\Downloads\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.manage().window().maximize();
		w.get("http://demo.guru99.com/popup.php");
		w.findElement(By.linkText("Click Here")).click();
		String parent=w.getWindowHandle();
		Set <String> a=w.getWindowHandles();
		Iterator<String> il=a.iterator();
		while(il.hasNext())
		{
			 String child=il.next();
			 if(!parent.equals(child))
			 {
				 w.switchTo().window(child);	                                                                                                           
                 w.findElement(By.name("emailid"))
                 .sendKeys("gaurav.3n@gmail.com");                			
                 
                 w.findElement(By.name("btnLogin")).click();			
                              
			// Closing the Child Window.
                     w.close();		
			 }
	            w.switchTo().window(parent);				

		}
		

	}

}
