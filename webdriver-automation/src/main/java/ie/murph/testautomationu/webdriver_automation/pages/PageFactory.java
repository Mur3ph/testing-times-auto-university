package ie.murph.testautomationu.webdriver_automation.pages;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;

import ie.murph.testautomationu.webdriver_automation.pages.dropdown.Dropdown;
import ie.murph.testautomationu.webdriver_automation.pages.login.Login;
import ie.murph.testautomationu.webdriver_automation.util.LoggingUtil;
import ie.murph.testautomationu.webdriver_automation.util.XPath;

public class PageFactory {
	private static final Logger LOGGER = LoggingUtil.getInstance();
	private static PageFactory factory = null;

	private PageFactory() {
	}

	/**
	 * Get an instance of the PageFactory
	 * 
	 * @return The singleton PageFactory object
	 */

	public synchronized static PageFactory getInstance() {
		LOGGER.info("++getInstance()");
		if (factory == null) { // first time use..
			factory = new PageFactory();
		}
		LOGGER.info("--getInstance()");
		return factory;
	}

	/**
	 * 
	 * @param gotoPage
	 *            Identifier for the exact Page object required
	 * @return The specific Page object requested
	 */

	public synchronized Page gotoPage(String clickedUrl, WebDriver driver) {
		LOGGER.info("++gotoPage( String clickedUrl: " + clickedUrl + " and web driver: " + driver + " )");
		Page page = null;
		if (clickedUrl.equals(XPath.HOME_PAGE_FORM_AUTHENTICATION.toString())) {
			page = new Login(driver);
		}
		if (clickedUrl.equals(XPath.HOME_PAGE_DROPDOWN.toString())) {
			page = new Dropdown(driver);
		}
		LOGGER.info("--gotoPage( String clickedUrl: " + clickedUrl + " and web driver: " + driver + " )");
		return page;
	}

}
