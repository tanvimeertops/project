package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WidgetSelectMenu {
	
	public void ClickSelectMenu(WebDriver driver) throws InterruptedException {
//		driver.navigate().to("https://demoqa.com/menu");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[4]/div/ul/li[9]")).click();
		Thread.sleep(2000);
	}

	
	public void SelectValue(WebDriver driver) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 200)");
		WebElement optgroup=driver.findElement(By.xpath("//*[@id=\"withOptGroup\"]/div/div[2]"));
		optgroup.click();
		
		Actions actions = new Actions(driver);
		actions.sendKeys("Group 1, option 1")
			   .sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		
	}
	
	public void SelectOne(WebDriver driver) throws Exception {
		WebElement selectOne=driver.findElement(By.xpath("//*[@id=\"selectOne\"]"));
		selectOne.click();
		
		Actions actions2 = new Actions(driver);
		actions2.sendKeys("Mr.").sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		
	}
	
	
	
	public void OldstyleMenu(WebDriver driver) throws InterruptedException {
		WebElement e1=driver.findElement(By.id("oldSelectMenu"));
		
		Select s1=new Select(e1);
		Thread.sleep(1000);
		s1.selectByVisibleText("Yellow");
		
		Thread.sleep(1000);
		s1.selectByVisibleText("Purple");
	}
	
	public void Multidrodown(WebDriver driver) throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 200)");
		WebElement Multidropdown=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[7]/div/div/div"));
		Multidropdown.click();
		
		Actions actions3 = new Actions(driver);
		actions3.sendKeys("Green").sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		actions3.sendKeys("Red").sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
	}
	
	
	public void MultiSelect(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 100)");

		WebElement e2=driver.findElement(By.id("cars"));

		Select s2=new Select(e2);
		
		s2.selectByValue("audi");
		s2.selectByValue("volvo");
		Thread.sleep(2000);
	}
	
}
