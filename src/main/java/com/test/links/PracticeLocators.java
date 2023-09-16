package com.test.links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeLocators {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions c = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
       	driver.findElement(By.id("APjFqb")).sendKeys("Automation Testing");
     	driver.findElement(By.className("gNO89b")).submit();
     	System.out.println("Google page opened and searched about Automation Testing");
	}
}
