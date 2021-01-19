import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class New {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Seenu\\Downloads\\jars\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//for blocking the pop ups
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://dev.networked.co/");
		
			
	/*FileInputStream file=new FileInputStream("C:\\Users\\Seenu\\OneDrive\\Desktop\\Book2.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1"); //providing sheet name
        System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
        System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
          String a= sheet.getRow(0).getCell(0).getStringCellValue();
          String b=sheet.getRow(0).getCell(1).getStringCellValue();
	*/
	   	
		
		
		//1.login functionality
       driver.findElement(By.xpath("//a[@href='/login/']")).click();
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[1]/div/form/input[1]")).sendKeys("grant.lussier@gcafirst.com");
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[1]/div/form/input[2]")).sendKeys("Pass123-1");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
	    Thread.sleep(30000);
          
	    //2.Business services
         /* Thread.sleep(30000);	  
	     driver.findElement(By.xpath("//p[contains(text(),'Business services')]")).click();
	     driver.findElement(By.xpath("//button[contains(text(),'Post a spotlight')]")).click();
	   
	     driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Network7");
	     driver.findElement(By.xpath("//input[@id='industry']")).click();
	  
	     driver.findElement(By.xpath("//a[@id='industryList-item-7']")).click();
	     driver.findElement(By.cssSelector("#location")).sendKeys("Bangalore");
	  
	     driver.findElement(By.xpath("//textarea[@id='companyAbout']")).sendKeys("It is  Industrial company");
	     driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/input[1]")).sendKeys("www.Network7@gmail.com");
	     driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9045745612");
      	
	  
	      //for file upload used AutoIt
		  Runtime.getRuntime().exec("C:\\Users\\Seenu\\Downloads\\FileUpload.exe"); 
		  Runtime.getRuntime().exec("C:\\Users\\Seenu\\Downloads\\File.exe");
	      driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();*/
      	
	      
	      //Toast message
	     // String toastmessage=
	      
	      
	      //Fund raising initiative
	   /* Thread.sleep(30000);
	      driver.findElement(By.xpath("//p[contains(text(),'Fundraising initiatives')]")).click();
	      driver.findElement(By.xpath("//button[contains(text(),'Post a request')]")).click();
	      
	      driver.findElement(By.xpath("//input[@id='companyName']")).sendKeys("venture");
	      driver.findElement(By.xpath("//input[@id='fundraisingType']")).sendKeys("Association");
	     // driver.findElement(By.partialLinkText("Associati")).click();
	      driver.findElement(By.xpath("//input[@id='companyWebsite']")).sendKeys("www.venture.com");
	      driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("www.venture@gmail.com");
	      driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9876543218");
	      
	      driver.findElement(By.xpath("//textarea[@id='companyAbout']")).sendKeys("It's a funding company");
	      driver.findElement(By.xpath("//textarea[@id='theAsk']")).sendKeys("dhygfd");
	      
	      Runtime.getRuntime().exec("C:\\Users\\Seenu\\Downloads\\FileUpload.exe"); 
		  Runtime.getRuntime().exec("C:\\Users\\Seenu\\Downloads\\File.exe");
	     driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	     
	     
	     //Question and Advice
	    Thread.sleep(30000);
	    driver.findElement(By.xpath("//p[contains(text(),'Questions & advice')]")).click();
	     driver.findElement(By.xpath("//button[contains(text(),'Post a question')]")).click();
	     driver.findElement(By.xpath("//textarea[@id='exampleFormControlTextarea1']")).sendKeys("what is Testng");
	     driver.findElement(By.xpath("//textarea[@id='questionDescription']")).sendKeys("TestNextGeneration");
	     driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	    
	    //Explore
	   Thread.sleep(30000);
	    driver.findElement(By.xpath("//span[contains(text(),'Explore')]")).click();
	    
	    //Notification
	    Thread.sleep(30000);
	    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/nav[1]/div[1]/div[3]/ul[1]/li[3]/a[1]/img[1]")).click();
	    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]/div[1]")).click();
	    Thread.sleep(30000);
	    
	    //Directory
	    Thread.sleep(30000);
	    driver.findElement(By.xpath("//p[contains(text(),'Directory')]")).click();
	    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")).click();
	    driver.findElement(By.xpath("//input[@id='inputpersonname']")).sendKeys("Aaron Shipp");
	    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[2]/div[4]/button[3]")).click();
	    driver.findElement(By.xpath("//h5[contains(text(),'Member')]")).click();
	    //JavascriptExecutor js=((JavascriptExecutor)driver);
	   // js.executeScript("window.scrollBy(0,1000)");
	    //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    
	    
	    //profile visits
	    Thread.sleep(30000);
	    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/nav[1]/div[1]/div[3]/ul[1]/li[6]/a[1]/div[1]/img[1]")).click();
	    driver.findElement(By.partialLinkText("Profile visi")).click();*/
	    
	    //invite users
	    /*Thread.sleep(30000);
	    driver.findElement(By.xpath("//p[contains(text(),'Invite / Remove users')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Invite users')]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("seenu");
		driver.findElement(By.xpath("//select[@id='inputAffiliatedTags']")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Member')]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[3]/input[1]")).sendKeys("polepallisrinivas44@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='formControlTextarea']")).sendKeys("sbhdhskfbhd");
		driver.findElement(By.xpath("//button[contains(text(),'Send invite')]")).click();
		
	    //remove users
		Thread.sleep(30000);
		driver.findElement(By.xpath("//p[contains(text(),'Invite / Remove users')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Remove users')]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]")).click();
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//button[contains(text(),'Yes, Remove')]")).click();
	    //not to remove user
		driver.findElement(By.xpath("//button[@id='close_remove_user_popup']")).click();*/
		
		//view community profile
		/*Thread.sleep(30000);
		driver.findElement(By.xpath("//p[contains(text(),'View community profile')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//p[contains(text(),'Community settings')]")).click();
		Thread.sleep(10000);
		driver.navigate().back();
		//profanity admin
		driver.findElement(By.xpath("//p[contains(text(),'Profanity admin')]")).click();
		Thread.sleep(10000);
		driver.navigate().back();
		//view community feedback
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/a[3]/div[1]/p[1]")).click();
		Thread.sleep(10000);
		driver.navigate().back();
		//sub community
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/a[4]/div[1]/p[1]")).click();
		Thread.sleep(10000);
		driver.navigate().back();
		//people directory
		driver.findElement(By.xpath("//p[contains(text(),'People directory')]")).click();
		Thread.sleep(10000);
		driver.navigate().back();
		//community requests
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/a[6]/div[1]/p[1]")).click();
		Thread.sleep(10000);
		driver.navigate().back();
		//invite/remove users
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/a[7]/div[1]/p[1]")).click();
		Thread.sleep(10000);
		driver.navigate().back();
		//career opportunities
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/a[8]/div[1]/p[1]")).click();
		Thread.sleep(10000);
		driver.navigate().back();
		//question&advice
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/a[9]/div[1]/p[1]")).click();
		Thread.sleep(10000);
		driver.navigate().back();
		//events and webinars
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/a[10]/div[1]/p[1]")).click();
		Thread.sleep(10000);
		driver.navigate().back();
		//fundraising initiatives
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/a[11]/div[1]/p[1]")).click();
		Thread.sleep(10000);
		driver.navigate().back();
		//Business services
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/a[12]/div[1]/p[1]")).click();
		Thread.sleep(10000);
		driver.navigate().back();*/
	    
	    
	    //manage invitations
	  /*  Thread.sleep(30000);
	    driver.findElement(By.xpath("//p[contains(text(),'Manage invitations')]")).click();
	    Thread.sleep(10000);
	   //* driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[3]/button[1]/a[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("seenu");
		driver.findElement(By.xpath("//select[@id='inputAffiliatedTags']")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Member')]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[3]/input[1]")).sendKeys("polepallisrinivas44@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='formControlTextarea']")).sendKeys("sbhdhskfbhd");
		driver.findElement(By.xpath("//button[contains(text(),'Send invite')]")).click();
		driver.navigate().back();*/
	   /* driver.findElement(By.xpath("//button[contains(text(),'Invitation sent')]")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//button[contains(text(),'Nominations')]")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//button[contains(text(),'Approved Nominations')]")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//button[contains(text(),'Rejected Nominations')]")).click();*/
	    
		//profile page
	    Thread.sleep(30000);
	    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/nav[1]/div[1]/div[3]/ul[1]/li[6]/a[1]/div[1]/img[1]")).click();
	    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/nav[1]/div[1]/div[3]/ul[1]/li[6]/div[1]/a[1]")).click();
	    driver.findElement(By.xpath("//button[@id='']")).click();
		
	    
	    //logout
	     Thread.sleep(30000);
		
			driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/nav[1]/div[1]/div[3]/ul[1]/li[6]/a[1]/div[1]/img[1]")).click();
			driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/nav[1]/div[1]/div[3]/ul[1]/li[6]/div[1]/a[5]")).click();
			driver.close();

	}

}
