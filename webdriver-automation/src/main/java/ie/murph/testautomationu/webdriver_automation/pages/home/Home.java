package ie.murph.testautomationu.webdriver_automation.pages.home;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ie.murph.testautomationu.webdriver_automation.pages.dropdown.Dropdown;
import ie.murph.testautomationu.webdriver_automation.pages.hover.Hover;
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
	
	public Dropdown clickDropdownLink() {
		LOGGER.info("++clickDropdownLink()");
		clickUrl(XPath.HOME_PAGE_DROPDOWN.toString());
		LOGGER.info("--clickDropdownLink()");
		return new Dropdown(this.driver);
	}
	
	public Hover clickHoverLink() {
		LOGGER.info("++clickHoverLink()");
		clickUrl(XPath.HOME_PAGE_HOVER.toString());
		LOGGER.info("--clickDropdownLink()");
		return new Hover(driver);
	}

	private void clickUrl(String url) {
		LOGGER.info("++clickUrl( " + url + " )");
		this.driver.findElement(By.xpath(url)).click();
		LOGGER.info("--clickUrl( " + url + " )");
	}
	
}
