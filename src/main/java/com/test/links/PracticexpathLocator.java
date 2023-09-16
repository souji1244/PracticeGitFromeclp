package com.test.links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticexpathLocator {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions c = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.lambdatest.com/selenium-playground");
     	driver.manage().window().maximize();
     	driver.findElement(By.xpath("//a[text()='Simple Form Demo']")).click();
     	driver.findElement(By.id("user-message")).sendKeys("Hello");
     	driver.findElement(By.id("showInput")).click();
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("//input[@placeholder='Please enter first value']")).sendKeys("40");
     	driver.findElement(By.xpath("//input[@placeholder='Please enter second value']")).sendKeys("75");
       Thread.sleep(2000);
    //driver.findElement(By.xpath("//button[@class='mt-20 mb-10 bg-lambda-900 hover:bg-transparent hover:text-lambda-900 border border-lambda-900 text-white rounded p-10 focus:outline-none w-180 ']")).submit();
     driver.findElement(By.xpath("//*[@id='gettotal']/button")).click();
     Thread.sleep(5000);
  	 WebElement sum= driver.findElement(By.id("addmessage"));
  	String label=sum.getText();
  	int v= Integer.parseInt(label);
  	Thread.sleep(5000);
  	System.out.println("value is "  + v);
  	if(v > 40){
  		System.out.println("pass");
  	}  	
  	else {
  		System.out.println("Fail");
  	}
}

}
