package sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumAssignment3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationanywhere.com/");
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

}


