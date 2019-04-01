package srini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Gmail 

{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver;
		
		//System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium Web Drivers\\chromedriver.exe");
		
		//driver =new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Selenium Web Drivers\\geckodriver.exe");
		
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.gmail.com");
		
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='NlWrkb snByac']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='JPdR6b qjTEB']//content[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("firstName")).sendKeys("Tests");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("lastName")).sendKeys("cases");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("testcase357901");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("test@12345");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("test@12345");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='phoneNumberId']")).sendKeys("8125309294");
		
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//content[@class='CwaK9']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("code")).sendKeys("609656");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='day']")).sendKeys("06");
		
		Thread.sleep(2000);
		
		Select s=new Select(driver.findElement(By.id("month")));
		
		s.selectByVisibleText("April");
		
		driver.findElement(By.xpath("//input[@id='year']")).sendKeys("1998");
		
		Thread.sleep(2000);
		
		Select s1=new Select(driver.findElement(By.xpath("//select[@id='gender']")));
		
		s1.selectByVisibleText("Male");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		Thread.sleep(2000);
		
//		driver.findElement(By.className("RveJvd snByac")).click();
//		
//		Thread.sleep(1000);
		
		driver.findElement(By.className("uBOgn")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.className("RveJvd snByac")).click();
		
				
		
		
		
		
		
		
	}

}
