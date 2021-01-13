import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Seenu\\\\Downloads\\\\jars\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		List<WebElement>ls=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println(ls.size());
		for(int i=0;i<ls.size();i++)
		{
	
			System.out.println(ls.get(i).getText());
		}
		//Adding comments
		List<WebElement>li=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println(li.size());
		for(int j=0;j<li.size();j++)
		{
			System.out.println(li.get(j).getText());
		}
		driver.close();

	}

}
