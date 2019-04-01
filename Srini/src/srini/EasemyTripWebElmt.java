package srini;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EasemyTripWebElmt 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium Web Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://www.easemytrip.com");
		
		driver.manage().window().maximize();
		
		WebElement s=driver.findElement(By.id("FromSector_show"));
		
		s.clear();
		s.sendKeys("mum");
		Thread.sleep(4000);
		s.sendKeys(Keys.ENTER);
		
		
		WebElement s1=driver.findElement(By.id("Editbox13_show"));
		
		s1.clear();
		s1.sendKeys("hyd");
		Thread.sleep(3000);
		s1.sendKeys(Keys.ENTER);
		
		
		
		
		
	}

}
