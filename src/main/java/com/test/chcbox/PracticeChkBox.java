package com.test.chcbox;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeChkBox {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver dr  = new ChromeDriver();
		dr.get("https://www.lambdatest.com/selenium-playground/");
		//dr.findElement(By.cssSelector("//a[@href='https://www.lambdatest.com/selenium-playground/checkbox-demo']")).click();
		dr.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/ul/li[2]/a")).click();
		dr.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[1]/div[2]/div[1]/label")).click();
		dr.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[2]/div[2]/div[2]/label")).click();
		dr.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div[2]/div[1]/div[3]/label")).click();		
		
	}
}
