package srini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Selenium Web Drivers\\geckodriver.exe");
		
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("firstname")).sendKeys("karthik");
		
		Thread.sleep(1500);
		
		driver.findElement(By.name("lastname")).sendKeys("reddy");
		
		Thread.sleep(1500);
		
		driver.findElement(By.name("reg_email__")).sendKeys("atkarthikreddy@gmail.com");
		
		Thread.sleep(1500);
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("atkarthikreddy@gmail.com");
		
		Thread.sleep(1500);
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("test@12345");
		
		Thread.sleep(1500);
		
		driver.findElement(By.id("day")).sendKeys("01");
		
		Thread.sleep(1500);
		
		driver.findElement(By.id("month")).sendKeys("Apr");
		
		Thread.sleep(1500);
		
		Select s=new Select(driver.findElement(By.id("year")));
		 
		s.selectByValue("1991");
		
		Thread.sleep(1500);
		
		driver.findElement(By.id("u_0_a")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.name("websubmit")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//div[@class='_1k67 _cy7']")).click();

	}

}
