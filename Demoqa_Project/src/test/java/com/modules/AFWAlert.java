package com.modules;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AFWAlert {

	@Test
	public void ClickElment(WebDriver driver) throws InterruptedException {
		//Alerts button
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[3]/div/ul/li[2]")).click();
		Thread.sleep(1000);

	}
	
	public void ManageAlert(WebDriver driver) throws InterruptedException {
		driver.findElement(By.id("alertButton")).click();
		
		
		Alert a1=driver.switchTo().alert();
		System.out.println(a1.getText());
		
//		a1.dismiss();
		Thread.sleep(2000);
		a1.accept();
		
		
		
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		//Locating element by link text and store in variable "Element"        
		        WebElement Element = driver.findElement(By.id("timerAlertButton"));
//
//		        // Scrolling down the page till the element is found
		        js.executeScript("arguments[0].scrollIntoView();", Element);

		        WebDriverWait Wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		       
		        driver.findElement(By.id("timerAlertButton")).click();
		        Alert a2=Wait.until(ExpectedConditions.alertIsPresent());
//		        
		        a2=driver.switchTo().alert();
				System.out.println(a2.getText());
//				
//				a2.dismiss();
				Thread.sleep(3000);
				a2.accept();
		
		
				Thread.sleep(1000);
//				Actions actions=new Actions(driver);
//				JavascriptExecutor js1 = (JavascriptExecutor) driver;
//				//Locating element by link text and store in variable "Element"        
//				        WebElement Element = driver.findElement(By.id("confirmButton"));
//
////				        // Scrolling down the page till the element is found
//				        js1.executeScript("arguments[0].scrollIntoView();", Element);
//				        actions.click().perform();
		driver.findElement(By.id("confirmButton")).click();
		Alert a3=driver.switchTo().alert();
		System.out.println();
		System.out.println(a3.getText());
		
//		a3.dismiss();
		Thread.sleep(3000);
		a3.accept();
		System.out.println(driver.findElement(By.id("confirmResult")).getText());
		
		
		Thread.sleep(1000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		//Locating element by link text and store in variable "Element"        
		        WebElement Element1 = driver.findElement(By.id("promtButton"));
//
//		        // Scrolling down the page till the element is found
		        js.executeScript("arguments[0].scrollIntoView();", Element1);
		
		        
		        
		driver.findElement(By.id("promtButton")).click();
		//Alert palert=driver.switchTo().alert();
		Alert palert=driver.switchTo().alert();//sendKeys("123");
		Thread.sleep(2000);
		System.out.println();
		System.out.println(palert.getText());
		palert.sendKeys("Test User");
//		palert.dismiss();
		Thread.sleep(4000);
		palert.accept();
		System.out.println(driver.findElement(By.id("promptResult")).getText());
		Thread.sleep(3000);
	}

}
