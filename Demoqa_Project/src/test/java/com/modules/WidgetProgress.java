package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WidgetProgress {
	
	public void ClickProgress(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[4]/div/ul/li[5]")).click();
		Thread.sleep(2000);
	}
	
	public void Progress(WebDriver driver) throws Exception {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 150)");
		
		
		driver.findElement(By.id("startStopButton")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("startStopButton")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("startStopButton")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.id("resetButton")).click();
		Thread.sleep(2000);
	}

}
