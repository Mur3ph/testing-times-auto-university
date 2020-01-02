package ie.murph.testautomationu.webdriver_automation.pages.login;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;

import ie.murph.testautomationu.webdriver_automation.util.IWebsite;
import ie.murph.testautomationu.webdriver_automation.util.LoggingUtil;

public class Login {
	private static final Logger LOGGER = LoggingUtil.getInstance(); 
	private WebDriver driver;
	
	public Login(WebDriver driver) {
		LOGGER.info("++Login( " + driver + " ) Constructor: Declaring Chrome Web Driver and setting website URL");
		this.driver = driver;
		this.driver.get(IWebsite.THE_INTERNET);
	}
}
