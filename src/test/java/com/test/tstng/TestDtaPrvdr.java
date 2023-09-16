package com.test.tstng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestDtaPrvdr {
	WebDriver driver;

	@BeforeMethod
	public void display() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "logindata")
	public void testOne(String usname, String pwd) {
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(usname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login")).click();
	}

	@DataProvider(name = "logindata")
	public Object[][] showing() {
		return new Object[][] { { "Souji", "@Souji4Kanna" }, { "Charushahare", "Charu16@" } };
	}

	@AfterMethod
	public void teardown() {
		System.out.println("success");
	}
}
