package srini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;

public class Pytmcheckbox 
{

	public static void main(String[] args) 
	{
		WebDriver driver;
        
	      
		/*
	       System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY,System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		   
	       driver = new ChromeDriver();
			
	        
		    driver.get("https://www.paytm.com");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.className("shPe")).click();

			*/
		
			System.setProperty("webdriver.edge.driver", "E:\\Selenium\\Selenium Web Drivers\\MicrosoftWebDriver.exe");
			
			driver=new EdgeDriver();
			
			driver.get("https://www.paytm.com");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.className("shPe")).click();
			
			
	}

}
