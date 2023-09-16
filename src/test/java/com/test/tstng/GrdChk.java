package com.test.tstng;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GrdChk {
@Test
public void gridTestOne() throws MalformedURLException
{
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setBrowserName("chrome");
	WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.213:4444"), dc);
	driver.get("https://www.google.com/");
	System.out.println(driver.getTitle());
	driver.findElement(By.name("q")).sendKeys("AutomatonTest");
	
	
}
}
