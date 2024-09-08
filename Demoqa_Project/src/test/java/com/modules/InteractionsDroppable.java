package com.modules;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InteractionsDroppable {
	
	public void ClickDroppable(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[5]/div/ul/li[4]")).click();
		Thread.sleep(2000);
	}

	
	
	
	public void DroppableSimple(WebDriver driver) throws Exception {
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 300)");

		
		//Element which needs to drag.    		
		   WebElement From=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));	
		     
		//Element on which need to drop.		
		   WebElement To=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));					
		     		
		//Using Action class for drag and drop.		
		   Actions act=new Actions(driver);					
		
		//Dragged and dropped.		
		   act.dragAndDrop(From, To).build().perform();	
		
	}
	
	
public void AcceptDroppable(WebDriver driver) throws Exception {
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 300)");

		driver.findElement(By.id("droppableExample-tab-accept")).click();
		Thread.sleep(2000);
		
		
		//Element which needs to drag.    		
		   WebElement From=driver.findElement(By.xpath("//div[text()='Acceptable']"));
		   
		   WebElement From2=driver.findElement(By.xpath("//div[text()='Not  Acceptable']")); 
		//Element on which need to drop.		
//		   WebElement To=driver.findElement(By.id("droppable"));					
		   WebElement To=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/div[2]")); 		
		//Using Action class for drag and drop.		
		   Actions act=new Actions(driver);					
		
		//Dragged and dropped.		
		   act.dragAndDrop(From, To).build().perform();	
		   act.dragAndDrop(From2, To).build().perform();
		   
		   
		   
		   
		
		   
		   
	}


public void PreventPropogationDroppable(WebDriver driver) throws Exception {
	
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("window.scrollBy(0, 300)");

	driver.findElement(By.id("droppableExample-tab-preventPropogation")).click();
	Thread.sleep(2000);
	
	
	//Element which needs to drag.    		
	   WebElement From=driver.findElement(By.id("dragBox"));	
	     
	//Element on which need to drop.		
	   WebElement outerdrop=driver.findElement(By.id("notGreedyDropBox"));	
	   Thread.sleep(3000);
	   WebElement innerdrop=driver.findElement(By.id("notGreedyInnerDropBox"));  		
	//Using Action class for drag and drop.		
	   Actions act=new Actions(driver);
	   Actions act2=new Actions(driver);
	   
	
	//Dragged and dropped.		
	   act.dragAndDrop(From, outerdrop).build().perform();
	   Thread.sleep(4000);
	   act2.dragAndDrop(From, innerdrop).build().perform();
		
	     
	//Element on which need to drop.		
	   WebElement outerdrop1=driver.findElement(By.id("greedyDropBox"));
	   Thread.sleep(3000);
	   WebElement innerdrop1=driver.findElement(By.id("greedyDropBoxInner"));  		
	//Using Action class for drag and drop.		
	   Actions act3=new Actions(driver);
	   Actions act4=new Actions(driver);
	   
	
	//Dragged and dropped.		
	   act3.dragAndDrop(From, outerdrop1).build().perform();
	   Thread.sleep(4000);
	   act4.dragAndDrop(From, innerdrop1).build().perform();
	   
	   
}

public void RevertDroppable(WebDriver driver) throws InterruptedException {
	
	driver.findElement(By.id("droppableExample-tab-revertable")).click();
	Thread.sleep(2000);
	
	
		WebDriverWait Wait=new WebDriverWait(driver, Duration.ofSeconds(20));
//		WebDriverWait wait =new WebDriverWait(driver, 40);
		//Element which needs to drag.    		
		   WebElement From=driver.findElement(By.xpath("//div[text()='Will Revert']"));	
		   WebElement From2=driver.findElement(By.xpath("//div[text()='Not Revert']"));   
		//Element on which need to drop.		
//		   WebElement To=driver.findElement(By.id("droppable"));					
		   WebElement To=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[4]/div/div[2]")); 		
		//Using Action class for drag and drop.		
		   Actions act=new Actions(driver);					
		
		//Dragged and dropped.		
		   act.dragAndDrop(From, To).build().perform();	
		   act.dragAndDrop(From2, To).build().perform();	
	
}






}
