package com.modules;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AFWModalDialog {
	
	@Test
	public void ClickElment(WebDriver driver) throws InterruptedException {
		
		//ModalDialog button
//		driver.findElement(By.id("item-4")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[3]/div/ul/li[5]")).click();
//		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("//*[@id=\"item-4\"]/span")).click();
//		Thread.sleep(1000);
		driver.navigate().to("https://demoqa.com/modal-dialogs");
		
	}
	

	public void SmallModel(WebDriver driver) throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 100)");
		driver.findElement(By.id("showSmallModal")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("closeSmallModal")).click();
		Thread.sleep(3000);
	}
	
	
		public void LargeModel(WebDriver driver) throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 100)");
		driver.findElement(By.id("showLargeModal")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("closeLargeModal")).click();
		Thread.sleep(3000);
	}

}
