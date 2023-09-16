package com.test.tstng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	WebDriver driver;
	@BeforeMethod
	public void bmethod()
	{
		
		//ChromeOptions c = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
	}
	@Test
  	public void testOne(){
					
			
			driver.get("https://www.lambdatest.com/selenium-playground");
	     	driver.manage().window().maximize();
	     	
	}
	@AfterMethod
	public void afmethod()
	{
		driver.quit();
	}

}