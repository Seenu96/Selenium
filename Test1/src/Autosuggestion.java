     import java.util.List;
	import java.util.concurrent.TimeUnit;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class Autosuggestion {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Seenu\\Downloads\\chromedriver.exe");
			WebDriver w=new ChromeDriver();
			w.manage().window().maximize();
			w.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html"); //for handling dropdowns another method
			WebElement wb=w.findElement(By.id("select-demo"));
			wb.click();
			List<WebElement> options =w.findElements(By.cssSelector("#select-demo>option"));
		    for(WebElement option:options )
		    {
		    	if(option.getText().equals("Monday"))
		    	{
		    		option.click();
		    		//System.out.println(option.getText());
		    		break;
		    	}
		    }
			
					}
	}


