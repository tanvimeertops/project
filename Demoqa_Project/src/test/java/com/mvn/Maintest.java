package com.mvn;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.browser.BrowserConfiguration;
import com.modules.AFWAlert;
import com.modules.AFWBroswerWindow;
import com.modules.AFWFrame;
import com.modules.AFWModalDialog;
import com.modules.BSALogin;
import com.modules.ElementBrokenLink;
import com.modules.ElementButtons;
import com.modules.ElementCheckBox;
import com.modules.ElementDynamic;
import com.modules.ElementLinks;
import com.modules.ElementRadiobutton;
import com.modules.ElementTextBox;
import com.modules.ElementUpload;
import com.modules.ElementWebtables;
import com.modules.FormPractice;
import com.modules.InteractionsDragabble;
import com.modules.InteractionsDroppable;
import com.modules.InteractionsResizable;
import com.modules.InteractionsSelectable;
import com.modules.InteractionsSortable;
import com.modules.WidgetAccordian;
import com.modules.WidgetAutoComplete;
import com.modules.WidgetDatepicker;
import com.modules.WidgetMenu;
import com.modules.WidgetProgress;
import com.modules.WidgetSelectMenu;
import com.modules.WidgetSlider;
import com.modules.WidgetTabs;
import com.modules.WidgetTooltips;

public class Maintest {
	WebDriver driver=null;
	
	ElementTextBox et=null;
	ElementCheckBox ec=null;
	ElementRadiobutton er=null;
	ElementWebtables ew=null;
	ElementButtons eb=null;
	ElementLinks el=null;
	ElementBrokenLink ebl=null;
	ElementUpload eu=null;
	ElementDynamic ed=null;
	FormPractice fp=null;
	
	AFWBroswerWindow afwb=null;
	AFWAlert afwa=null;
	AFWFrame afwf=null;
	AFWModalDialog afwmd=null;
	
	WidgetAccordian wa=null;
	WidgetAutoComplete wac=null;
	WidgetDatepicker wdp=null;
	WidgetSlider ws=null;
	WidgetProgress wp=null;
	WidgetTabs wt=null;
	WidgetTooltips wtt=null;
	WidgetMenu wm=null;
	WidgetSelectMenu wsm=null;
	
	
	InteractionsSortable isortable=null;
	InteractionsSelectable iSelectable=null;
	InteractionsResizable iResizable=null;
	InteractionsDroppable iDroppable=null;
	InteractionsDragabble iDragabble=null;
	
	BSALogin dlogin=null;
	
	
	
	
	@BeforeClass
	public void loadBrowser() throws InterruptedException
	{
		driver=new BrowserConfiguration().ChromeBrowserSelection("chrome", "https://demoqa.com/");
		Thread.sleep(3000);
	}
	@BeforeTest
	public void beforetest() throws Exception
	{
		et=new ElementTextBox();
		ec=new ElementCheckBox();
		er=new ElementRadiobutton();
		ew=new ElementWebtables();
		eb=new ElementButtons();
		el=new ElementLinks();
		ebl=new ElementBrokenLink();
		eu=new ElementUpload();
		ed=new ElementDynamic();
		fp=new FormPractice();
		
		afwb=new AFWBroswerWindow();
		afwa=new AFWAlert();
		afwf=new AFWFrame();
		afwmd=new AFWModalDialog();
		
		wa=new WidgetAccordian();
		wac=new WidgetAutoComplete();
		wdp=new WidgetDatepicker();
		ws=new WidgetSlider();
		wp=new WidgetProgress();
		wt=new WidgetTabs();
		wtt=new WidgetTooltips();
		wm=new WidgetMenu();
		wsm=new WidgetSelectMenu();
		
		isortable=new InteractionsSortable();
		iSelectable=new InteractionsSelectable();
		iResizable=new InteractionsResizable();
		iDroppable=new InteractionsDroppable();
		iDragabble=new InteractionsDragabble();
		
		dlogin=new BSALogin();
		
	}
//	@Ignore
	@Test(priority = 0)
	public void TextboxDetails() throws InterruptedException
	{
		et.ClickElment(driver);
		et.enterUsername(driver, "don432");
		et.enterEmail(driver, "don432@yopmail.com");
		et.enterAddress(driver, "Surat", "Surat");
		et.clickSubmit(driver);
	}
//	@Ignore
	@Test(priority = 1)
	public void CheckboxDetails() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0);");
		ec.ClickElment(driver);
		ec.Clickcheck(driver);
	}
//	@Ignore
	@Test(priority = 2)
	public void RadioDetails() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 20);");
		er.ClickElment(driver);
		er.ClickRadio(driver);
	}
//	@Ignore
	@Test(priority = 3)
	public void WebtabDetails() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 0)");
		ew.ClickElment(driver);
		ew.AddTable(driver, "Don", "John", "Don432@yopmail.com", "24", "15000", "Testing");
	}
//	@Ignore
	@Test(priority = 4)
	public void Buttonevents() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 0)");
		eb.ClickElment(driver);
		eb.ClickButton(driver);
	}
//	@Ignore
	@Test(priority = 5)
	public void ClickonLink() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 0)");
		el.ClickElment(driver);
		el.ClickLinks(driver);
	}
//	@Ignore
	@Test(priority = 6)
	public void ClickonbrokenLink() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 0)");
		ebl.ClickElment(driver);
		ebl.Clickbroken(driver);
	}
