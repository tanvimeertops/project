package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ElementBrokenLink {
	@Test
	public void ClickElment(WebDriver driver) throws InterruptedException {
		Actions actions=new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Locating element by link text and store in variable "Element"        
				WebElement Element = driver.findElement(By.xpath("//*[@id=\"item-6\"]"));

					// Scrolling down the page till the element is found
				js.executeScript("arguments[0].scrollIntoView();", Element);
				actions.click().perform();


				driver.findElement(By.xpath("//*[@id=\"item-6\"]")).click();
		
	}
	
	public void Clickbroken(WebDriver driver) {
		 Actions actions=new Actions(driver);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		//Locating element by link text and store in variable "Element"        
		
		  WebElement Element1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/a[1]"));

	        // Scrolling down the page till the element is found
	        js1.executeScript("arguments[0].scrollIntoView();", Element1);
	        actions.click().perform();
		  //Click Here for Valid Link
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/a[1]")).click();
	  driver.navigate().back();
	  
		//Locating element by link text and store in variable "Element"        
		
//		  WebElement Element2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/a[2]"));
//
//	        // Scrolling down the page till the element is found
//	        js1.executeScript("arguments[0].scrollIntoView();", Element2);
//	        actions.click().perform();
		  //Click Here for Broken Link
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/a[2]")).click();
	  driver.navigate().back();
	}

}
