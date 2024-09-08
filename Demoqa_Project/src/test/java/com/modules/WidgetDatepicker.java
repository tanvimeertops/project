package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class WidgetDatepicker {
	
	
	@Test
	public void ClickWidgetdateicker(WebDriver driver) throws InterruptedException {
		
		
		//Date picker button
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[4]/div/ul/li[3]")).click();
		Thread.sleep(1000);
		
	}
	
	@Test
	public void Selectdateicker(WebDriver driver) throws InterruptedException {
		
		
		WebElement calendar = driver.findElement(By.id("datePickerMonthYearInput"));
		calendar.click();
		
		WebElement prev_button = calendar.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/button[1]"));
		prev_button.click();
		
		WebElement next_button = calendar.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/button[2]"));
		next_button.click();
		
		WebElement dateToSelect = driver.findElement(By.cssSelector("div[aria-label='Choose Saturday, August 3rd, 2024']")); // Example XPath

        // Click on the desired date
        dateToSelect.click();
	}
	
	
	@Test
	public void Selectdatetime(WebDriver driver) throws InterruptedException {
		
		
		WebElement datetime = driver.findElement(By.id("dateAndTimePickerInput"));
		datetime.click();
		
		WebElement prev_button = datetime.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/button[1]"));
		prev_button.click();
		
		WebElement next_button = datetime.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/button[2]"));
		next_button.click();
		
//		 // selecting month June
//	      WebElement month = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]"));
//	      Select selct = new Select(month);
//	      selct.selectByVisibleText("July 2024");
		
		WebElement dateToSelect = driver.findElement(By.cssSelector("div[aria-label='Choose Thursday, July 18th, 2024']")); // Example XPath
		WebElement timeToSelect = driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[3]/div[2]/div/ul/li[67]")); // Example XPath
        // Click on the desired date
        dateToSelect.click();
        timeToSelect.click();
	}

}
