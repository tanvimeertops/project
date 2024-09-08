package com.modules;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ElementDynamic {
	@Test
	public void ClickElment(WebDriver driver) throws InterruptedException {
		
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]")).click();	
//		Thread.sleep(1000);
		Actions actions=new Actions(driver);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		//Locating element by link text and store in variable "Element"        
		        WebElement Element1 = driver.findElement(By.xpath("//*[@id=\"item-8\"]"));

		        // Scrolling down the page till the element is found
		        js1.executeScript("arguments[0].scrollIntoView();", Element1);
		        driver.findElement(By.xpath("//*[@id=\"item-8\"]")).click();
		        actions.click().perform();
	}
	
	public void clickcolour(WebDriver driver) throws InterruptedException {
		
//		driver.findElement(By.id("colorChange")).click();
		Thread.sleep(5000);
	}

}
