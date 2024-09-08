package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class InteractionsDragabble {
	
public void ClickDragabble(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[5]/div/ul/li[5]")).click();
		Thread.sleep(2000);
	}


public void DrogabbleSimple(WebDriver driver) throws Exception {
	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0, 300)");

	
	//Element which needs to drag.    		
	   WebElement From=driver.findElement(By.xpath("//*[@id=\"dragBox\"]"));	
	     
	//Element on which need to drop.		
	   WebElement To=driver.findElement(By.xpath("//*[@id=\"draggableExample-tabpane-simple\"]"));					
	     		
	//Using Action class for drag and drop.		
	   Actions act=new Actions(driver);					
	
	//Dragged and dropped.		
	   act.dragAndDrop(From, To).build().perform();	
//	   act.dra
	
}


public void AxisRestrictionDragabble(WebDriver driver) throws Exception {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0, 300)");

	driver.findElement(By.id("draggableExample-tab-axisRestriction")).click();
	Thread.sleep(2000);
	
	
	//Element which needs to drag.    		
	   WebElement From=driver.findElement(By.xpath("//div[text()='Only Y']"));
	   
	   WebElement From2=driver.findElement(By.xpath("//div[text()='Only X']")); 
	//Using Action class for drag and drop.		
	   Actions act=new Actions(driver);					
	
	//Dragged and dropped.		
	   act.dragAndDropBy(From, 0, -50).build().perform();
	   act.dragAndDropBy(From2, 100, 0).build().perform();
	   
	   
	   
}


public void ContainerRestrictionDragabble(WebDriver driver) throws Exception {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0, 300)");

	driver.findElement(By.id("draggableExample-tab-containerRestriction")).click();
	Thread.sleep(2000);
	
	
	//Element which needs to drag.    		
//	   WebElement From=driver.findElement(By.xpath("//div[text()='I'm contained within the box']"));
	WebElement From=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[3]/div[1]/div"));
	
	
	   WebElement From2=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[3]/div[2]/span")); 
	//Using Action class for drag and drop.		
	   Actions act=new Actions(driver);					
	
	//Dragged and dropped.		
	   act.dragAndDropBy(From, 146, 53).build().perform();
	   act.dragAndDropBy(From2, 7, 50).build().perform();
	   
	   
	   
}




public void Cursorstyle(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0, 300)");

	driver.findElement(By.id("draggableExample-tab-cursorStyle")).click();
	Thread.sleep(2000);
	
	
	//Element which needs to drag.    		
			WebElement centerbox=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[4]/div/div[1]"));
			WebElement leftbox=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[4]/div/div[2]"));
			WebElement bottombox=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[4]/div/div[3]"));
			
			
			//Using Action class for drag and drop.		
			   Actions act=new Actions(driver);					
			
			//Dragged and dropped.		
			   act.dragAndDropBy(centerbox, 174, 110).build().perform();
			   act.dragAndDropBy(leftbox, 75, 30).build().perform();
			   act.dragAndDropBy(bottombox, 174, 150).build().perform();
}
}
