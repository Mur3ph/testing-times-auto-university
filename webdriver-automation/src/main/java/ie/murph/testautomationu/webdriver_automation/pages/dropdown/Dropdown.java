package ie.murph.testautomationu.webdriver_automation.pages.dropdown;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ie.murph.testautomationu.webdriver_automation.pages.Page;
import ie.murph.testautomationu.webdriver_automation.util.LoggingUtil;

public class Dropdown extends Page{
	private static final Logger LOGGER = LoggingUtil.getInstance();
	private WebDriver driver;
	private By successfulLoginWelcomeBanner = By.id("dropdown");

	public Dropdown(WebDriver driver) {
		LOGGER.info("++Dropdown(" + driver + " )");
		this.driver = driver;
	}
	
	
}
