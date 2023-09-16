package com.test.rdiobtn;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeRdBtn {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver dr  = new ChromeDriver();
		dr.get("https://www.lambdatest.com/selenium-playground/radiobutton-demo");
		dr.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[1]/div/label[2]")).click();
		dr.findElement(By.id("buttoncheck")).click();
		System.out.println("Selected button name is  "+ dr.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[1]/div/p[2]")).getText());
	    
		
		
	}
}
