package com.modules;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BSALogin {
	
	public void ClickBookStoreApplication(WebDriver driver) throws Exception {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[6]")).click();
		Thread.sleep(1000);
	}
	
	
	public void ClickLogin(WebDriver driver) throws Exception {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[6]/div/ul/li[1]")).click();
		Thread.sleep(1000);
	}
	
	public void Login(WebDriver driver) throws Exception {
		driver.findElement(By.id("userName")).sendKeys("Don432");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Abcd@1234");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 100)");
		driver.findElement(By.id("login")).click();
	}
	
	public void Logout(WebDriver driver) throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
	}
	
	public void Newuser(WebDriver driver) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 200)");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[4]/div[2]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("firstname")).sendKeys("Don");
		Thread.sleep(1000);
		driver.findElement(By.id("lastname")).sendKeys("Don");
		Thread.sleep(1000);
		driver.findElement(By.id("userName")).sendKeys("Don456");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Abcd@1234");
		Thread.sleep(1000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 200)");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
		Thread.sleep(500);
		driver.findElement(By.cssSelector(".recaptcha-checkbox-border")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);	
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
		
	}
	
	public void Backtologin(WebDriver driver) {
		driver.findElement(By.id("gotologin")).click();
	}
	
	
	

}
