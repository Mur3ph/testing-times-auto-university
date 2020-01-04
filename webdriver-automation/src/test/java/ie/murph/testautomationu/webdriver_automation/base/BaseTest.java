package ie.murph.testautomationu.webdriver_automation.base;

import java.util.logging.Logger;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import ie.murph.testautomationu.webdriver_automation.controller.PageController;
import ie.murph.testautomationu.webdriver_automation.driver.ChromeDriverTest;
import ie.murph.testautomationu.webdriver_automation.pages.home.Home;
import ie.murph.testautomationu.webdriver_automation.util.IWebsite;
import ie.murph.testautomationu.webdriver_automation.util.LoggingUtil;

public class BaseTest {
	private static final Logger LOGGER = LoggingUtil.getInstance(); 
	private ChromeDriverTest chromeDriverTest;
	private PageController pageController;
	protected Home home;
	
	@BeforeClass
	public void setUp() {
		LOGGER.info("++setUp()");
		chromeDriverTest = new ChromeDriverTest();
		chromeDriverTest.setWebsiteUnderTest(IWebsite.THE_INTERNET);
		this.pageController.gotoUrl("", chromeDriverTest.getChromeDriver());
		this.home = new Home(chromeDriverTest.getChromeDriver());
	}
	
	@AfterClass
	public void teardown() {
		LOGGER.info("++teardown()");
		chromeDriverTest.delayBrowserClosingBy3Seconds();
		chromeDriverTest.shutBrowser();
	}
	
}
