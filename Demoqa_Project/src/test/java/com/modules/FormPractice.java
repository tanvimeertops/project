package com.modules;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class FormPractice {
	public void ClickElment(WebDriver driver) throws InterruptedException {
			
		Actions actions=new Actions(driver);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		//Locating element by link text and store in variable "Element"        
		        WebElement Element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[2]/span"));

		        // Scrolling down the page till the element is found
		        js1.executeScript("arguments[0].scrollIntoView();", Element);
		        actions.click().perform();
			//Form Button
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[2]/span")).click();	
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[2]/div")).click();
		}
	public void EnterDetailForm(WebDriver driver) throws InterruptedException, IOException {
		
		Actions actions=new Actions(driver);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		//Locating element by link text and store in variable "Element"        
		        WebElement Element = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));

//		        // Scrolling down the page till the element is found
		        js1.executeScript("arguments[0].scrollIntoView();", Element);
		        actions.click().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Don");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Don");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("Don432@yopmail.com");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys("6355797389");
		
		Thread.sleep(1000);
		WebElement calendar = driver.findElement(By.id("dateOfBirthInput"));
		calendar.click();

		WebElement prev_button = calendar.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/button[1]"));
		prev_button.click();
		
		WebElement next_button = calendar.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/button[2]"));
		next_button.click();

		WebElement dateToSelect = driver.findElement(By.cssSelector("div[aria-label='Choose Saturday, August 3rd, 2024']")); // Example XPath

        // Click on the desired date
        dateToSelect.click();
        driver.findElement(By.id("subjectsInput")).sendKeys("Hello Myself John Don");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();
        WebElement uploadElement = driver.findElement(By.id("uploadPicture"));
        //
//                // enter the file path onto the file-selection input field
                uploadElement.sendKeys("G:\\Material\\tops\\sampleFile.jpeg");
                
        driver.findElement(By.cssSelector("textarea.form-control")).sendKeys("Hello Myself John Don");
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		
        driver.findElement(By.cssSelector("div.css-tlfecz-indicatorContainer")).click();
        //driver.findElement(By.linkText("Haryana")).click();
		driver.findElement(By.xpath("//div[text()='Rajasthan']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[2]/div")).click();
		
		driver.findElement(By.xpath("//div[text()='Jaipur']")).click();
		
		driver.findElement(By.id("submit")).click();
		
		
		File file=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(file,new File("Demophoto\\FormDetails.jpg"));
	}

}
