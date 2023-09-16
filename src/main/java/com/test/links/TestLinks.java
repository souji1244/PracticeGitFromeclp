package com.test.links;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\E-Drive\\Selinium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
}
