package com.modules;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AFWBroswerWindow {
	
	@Test
	public void ClickElment(WebDriver driver) throws InterruptedException {
		
//		Actions actions=new Actions(driver);
//		JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		//Locating element by link text and store in variable "Element"        
//		        WebElement Element = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[3]/div/ul/li[1]"));
//
//		        // Scrolling down the page till the element is found
//		        js1.executeScript("arguments[0].scrollIntoView();", Element);
//		        actions.click().perform();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[3]/span")).click();
			//Form Button
		    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[3]/div/ul/li[1]")).click();	
			Thread.sleep(1000);

	}
	
	public void BrowserWindow(WebDriver driver) throws InterruptedException {
		
		String main_w= driver.getWindowHandle();
		
		System.out.println("main window is :"+main_w);
		
		//Home Button
		Thread.sleep(1500);
		driver.findElement(By.id("tabButton")).click();
		Set<String> all_w=driver.getWindowHandles();
		
		Iterator<String> i1=all_w.iterator();
		
		while (i1.hasNext()) {
			String child_w = (String) i1.next();
			System.out.println("all window:-\n"+child_w);
			
			if (!main_w.equals(child_w)) {
				driver.switchTo().window(child_w);
				
				Thread.sleep(2000);
				driver.close();
			}}
			driver.switchTo().window(main_w);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
//			//Locating element by link text and store in variable "Element"        
			        WebElement Element1 = driver.findElement(By.id("windowButton"));
	//
//			        // Scrolling down the page till the element is found
			        js.executeScript("arguments[0].scrollIntoView();", Element1);
		
			String parentHandle=driver.getWindowHandle();
			System.out.println("Parent window:- "+parentHandle);
			driver.findElement(By.id("windowButton")).click();
			Set<String> handles =driver.getWindowHandles();
			for (String handle : handles) {
				System.out.println(handle);
				if (!handle.equals(parentHandle)) {
					driver.switchTo().window(handle);
					Thread.sleep(1000);
					driver.close();
				}
			}
			driver.switchTo().window(parentHandle);
			
			driver.findElement(By.id("messageWindowButton")).click();
			Set<String> handles1 =driver.getWindowHandles();
			for (String handle : handles1) {
				System.out.println(handle);
				if (!handle.equals(parentHandle)) {
					driver.switchTo().window(handle);
					Thread.sleep(1000);
					driver.close();
				}
			}
			driver.switchTo().window(parentHandle);
		
	}
}
