package sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG1 {
	
	WebDriver driver;
   @Parameters("browser")
   @Test(priority=1,enabled=true)
   public void setup(String browser)
   {
	   if(browser.equals(browser))
	   {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	   }
	   else
	   {
		   WebDriverManager.edgedriver().setup();
		   driver = new EdgeDriver();
	   }
		
   }
   @Parameters("url")
   @Test(priority=2)
   public void launchAppln()
   {
		driver.get("https://www.automationanywhere.com/");
   }
   @Test(priority=3,enabled=true)
   public void logo()
   {
		WebElement logo = driver.findElement(By.xpath("(//img[@alt='Automation Anywhere'])[1]"));
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		if(logo.isDisplayed())
		{
			System.out.println("Automation Anywhere logo is Present");
		}
		else
		{
			System.out.println("Automation Anywhere logo is not Present");
		}
		WebElement request=driver.findElement(By.xpath("(//a[@title='Request demo'])[1]"));
		if(request.isDisplayed() && request.isEnabled())
		{
			
			request.click();
			System.out.println("Request Demo is Present and Clickable");
		}
		else
		{
			System.out.println("Request Demo is Present and Clickable");
			
		}

   }
   @Test(priority=4,enabled=true,timeOut=3000)
   public void tearDown()
   {
	   driver.close();
   }

}

