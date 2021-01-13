import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Seenu\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(5000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
      js.executeScript("window.scrollBy(0,70)");
      Thread.sleep(3000);
      js.executeScript("window.scrollBy(0,-50)");

        //Find element by link text and store in variable "Element"        		
       // WebElement Element = driver.findElement(By.linkText("Linux"));

        //This will scroll the page till the element is found		
        //js.executeScript("arguments[0].scrollIntoView();", Element);
        
        //to scroll at the bottom of webpage
        //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
      
        Thread.sleep(6000);
        driver.close();
        

	}

}
