package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ElementUpload {
	@Test
	public void ClickElment(WebDriver driver) throws InterruptedException {
		Actions actions=new Actions(driver);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		//Locating element by link text and store in variable "Element"        
		        WebElement Element1 = driver.findElement(By.xpath("//*[@id=\"item-7\"]"));

		        // Scrolling down the page till the element is found
		        js1.executeScript("arguments[0].scrollIntoView();", Element1);
		        driver.findElement(By.xpath("//*[@id=\"item-7\"]")).click();
		
	}
	
	public void downloadimage(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"downloadButton\"]")).click();
	}
	
	public void uploadphoto(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 50)");
		Thread.sleep(2000);
		WebElement uploadElement = driver.findElement(By.id("uploadFile"));
//
//        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("G:\\Material\\tops\\sampleFile.jpeg");
		Thread.sleep(2500);
//		js1.executeScript("window.scrollBy(0, 100)");
		System.out.println("Element Upload Content:- ");
		WebElement uploadfpath=driver.findElement(By.id("uploadedFilePath"));
		System.out.println(uploadfpath.getText());
		System.out.println();
	}

}
