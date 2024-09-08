package com.modules;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ElementLinks {
	@Test
	public void ClickElment(WebDriver driver) throws InterruptedException {
		Actions actions=new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Locating element by link text and store in variable "Element"        
		        WebElement Element = driver.findElement(By.xpath("//*[@id=\"item-5\"]/span"));

		        // Scrolling down the page till the element is found
		        js.executeScript("arguments[0].scrollIntoView();", Element);
		        actions.click().perform();
		
		
		  driver.findElement(By.xpath("//*[@id=\"item-5\"]/span")).click();
		
	}
	
	@Test
	public void ClickLinks(WebDriver driver) throws InterruptedException {
		String main_w= driver.getWindowHandle();
		
		System.out.println("main window is :"+main_w);
		
		//Home Button
		Thread.sleep(1500);
		driver.findElement(By.linkText("Home")).click();
		
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
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
			driver.findElement(By.xpath("//*[@id=\"dynamicLink\"]")).click();
			Set<String> all_w1=driver.getWindowHandles();
			Iterator<String> i2=all_w1.iterator();
			
			while (i2.hasNext()) {
				String child_w = (String) i2.next();
				System.out.println("all window:-\n"+child_w);
				
				if (!main_w.equals(child_w)) {
					driver.switchTo().window(child_w);
					
					Thread.sleep(2000);
					driver.close();
				}}
				driver.switchTo().window(main_w);
				
				
				driver.findElement(By.id("created")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("no-content")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("moved")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("bad-request")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("unauthorized")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("forbidden")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("invalid-url")).click();
				Thread.sleep(1000);
				
//				WebElement lr=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/p[10]"));
//				System.out.println(lr.getText());
//				System.out.println();
		
	}

}
