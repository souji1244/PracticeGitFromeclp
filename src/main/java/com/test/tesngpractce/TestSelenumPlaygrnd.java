package com.test.tesngpractce;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

public class TestSelenumPlaygrnd {
	@Test
  	public void testOne() throws IOException{
					
			//ChromeOptions c = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.lambdatest.com/selenium-playground");
	     	driver.manage().window().maximize();
	     	
	     	this.tscrn(driver ,"C:\\Users\\burgu\\Desktop\\dest\\scrnshot.png");
	}

public void tscrn(WebDriver driver  ,String filepath) throws IOException
{
TakesScreenshot sc= ((TakesScreenshot)driver);
File sF= sc.getScreenshotAs(OutputType.FILE);
File dest = new File(filepath);
FileUtils.copyFile(sF,dest);
}}