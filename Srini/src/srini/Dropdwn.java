package srini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.FindsById;
import org.openqa.selenium.internal.FindsByName;
import org.openqa.selenium.support.ui.Select;

public class Dropdwn 
{

	public static void main(String[] args)
	{
	
		 System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium Web Drivers\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com");
		 
		 // Birthday date, month & year selection
		 
		 Select s =new Select(driver.findElement(By.name("birthday_day")));
		 s.selectByIndex(5);
		 
		 Select s1=new Select(driver.findElement(By.name("birthday_month")));
		 s1.selectByVisibleText("Apr");

		 Select s3=new Select(driver.findElement(By.id("year")));
		 
		 s3.selectByValue("1993");
		
		// Radio Button (Male or female)
		
		driver.findElement(By.id("u_0_a")).click();
		
		/*
		driver.findElement(By.id("email")).sendKeys("karthikreddyb@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("Amma@1961");
		driver.findElement(By.id("loginbutton")).click();
		*/

	}
	
}
		


