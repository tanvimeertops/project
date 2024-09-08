package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class WidgetMenu {
	
	public void ClickMenu(WebDriver driver) throws InterruptedException {
		driver.navigate().to("https://demoqa.com/menu");
		Thread.sleep(2000);
	}
	
	
	
	public void Menu(WebDriver driver) throws Exception {
		
		WebElement Mainmenu1=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/a"));
		Actions actions=new Actions(driver);
		Action a1=actions.moveToElement(Mainmenu1).build();
		a1.perform();
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 150)");
		
		WebElement Mainmenu2=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
		Action a2=actions.moveToElement(Mainmenu2).build();
		a2.perform();
		Thread.sleep(2000);
		
		WebElement subMainmenu2=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[2]"));
		Action a3=actions.moveToElement(subMainmenu2).build();
		a3.perform();
		
		Thread.sleep(2000);
		
		WebElement subMainmenu3=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]"));
		Action a4=actions.moveToElement(subMainmenu3).build();
		a4.perform();
		
		Thread.sleep(2000);
		
		WebElement subsubMainmenu1=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/ul/li[1]"));
		Action a5=actions.moveToElement(subsubMainmenu1).build();
		a5.perform();
		
		Thread.sleep(2000);
		
		WebElement subsubMainmenu2=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/ul/li[2]/a"));
		Action a6=actions.moveToElement(subsubMainmenu2).build();
		a6.perform();
	}

}
