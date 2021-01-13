import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Demo {
      
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Seenu\\Downloads\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html"); //for handling dropdowns
		WebElement wb=w.findElement(By.id("select-demo"));
		Select s=new Select(wb);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByVisibleText("Monday");
		Thread.sleep(3000);
		s.selectByValue("Tuesday");
		
		
		

	}

}
