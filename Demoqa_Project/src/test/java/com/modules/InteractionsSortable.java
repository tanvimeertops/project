package com.modules;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InteractionsSortable {
	
	
	public void ClickSortable(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[5]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[5]/div/ul/li[1]")).click();
		Thread.sleep(2000);
	}
	
	
	
	public void Sortable(WebDriver driver) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 300)");
		driver.findElement(By.id("demo-tab-list")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("demo-tab-grid")).click();
		Thread.sleep(2000);
		
		
		
		
	}

}
