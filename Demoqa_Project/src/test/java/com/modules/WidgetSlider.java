package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WidgetSlider {
	
	public void ClickSlider(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[4]/div/ul/li[4]")).click();
		Thread.sleep(2000);
	}
	
	public void Slider(WebDriver driver) throws Exception {
		WebElement slider=driver.findElement(By.id("sliderContainer"));
		
		Actions a1=new Actions(driver);
		a1.moveToElement(slider)
		.clickAndHold()
		.moveByOffset(0, 50)
		.release()
		.perform();
		Thread.sleep(2000);
		
	}

}
