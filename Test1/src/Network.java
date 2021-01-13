
import java.util.concurrent.TimeUnit;
import java.util.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Network {

	public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\Seenu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://dev.networked.co");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[6]/a[1]")).click();
		driver.findElement(By.name("email")).sendKeys("g.upteswaro@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Pass123-1");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(30000);
		driver.findElement(By.xpath("//p[contains(text(),'Events & webinars')]")).click();*/
	
		
		String encrptData= "Password";
				
		byte[] encodedBytes = Base64.getEncoder().encode(encrptData.getBytes());
				
		System.out.println("encodedBytes --------------->" + new String(encodedBytes));

				
	}
	 
}
