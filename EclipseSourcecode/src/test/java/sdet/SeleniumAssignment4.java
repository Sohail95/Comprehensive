package sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumAssignment4 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationanywhere.com/");		
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
		if(expectedSolutionsUrl.equals(actualSolutionsUrl))
		{
			System.out.println("Driver navigated to Solutions page Correctly");
		}
		
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
		
		//Verifying the Company Page
		driver.findElement(By.linkText("Company")).click();
		String expectedCompanyUrl = "https://www.automationanywhere.com/company/about-us";
		String actualCompanyUrl = driver.getCurrentUrl();
		if(expectedCompanyUrl.equals(actualCompanyUrl))
		{
			System.out.println("Driver navigated to company page Correctly");
		}
		

	}

}