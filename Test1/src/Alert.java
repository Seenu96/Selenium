     	import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.NoAlertPresentException;

		public class Alert {
			
			public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {									
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Seenu\\Downloads\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        		        // Alert Message handling
		         driver.get("http://demo.guru99.com/test/delete_customer.php");			
		                            		
		     	      	
		        driver.findElement(By.name("cusid")).sendKeys("53920");					
		        driver.findElement(By.name("submit")).submit();			
		        		
		        // Switching to Alert        
		        org.openqa.selenium.Alert alert = driver.switchTo().alert();		
		        		
		        // Capturing alert message.    
		        String alertMessage= driver.switchTo().alert().getText();		
		        		
		        // Displaying alert message		
		        System.out.println(alertMessage);	
		        Thread.sleep(5000);
		        		
		        // Accepting alert		
		        alert.accept();		
		    }	

		}

	
