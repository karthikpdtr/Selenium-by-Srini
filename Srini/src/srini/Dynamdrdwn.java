package srini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dynamdrdwn 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium Web Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com");
		
		
	
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		
		driver.findElement(By.xpath("(//a[@value='TIR'])[2]")).click();
		
		driver.findElement(By.xpath("//a[@class='ui-state-default']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(3000);
		
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			Thread.sleep(3000);
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		
		s.selectByVisibleText("USD");
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
	/*	driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("hrefIncAdt")).click();
		
		
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		
		s.selectByVisibleText("USD");*/
		
	//	driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
		
		
		
		
		
		
		
		/*
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		
		s.selectByVisibleText("USD");
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		//int i=1;
	/*	while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		
		*/
		/*
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			Thread.sleep(2000);
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		*/
	}

}
