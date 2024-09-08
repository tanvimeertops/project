package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class WidgetAccordian {
	
	@Test
	public void ClickWidget(WebDriver driver) throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 50)");
		//Widget button
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[4]")).click();
		Thread.sleep(1000);
		//Accordian button
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[4]/div/ul/li[1]")).click();
		Thread.sleep(1000);
		
	}
	
	
	public void WidgetAccord(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 250)");
		
		driver.findElement(By.xpath("//*[@id=\"accordianContainer\"]/div/div[2]")).click();
		Thread.sleep(1000);
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 250)");
		
		driver.findElement(By.xpath("//*[@id=\"accordianContainer\"]/div/div[3]")).click();
		Thread.sleep(1000);
	}

}
