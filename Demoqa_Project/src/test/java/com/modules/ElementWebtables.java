package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ElementWebtables {
	@Test
	public void ClickElment(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"item-3\"]/span")).click();
		Thread.sleep(1000);
		
		
	}
	public void AddTable(WebDriver driver,String firstname,String lname,String email,String age,String Salary,String Dept) throws InterruptedException {
		driver.findElement(By.id("addNewRecordButton")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(firstname);
		Thread.sleep(1000);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		Thread.sleep(1000);
		driver.findElement(By.id("userEmail")).sendKeys(email);
		Thread.sleep(1000);
		driver.findElement(By.id("age")).sendKeys(age);
		Thread.sleep(1000);
		driver.findElement(By.id("salary")).sendKeys(Salary);
		Thread.sleep(1000);
		driver.findElement(By.id("department")).sendKeys(Dept);
		
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("searchBox")).sendKeys("Testing");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 200)");
	}

}
