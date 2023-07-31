package sdet;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG2 {
	
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest()
	public void setup(String browser)
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//driver.get("https://www.automationanywhere.com/");
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
	@Test(priority=1,enabled=true)
	public void launch(String url)
	{
		driver.get(url);
			
	}
	@Test(priority=2,enabled=true)
	public void verify()
	{
		WebElement logo = driver.findElement(By.xpath("(//img[@alt='Automation Anywhere'])[1]"));
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		//Verifying the Products page
		driver.findElement(By.linkText("Products")).click();
		String expectedProductsUrl = "https://www.automationanywhere.com/products";
		String actualProductsUrl = driver.getCurrentUrl();
		if(expectedProductsUrl.equals(actualProductsUrl))
		{
			System.out.println("Driver navigated to Products page Correctly");
		}
		//Verifying the Solutions Page
		driver.findElement(By.linkText("Solutions")).click();
		String expectedSolutionsUrl = "https://www.automationanywhere.com/solutions";
		String actualSolutionsUrl = driver.getCurrentUrl();
		if(expectedProductsUrl.equals(actualSolutionsUrl))
		{
			System.out.println("Driver navigated to Solutions page Correctly");
		}
	}
	@Test(priority=3,enabled=true)
	public void verifyPages()
	{
	    //Verifying the Resources Page
		driver.findElement(By.linkText("Resources")).click();
		String expectedResourcesUrl = "https://www.automationanywhere.com/resources";
		String actualResourcesUrl = driver.getCurrentUrl();
		if(expectedResourcesUrl.equals(actualResourcesUrl))
		{
			System.out.println("Driver navigated to Resources page Correctly");
		}
		//Verifying the Beyond RPA page
		driver.findElement(By.linkText("Beyond RPA")).click();
		String expectedBeyondRPAUrl = "https://www.automationanywhere.com/rpa/robotic-process-automation";
		String actualBeyondRPAUrl = driver.getCurrentUrl();
		if(expectedBeyondRPAUrl.equals(actualBeyondRPAUrl))
		{
			System.out.println("Driver navigated to BeyondRPA page Correctly");
		}
	}
	@Test(priority=4,enabled=true)
	public void verifyPage()
	{
		//Verifying the Company Page
		driver.findElement(By.linkText("Company")).click();
		String expectedCompanyUrl = "https://www.automationanywhere.com/company/about-us";
		String actualCompanyUrl = driver.getCurrentUrl();
		if(expectedCompanyUrl.equals(actualCompanyUrl))
		{
			System.out.println("Driver navigated to company page Correctly");
		}
		
	}
	@AfterTest()
	public void tearDown()
	{
		driver.close();
	}

}
