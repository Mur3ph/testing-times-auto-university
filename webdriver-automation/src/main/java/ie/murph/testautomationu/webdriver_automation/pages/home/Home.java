package ie.murph.testautomationu.webdriver_automation.pages.home;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ie.murph.testautomationu.webdriver_automation.pages.login.Login;
import ie.murph.testautomationu.webdriver_automation.util.IText;
import ie.murph.testautomationu.webdriver_automation.util.LoggingUtil;
import ie.murph.testautomationu.webdriver_automation.util.XPath;

public class Home{

	private static final Logger LOGGER = LoggingUtil.getInstance(); 
	private WebDriver driver;
	
	public Home(WebDriver driver) {
		LOGGER.info("++Home( " + driver + " ) " + IText.CONSTRUCTOR);
		this.driver = driver;
	}
	
	public Login clickFormAuthenticationLink() {
		LOGGER.info("++clickFormAuthenticationLink()");
		clickUrl(XPath.HOME_PAGE_FORM_AUTHENTICATION.toString());
		LOGGER.info("--clickFormAuthenticationLink()");
		return new Login(this.driver);
	}
	
	public Login clickDropdownLink() {
		LOGGER.info("++clickDropdownLink()");
		clickUrl(XPath.HOME_PAGE_DROPDOWN.toString());
		LOGGER.info("--clickDropdownLink()");
		return new Login(this.driver);
	}

	private void clickUrl(String url) {
		LOGGER.info("++clickUrl( " + url + " )");
		this.driver.findElement(By.xpath(url)).click();
		LOGGER.info("--clickUrl( " + url + " )");
	}
	
}
