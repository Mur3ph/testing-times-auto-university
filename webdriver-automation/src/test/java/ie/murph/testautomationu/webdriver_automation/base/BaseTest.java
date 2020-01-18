package ie.murph.testautomationu.webdriver_automation.base;

import java.util.logging.Logger;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import ie.murph.testautomationu.webdriver_automation.driver.ChromeBrowserDriver;
import ie.murph.testautomationu.webdriver_automation.pages.home.Home;
import ie.murph.testautomationu.webdriver_automation.util.IWebsite;
import ie.murph.testautomationu.webdriver_automation.util.LoggingUtil;

public class BaseTest {
	private static final Logger LOGGER = LoggingUtil.getInstance(); 
	private ChromeBrowserDriver chromeDriverTest;
	protected Home home;
	
	@BeforeTest
	public void setUp() {
		LOGGER.info("++setUp()");
		chromeDriverTest = new ChromeBrowserDriver();
		chromeDriverTest.setWebsiteUnderTest(IWebsite.THE_INTERNET);
		this.home = new Home(chromeDriverTest.getChromeDriver());
	}
	
	@AfterTest
	public void teardown() {
		LOGGER.info("++teardown()");
		chromeDriverTest.delayBrowserClosingBy3Seconds();
		chromeDriverTest.shutBrowser();
	}
	
}
