package com.test.links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestLinkschrome {
	public static void main(String[] args) throws InterruptedException {
		//ChromeOptions c = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground");
     	driver.manage().window().maximize();
     	driver.findElement(By.linkText("Input Form Submit")).click();
     	driver.findElement(By.id("name")).sendKeys("soujanya");
     	driver.findElement(By.id("inputEmail4")).sendKeys("soujanya1244@gmail.com");
     	driver.findElement(By.name("company")).sendKeys("");
     	driver.findElement(By.id("company")).sendKeys("ValueLabs");
     	driver.findElement(By.id("websitename")).sendKeys("Google.com");
     	driver.findElement(By.xpath("//*[@id=\'seleniumform\']/div[3]/div[1]/select"));
     	Select select = new Select(driver.findElement(By.xpath("//*[@id=\'seleniumform\']/div[3]/div[1]/select")));
		select.selectByValue("IN");
		driver.findElement(By.id("inputCity")).sendKeys("Hyd");
		driver.findElement(By.id("inputAddress1")).sendKeys("Tealangana");
		driver.findElement(By.id("inputAddress2")).sendKeys("India");
		driver.findElement(By.id("inputState")).sendKeys("Telangana");
		driver.findElement(By.id("inputZip")).sendKeys("569780");
		driver.findElement(By.xpath("//*[@id=\'seleniumform\']/div[6]/button")).submit();
		System.out.println("successfully executed");		
	}
}
