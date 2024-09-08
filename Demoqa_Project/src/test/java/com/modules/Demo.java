package com.modules;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	@Test
	public void name() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//to open a website
//		driver.get("https://demoqa.com/");
//
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0, 150)");
////		//Widget button
//				driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[4]")).click();
//				Thread.sleep(1000);
//		js.executeScript("window.scrollBy(0, 500)");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[4]/div/ul/li[9]")).click();
//				Thread.sleep(2000);
		driver.get("https://demoqa.com/register");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 400)");
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0, 300)");

		
		
		driver.findElement(By.id("firstname")).sendKeys("Don");
		Thread.sleep(1000);
		driver.findElement(By.id("lastname")).sendKeys("Don");
		Thread.sleep(1000);
		driver.findElement(By.id("userName")).sendKeys("Don456");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Abcd@1234");
		Thread.sleep(1000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".recaptcha-checkbox-border")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("register")).click();
		Thread.sleep(1000);	
		
		if(driver.getCurrentUrl().equals("https://demoqa.com/register"))
		{
			driver.findElement(By.id("gotologin")).click();
			Thread.sleep(1000);
			
		}
		else {
			
			driver.findElement(By.id("register"));
			Thread.sleep(1000);			
			System.out.println("Register page:- ");
			Alert a1=driver.switchTo().alert();
			System.out.println(a1.getText());
			
//			a1.dismiss();
			Thread.sleep(2000);
			a1.accept();
		}  
		   Thread.sleep(10000);
		driver.close();
		
	}

}
