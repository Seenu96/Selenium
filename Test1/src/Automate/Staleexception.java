package Automate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Staleexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Seenu\\Downloads\\jars\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.manage().window().maximize();
		w.get("http://www.google.com");
		 String url=w.getCurrentUrl();
		w.quit();
		System.out.println(url);

		
	}

}
