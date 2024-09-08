package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.beust.ah.A;

public class InteractionsResizable {
	
	public void ClickResizable(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[5]/div/ul/li[3]")).click();
		Thread.sleep(2000);
	}
	
	
	public void Resizable(WebDriver driver) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 300)");

		
		WebElement resize=driver.findElement(By.xpath("//*[@id=\"resizableBoxWithRestriction\"]/span"));

		
//		Actions action=new Actions(driver);
		//action.dragAndDropBy(resize, 200, 200).perform();
		
		new Actions(driver).clickAndHold(resize).moveByOffset(200,200).release().perform();
		
		
		WebElement resize2=driver.findElement(By.xpath("//*[@id=\"resizable\"]/span"));
		new Actions(driver).clickAndHold(resize2).moveByOffset(100,100).release().perform();
		
		
		
		
		
		
	}

}