//	@Ignore
	@Test(priority = 7)
	public void Uploadimage() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 0)");
		eu.ClickElment(driver);
		//eu.downloadimage(driver);
		eu.uploadphoto(driver);
	}
//	@Ignore
	@Test(priority = 8)
	public void Dynamic() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 100)");
		ed.ClickElment(driver);
		ed.clickcolour(driver);
	}
	@Test(priority = 9)
	public void FormDetails() throws Exception
	{
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0, 250)");
		fp.ClickElment(driver);
		fp.EnterDetailForm(driver);
	}
	@Test(priority = 10)
	public void BrosWind() throws Exception
	{
		driver.navigate().refresh();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, -150)");
		
		afwb.ClickElment(driver);
		afwb.BrowserWindow(driver);
	}
	
	@Test(priority = 11)
	public void alert() throws Exception
	{
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0, -150)");
		
		afwa.ClickElment(driver);
		afwa.ManageAlert(driver);
	}
//	@Ignore
	@Test(priority = 12)
	public void Frame() throws Exception
	{
		
		afwf.ClickFrame(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 150)");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[3]/div/ul/li[4]")).click();
		afwf.ClickNextFrame(driver);
	}
//	@Ignore
	@Test(priority = 13)
	public void Dialog() throws Exception
	{
//		driver.navigate().
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 100)");
		afwmd.ClickElment(driver);
//		md.ClickModelDialog(driver);
		afwmd.SmallModel(driver);
		afwmd.LargeModel(driver);
		
	}
	
	@Test(priority = 14)
	public void WidAccord() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 150)");
		wa.ClickWidget(driver);
		wa.WidgetAccord(driver);
		
	}
	
	@Test(priority = 15)
	public void WidAutoComplete() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 150)");
		wac.ClickWidgetAutoComplete(driver);
		wac.SingleColorname(driver);
		wac.MutlipleColorname(driver);
		
	}
	
	@Test(priority = 16)
	public void WidDatePicker() throws Exception
	{
//		driver=new BrowserConfiguration().ChromeBrowserSelection("chrome", "https://demoqa.com/date-picker");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 150)");
		wdp.ClickWidgetdateicker(driver);
		wdp.Selectdateicker(driver);
		//wdp.Selectdatetime(driver);
		
	}
	
	
	@Test(priority = 17)
	public void WidSlider() throws Exception
	{
//		driver=new BrowserConfiguration().ChromeBrowserSelection("chrome", "https://demoqa.com/date-picker");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 150)");
		ws.ClickSlider(driver);
		ws.Slider(driver);
		
	}
	@Test(priority = 18)
	public void WidProgress() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 250)");
		wp.ClickProgress(driver);
		wp.Progress(driver);
		
	}
	@Test(priority = 19)
	public void WidTabs() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 250)");
		wt.ClickTabs(driver);
		wt.Tabs(driver);
		
	}
	
	
	
	@Test(priority = 20)
	public void WidTooltip() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 250)");
		wtt.ClickTooltips(driver);
		wtt.Tooltips(driver);
		
	}
	
	
	@Test(priority = 21)
	public void WidMenu() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 350)");
		wm.ClickMenu(driver);
		wm.Menu(driver);
		
	}
	
	
	@Test(priority = 22)
	public void WidSelectMenu() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 350)");
		wsm.ClickSelectMenu(driver);
		wsm.SelectValue(driver);
		wsm.SelectOne(driver);
		wsm.OldstyleMenu(driver);
		
		wsm.Multidrodown(driver);
		wsm.MultiSelect(driver);
		
	}
	
	@Test(priority = 23)
	public void InteractSortable() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 350)");
		isortable.ClickSortable(driver);
		isortable.Sortable(driver);
		
	}
	
	@Test(priority = 24)
	public void InteractSelectable() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 350)");
		iSelectable.ClickSelectable(driver);
		iSelectable.Selectable(driver);
		
	}
	
	
	@Test(priority = 25)
	public void InteractResizable() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 350)");
		iResizable.ClickResizable(driver);
		iResizable.Resizable(driver);
		
	}
	
	@Test(priority = 26)
	public void InteractDroppable() throws Exception
	{
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0, 350)");
		iDroppable.ClickDroppable(driver);
		iDroppable.DroppableSimple(driver);
		iDroppable.AcceptDroppable(driver);
		iDroppable.PreventPropogationDroppable(driver);
		iDroppable.RevertDroppable(driver);
		
	}
	
	
	
	@Test(priority = 27)
	public void InteractDragabble() throws Exception
	{
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0, 350)");
		iDragabble.ClickDragabble(driver);
		iDragabble.DrogabbleSimple(driver);
		iDragabble.AxisRestrictionDragabble(driver);
		iDragabble.ContainerRestrictionDragabble(driver);
		iDragabble.Cursorstyle(driver);
		
	}
	
	
	@Test(priority = 28)
	public void BSLogin() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 400)");
		dlogin.ClickBookStoreApplication(driver);
		dlogin.ClickLogin(driver);
		dlogin.Login(driver);
		dlogin.Logout(driver);
		dlogin.Newuser(driver);
//		dlogin.Backtologin(driver);
	
	}
	
	
	
	@Ignore
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		System.out.println("Bye Bye...");
		Thread.sleep(3000);
		driver.close();		
	}

}
