package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InteractionsSelectable {
	
	public void ClickSelectable(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[5]/div/ul/li[2]")).click();
		Thread.sleep(2000);
	}
	
	
	public void Selectable(WebDriver driver) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 300)");
		driver.findElement(By.id("demo-tab-list")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[4]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("demo-tab-grid")).click();
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//*[@id=\"row1\"]/li[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"row1\"]/li[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"row2\"]/li[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"row2\"]/li[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"row3\"]/li[2]")).click();
		Thread.sleep(1000);
		
		
		
	}

}
