package com.test.tstng;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;

public class TestSelenumPlaygrnd {
	@Test
  	public void testOne(){
					
			ChromeOptions c = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(c);
			driver.get("https://demoqa.com/broken");
	     	driver.manage().window().maximize();
	     //	Select s = new Select(driver.findElement(By.xpath("//*[@id=\'withOptGroup\']")));
	     	//s.selectByIndex(1);
            //s.selectByValue("Group 1, Option 1");
	     	//s.selectByVisibleText("Group 1, option 1");
	     	//Select s1 = new Select(driver.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div")));
	     	//s1.selectByVisibleText("Blue");
	     //	//*[@id="selectMenuContainer"]/div[7]/div/div
	     	
	//  String str= driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div/div[1]")).getText();
	  //System.out.println(str);  
	  //driver.findElement(By.xpath("//*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div/div[2]")).getText();
	  //	List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"withOptGroup\"]/div/div[1]"));
	     //	System.out.println(list);
	     	//driver.findElement(By.xpath("//*[@id=\"withOptGroup\"]//*[text()='Group 1, option 2']")).click();
	     	// //*[@class="rt-table"]
	//Actions act = new Actions(driver);
	//WebElement ele  = driver.findElement(By.id("doubleClickBtn"));
	//act.doubleClick(ele).perform();
     
	     	WebElement url1 =driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/a[1]"));	
	        String validURL=url1.getAttribute("href");
	        System.out.println(validURL);
	        verifyLink(validURL);
	}     	
     public static void verifyLink(String url) {
	     		try {
	     		URL link = new URL(url);
	     		HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
	     		httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
	     		httpURLConnection.connect();

	     		if (httpURLConnection.getResponseCode() >200) {
	     		System.out.println(url + " - " + httpURLConnection.getResponseMessage() +"Valid link");
	     		} else {
	     		System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
	     		}
	     		}
	     		catch(Exception e)
	     		{
	     			System.out.println(url+"-"+"is a broken link");
	     		}
	     	

}
	}
	