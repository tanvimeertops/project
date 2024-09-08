package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WidgetAutoComplete {
	@Test
	public void ClickWidgetAutoComplete(WebDriver driver) throws InterruptedException {
		
		
		//Auto complete button
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[4]/div/ul/li[2]")).click();
		Thread.sleep(1000);
		
	}
	@Test
	public void MutlipleColorname(WebDriver driver) throws InterruptedException {
		//Multiple Color name
//		driver.findElement(By.xpath("//*[@id=\"autoCompleteMultipleInput\"]")).sendKeys("Red");
//		Thread.sleep(1000);
		WebElement Multicolor=driver.findElement(By.xpath("//*[@id=\"autoCompleteMultipleInput\"]"));
//		Multidropdown.click();
		
		Actions actions3 = new Actions(driver);
		actions3.sendKeys("Green").sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		actions3.sendKeys("Indigo").sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		

	}
	
	@Test
	public void SingleColorname(WebDriver driver) throws InterruptedException {
		//Single Color name
		driver.findElement(By.xpath("//*[@id=\"autoCompleteSingleInput\"]")).sendKeys("Yellow");
		Thread.sleep(1000);
		
		

	}

}
