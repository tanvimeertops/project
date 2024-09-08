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

public class ElementTextBox {
	WebDriver driver=null;

	@Test(priority = 1)
	public void ClickElment(WebDriver driver) throws InterruptedException {
		Actions actions=new Actions(driver);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		//Locating element by link text and store in variable "Element"        
		        WebElement Element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));

//		        // Scrolling down the page till the element is found
		        js1.executeScript("arguments[0].scrollIntoView();", Element);
		        actions.click().perform();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]")).click();	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"item-0\"]/span")).click();	
		
		
		
	}
	@Test(priority = 2)

	public void enterUsername(WebDriver driver,String username) throws InterruptedException {
		driver.findElement(By.id("userName")).sendKeys(username);
		Thread.sleep(1000);

	}
	
	
	@Test(priority = 3)
	public void enterEmail(WebDriver driver,String userEmail) throws InterruptedException {
		driver.findElement(By.id("userEmail")).sendKeys(userEmail);
		Thread.sleep(1000);
	}
	@Test(priority = 4)

	public void enterAddress(WebDriver driver,String caddress,String paddress) throws InterruptedException {
		driver.findElement(By.id("currentAddress")).sendKeys("Surat");
		Thread.sleep(1000);
		driver.findElement(By.id("permanentAddress")).sendKeys("Surat");
		Thread.sleep(1000);

	}
	
	
	
	@Test(priority = 5)
	public void clickSubmit(WebDriver driver) throws InterruptedException {
		Actions actions=new Actions(driver);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		//Locating element by link text and store in variable "Element"        
		        WebElement Element = driver.findElement(By.id("submit"));

//		        // Scrolling down the page till the element is found
		        js1.executeScript("arguments[0].scrollIntoView();", Element);
		        actions.click().perform();
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		
		System.out.println("Element Textbox are displaying:- ");
		WebElement out=driver.findElement(By.id("output"));
		System.out.println(out.getText());
		System.out.println();
	}
	
}
