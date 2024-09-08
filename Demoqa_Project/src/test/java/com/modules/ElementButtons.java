package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ElementButtons {
	@Test
	public void ClickElment(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"item-4\"]/span")).click();
		Thread.sleep(1000);
		
	}
	
	
	@Test
	public void ClickButton(WebDriver driver) throws InterruptedException {
		
		WebElement dd=driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
		Actions actions=new Actions(driver);
		Action a1=actions.moveToElement(dd).doubleClick().build();
		a1.perform();
		
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Locating element by link text and store in variable "Element"        
		        WebElement Element = driver.findElement(By.id("rightClickBtn"));

		        // Scrolling down the page till the element is found
		        js.executeScript("arguments[0].scrollIntoView();", Element);
		        actions.contextClick(Element).perform();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[3]/button")).click();	
	
		System.out.println("Element Button are displaying:- ");
		WebElement doubleclick=driver.findElement(By.id("doubleClickMessage"));
		System.out.println(doubleclick.getText());
		System.out.println();
		
		WebElement rightclick=driver.findElement(By.id("rightClickMessage"));
		System.out.println(rightclick.getText());
		System.out.println();
		
		WebElement dynamicclick=driver.findElement(By.id("dynamicClickMessage"));
		System.out.println(dynamicclick.getText());
		System.out.println();
		
		
	}

}
