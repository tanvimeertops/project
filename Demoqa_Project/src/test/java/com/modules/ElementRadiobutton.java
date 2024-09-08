package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ElementRadiobutton {

	
	@Test
	public void ClickElment(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"item-2\"]/span")).click();	
		Thread.sleep(1000);
		
		
	}
	@Test
	public void ClickRadio(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		//Locating element by link text and store in variable "Element"        
		        WebElement Element1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[2]/label"));
		        // Scrolling down the page till the element is found
		        js1.executeScript("arguments[0].scrollIntoView();", Element1);
		        
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[2]/label")).click();
		Thread.sleep(1000);
		
		System.out.println("Element RadioButton are displaying:- ");
		WebElement out;
		out=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/p"));
		System.out.println(out.getText());
		System.out.println();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/label")).click();
		Thread.sleep(1000);
		
		out=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/p"));
		System.out.println(out.getText());
		System.out.println();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[4]/label")).click();
		Thread.sleep(1000);
		
		
		Thread.sleep(1500);
	}

	
}
