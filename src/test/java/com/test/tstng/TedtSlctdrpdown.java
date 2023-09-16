package com.test.tstng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

public class TedtSlctdrpdown {
	@Test
  	public void testOne(){
					
		//	ChromeOptions c = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.lambdatest.com/selenium-playground");
	     	driver.manage().window().maximize();
	 
	}

}