package srini;

import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EasymyTrip 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium Web Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://www.easemytrip.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("FromSector_show")).clear();
		
		Thread.sleep(1500);
		
		driver.findElement(By.id("FromSector_show")).sendKeys("cha");
		
		Thread.sleep(1500);
		
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("FromSector_show")).sendKeys(Keys.DOWN);
		}
		
		
			driver.findElement(By.id("FromSector_show")).sendKeys(Keys.ENTER);
			
			
			driver.findElement(By.id("Editbox13_show")).clear();
			
			Thread.sleep(1500);
			
			driver.findElement(By.id("Editbox13_show")).sendKeys("hyd");
			
			Thread.sleep(2000);
			
			driver.findElement(By.id("Editbox13_show")).sendKeys(Keys.ENTER);
	}

}
