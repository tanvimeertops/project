package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class WidgetTabs {
	public void ClickTabs(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[4]/div/ul/li[6]")).click();
		Thread.sleep(2000);
	}
	
	
	
	public void Tabs(WebDriver driver) throws Exception {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 150)");
		
		driver.findElement(By.id("demo-tab-origin")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("demo-tab-use")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("demo-tab-what")).click();
		Thread.sleep(10000);
		
//		driver.findElement(By.id("demo-tab-more")).click();
//		Thread.sleep(2000);
	}

}
