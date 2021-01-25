package Automate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColorAutomate {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Seenu\\\\Downloads\\\\jars\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url = "https://www.tutorialspoint.com/index.htm";
	      driver.get(url);
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      //getting color attribute with getCssValue()
	      String colr = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/a[4]/span")).getCssValue("color");
	      
	      // getLocation-returns the  the location of the  of the element(x,y co-ordinate)
	     Point colr1 = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/a[4]/span")).getLocation();//output (874, 350)
	      System.out.println("x coordinate"+" "+colr1.x);
	      System.out.println("y coordinate"+" "+colr1.y);
	      //getRect() returns The location and size of the rendered element
	     // Rectangle colr = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/a[4]/span")).getRect();//org.openqa.selenium.Rectangle@1a76860
	      
	      //getting background color attribute with getCssValue()
	      String bckgclr = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/a[4]/span")).getCssValue("background-color");
	      System.out.println(colr);
	      System.out.println(bckgclr);
	      driver.close();

		
	}

}
