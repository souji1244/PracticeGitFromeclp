package com.test.links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeAllLocator {
	public static void main(String[] args) throws InterruptedException {
		//ChromeOptions c = new ChromeOptions();
		// WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();
    	Thread.sleep(1000);
     	String str = driver.findElement(By.xpath("//div[@class='main-header']")).getText();
        if(str.equals("Login")){
     	driver.findElement(By.id("userName")).sendKeys("Souji");
       	driver.findElement(By.id("password")).sendKeys("@Souji4kanna");
       	driver.findElement(By.id("login")).click();
      	Thread.sleep(3000);
       	String uname =driver.findElement(By.id("userName-value")).getText();
      	if(uname.equals("Souji")) 
      		 System.out.println("User name is  " + uname);
        driver.findElement(By.cssSelector("button.btn-primary")).click();
        }
        	
	}

}
