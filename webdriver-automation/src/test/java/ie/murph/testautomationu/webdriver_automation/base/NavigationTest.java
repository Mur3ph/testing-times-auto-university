package ie.murph.testautomationu.webdriver_automation.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ie.murph.testautomationu.webdriver_automation.util.IText;
import ie.murph.testautomationu.webdriver_automation.util.IWebsite;
import ie.murph.testautomationu.webdriver_automation.util.XPath;

public class NavigationTest {
	
	private WebDriver driver;
	private List<WebElement> listOfWebElements;
	
	public NavigationTest() {
		driver = new ChromeDriverTest().getChromeDriver();
		driver.get(IWebsite.THE_INTERNET);
	}
	
	private void clickShiftingContentLink() {
		WebElement shiftingContentLink = driver.findElement(By.xpath(XPath.SHIFTING_CONTENT_ANCHOR_BY_HREF.toString()));
		shiftingContentLink.click();
	}
	
	private void clickMenuElementLink() {
		WebElement menuElementLink = driver.findElement(By.xpath(XPath.MENU_ELEMENT_ANCHOR.toString()));
		menuElementLink.click();
	}
	
	private void countNumberOfMenuButtons() {
		listOfWebElements = driver.findElements(By.xpath(XPath.LIST_OF_ANCHOR_TAGS_ONLY_IN_MENU.toString()));
		System.out.println(IText.NAVIGATION_MENU_BUTTONS + listOfWebElements.size());
	}
	
	public void setup() {
		clickShiftingContentLink();
		clickMenuElementLink();
		countNumberOfMenuButtons();
		
		delayBrowserClosing();
		driver.quit();
	}

	private void delayBrowserClosing() {
		try 
		{
			Thread.sleep(3000);
		} 
			catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}

}
