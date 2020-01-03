package ie.murph.testautomationu.webdriver_automation.pages.login;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ie.murph.testautomationu.webdriver_automation.util.LoggingUtil;

public class SecureArea {
	private static final Logger LOGGER = LoggingUtil.getInstance(); 
	private WebDriver driver;
	private By successfulLoginWelcomeBanner = By.id("flash");
	
	public SecureArea(WebDriver driver) {
		LOGGER.info("++SecureArea(" + driver + " )");
		this.driver = driver;
	}
	
	public String getSuccessfulWelcomeText() {
		LOGGER.info("++getSuccessfulWelcomeText()");
		return driver.findElement(successfulLoginWelcomeBanner).getText();
	}
}
