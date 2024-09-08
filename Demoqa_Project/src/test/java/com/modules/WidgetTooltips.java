package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class WidgetTooltips {
	
	public void ClickTooltips(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[4]/div/ul/li[7]")).click();
		Thread.sleep(2000);
	}
	
	
	
	public void Tooltips(WebDriver driver) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 300)");
		
		
		WebElement Tooltip=driver.findElement(By.id("toolTipButton"));
		Actions actions=new Actions(driver);
		Action a1=actions.moveToElement(Tooltip).build();
		a1.perform();
		
		Thread.sleep(3000);
		
		WebElement Tooltipfield=driver.findElement(By.id("toolTipTextField"));
//		Actions actions=new Actions(driver);
		Action a2=actions.moveToElement(Tooltipfield).build();
		a2.perform();
		Thread.sleep(3000);
		
	}

}
