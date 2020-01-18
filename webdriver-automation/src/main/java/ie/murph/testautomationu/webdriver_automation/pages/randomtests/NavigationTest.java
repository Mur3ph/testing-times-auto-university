package ie.murph.testautomationu.webdriver_automation.pages.randomtests;

import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ie.murph.testautomationu.webdriver_automation.driver.ChromeBrowserDriver;
import ie.murph.testautomationu.webdriver_automation.util.IText;
import ie.murph.testautomationu.webdriver_automation.util.IWebsite;
import ie.murph.testautomationu.webdriver_automation.util.LoggingUtil;
import ie.murph.testautomationu.webdriver_automation.util.XPath;

public class NavigationTest {
	
//	private static final Logger LOGGER = Logger.getLogger(NavigationTest.class.getName());
	private static final Logger LOGGER = LoggingUtil.getInstance(); 
	private WebDriver driver;
	private List<WebElement> listOfWebElements;
	
	public NavigationTest() {
		LOGGER.info("++NavigationTest Constructor: Declaring Chrome Web Driver and setting website URL");
		driver = new ChromeBrowserDriver().getChromeDriver();
		driver.get(IWebsite.THE_INTERNET);
	}
	
	private void clickShiftingContentLink() {
		LOGGER.info("++clickShiftingContentLink()");
		WebElement shiftingContentLink = driver.findElement(By.xpath(XPath.SHIFTING_CONTENT_ANCHOR_BY_HREF.toString()));
		clickButton(shiftingContentLink);
		LOGGER.info("--clickShiftingContentLink()");
	}
	
	private void clickMenuElementLink() {
		LOGGER.info("++clickMenuElementLink()");
		WebElement menuElementLink = driver.findElement(By.xpath(XPath.MENU_ELEMENT_ANCHOR.toString()));
		clickButton(menuElementLink);
		LOGGER.info("--clickMenuElementLink()");
	}
	
	private void clickButton(WebElement webElement) {
		LOGGER.info("++clickButton( " + webElement + " )");
		webElement.click();
		LOGGER.info("--clickButton( " + webElement + " )");
	}
	
	private void countNumberOfMenuButtons() {
		LOGGER.info("++countNumberOfMenuButtons()");
		listOfWebElements = driver.findElements(By.xpath(XPath.LIST_OF_ANCHOR_TAGS_ONLY_IN_MENU.toString()));
		System.out.println(IText.NAVIGATION_MENU_BUTTONS + listOfWebElements.size());
		LOGGER.info("--countNumberOfMenuButtons()");
	}
	
	public void setup() {
		LOGGER.info("++setup()");
		clickShiftingContentLink();
		clickMenuElementLink();
		countNumberOfMenuButtons();
		
		delayBrowserClosing();
		driver.quit();
		LOGGER.info("--setup()");
	}

	private void delayBrowserClosing() {
		LOGGER.info("++delayBrowserClosing()");
		try 
		{
			Thread.sleep(3000);
		} 
			catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		LOGGER.info("--delayBrowserClosing()");
	}

}
