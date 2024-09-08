package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AFWFrame {
	@Test
	public void ClickFrame(WebDriver driver) throws InterruptedException {
		//Frame button
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[3]/div/ul/li[3]")).click();
		Thread.sleep(1000);

	}
	
	
	@Test
	public void ClickNextFrame(WebDriver driver) throws InterruptedException {
		//Frame button
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[3]/div/ul/li[4]")).click();
		Thread.sleep(1000);

	}

}
