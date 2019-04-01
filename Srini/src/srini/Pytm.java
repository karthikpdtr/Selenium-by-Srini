package srini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;

public class Pytm 
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
		
		
		System.setProperty(GeckoDriverService.GECKO_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//Drivers/geckodriver.exe");
		
		driver=new FirefoxDriver();
		
		driver.get("https://www.paytm.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.className("shPe")).click();
		
		*/
	
		System.setProperty(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//Drivers//IEDriverServer.exe");
		
		driver=new InternetExplorerDriver();
		
	
		
		driver.get("https://paytm.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.className("shPe")).click();
	}

}
