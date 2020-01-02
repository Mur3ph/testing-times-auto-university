package ie.murph.testautomationu.webdriver_automation.pages.home;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ie.murph.testautomationu.webdriver_automation.pages.login.Login;
import ie.murph.testautomationu.webdriver_automation.util.IWebsite;
import ie.murph.testautomationu.webdriver_automation.util.LoggingUtil;
import ie.murph.testautomationu.webdriver_automation.util.XPath;

public class Home {

	private static final Logger LOGGER = LoggingUtil.getInstance(); 
	private WebDriver driver;
	private By formAuthenticationLink = By.xpath(XPath.HOME_PAGE_FORM_AUTHENTICATION.toString());
	
	public Home(WebDriver driver) {
		LOGGER.info("++Home( " + driver + " ) Constructor: Declaring Chrome Web Driver and setting website URL");
		this.driver = driver;
	}
	
	public void run() {
		LOGGER.info("++run()");
		visitWebsiteUnderTest();
		clickFormAuthenticationLink();
		
		delayBrowserClosing();
		shutBrowser();
		LOGGER.info("--run()");
	}
	
	public void visitWebsiteUnderTest() {
		LOGGER.info("++visitWebsiteUnderTest()");
		this.driver.get(IWebsite.THE_INTERNET);
	}
	
	public Login clickFormAuthenticationLink() {
		LOGGER.info("++clickFormAuthenticationLink()");
		this.driver.findElement(this.formAuthenticationLink).click();
		LOGGER.info("--clickFormAuthenticationLink()");
		return new Login(this.driver);
	}
	
	public void shutBrowser() {
		LOGGER.info("++shutBrowser()");
		this.driver.quit();
	}

	public void delayBrowserClosing() {
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
