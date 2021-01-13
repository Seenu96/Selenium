import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Seenu\\\\Downloads\\\\jars\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	WebElement ele=	driver.findElement(By.xpath("//body/div[@id='viewport']/div[@id='searchform']/form[@id='tsf']/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]"));
	ele.sendKeys("Automation");
	ele.sendKeys(Keys.ENTER);
	List<WebElement> elem=driver.findElements(By.tagName("a"));
	for(int i=0;i<elem.size();i++)
	{
		
		String a=elem.get(i).getAttribute("href");
		//System.out.println(a);
		if((a!=null) && !(a.contains("https://www.google.com/")))
		{
		System.out.println(a+' ');
		}
		
			}
	System.out.println("no of urls"+" "+elem.size());
	driver.close();
	}

}
