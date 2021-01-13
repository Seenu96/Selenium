import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch10urls {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Seenu\\\\Downloads\\\\jars\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//body/div[@id='viewport']/div[@id='searchform']/form[@id='tsf']/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Automation");
		Thread.sleep(10000);
		List<WebElement>list=driver.findElements(By.xpath("//ul[@role='listbox']/li/descendant::div[@class='sbl1']"));	
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
		     String url= list.get(i).getText();
		     System.out.println(url);
		     /*if(url.contains("Automation"))
		     {
		    	 list.get(i).click();
		    	 break;
		     }*/
		}
		driver.close();

	}

}
