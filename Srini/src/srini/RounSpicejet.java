package srini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RounSpicejet 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium Web Drivers\\chromedriver.exe");
		
		driver =new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@value='TIR'])[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='ui-state-default'][contains(text(),'29')]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='ui-state-default'][contains(text(),'30')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("hrefIncAdt")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		
		s.selectByVisibleText("AED");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
		

	}

}
