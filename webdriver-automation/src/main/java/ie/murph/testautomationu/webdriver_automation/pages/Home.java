package ie.murph.testautomationu.webdriver_automation.pages;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ie.murph.testautomationu.webdriver_automation.driver.ChromeDriverTest;
import ie.murph.testautomationu.webdriver_automation.util.IWebsite;
import ie.murph.testautomationu.webdriver_automation.util.LoggingUtil;
import ie.murph.testautomationu.webdriver_automation.util.XPath;

public class Home {

	private static final Logger LOGGER = LoggingUtil.getInstance(); 
	private WebDriver driver;
	private By formAuthenticationLink = By.xpath(XPath.HOME_PAGE_FORM_AUTHENTICATION.toString());
	
	public Home() {
		LOGGER.info("++NavigationTest Constructor: Declaring Chrome Web Driver and setting website URL");
		driver = new ChromeDriverTest().getChromeDriver();
		driver.get(IWebsite.THE_INTERNET);
	}
	
	private void clickFormAuthenticationLink() {
		LOGGER.info("++clickFormAuthenticationLink()");
		driver.findElement(formAuthenticationLink).click();
		LOGGER.info("--clickFormAuthenticationLink()");
	}
	
	public void setup() {
		LOGGER.info("++setup()");
		clickFormAuthenticationLink();
		
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
