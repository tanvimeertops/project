package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ElementCheckBox {
	WebDriver driver=null;
//	@BeforeTest

	public void openBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver-win64\\chromedriver.exe");

		 driver=new ChromeDriver();
		driver.get("https://demoqa.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	@Test
	public void ClickElment(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"item-1\"]/span")).click();		
		Thread.sleep(1000);
		
		
	}
	@Test
	public void Clickcheck(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/div/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[3]")).click();		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[3]")).click();		
		Thread.sleep(2000);
		
		System.out.println("Element CheckBox are displaying:- ");
		WebElement out=driver.findElement(By.id("result"));
		System.out.println(out.getText());
		System.out.println();
	}
	
	

}
