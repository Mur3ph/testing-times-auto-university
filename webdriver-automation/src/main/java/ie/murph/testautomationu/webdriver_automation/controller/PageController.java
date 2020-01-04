package ie.murph.testautomationu.webdriver_automation.controller;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;

import ie.murph.testautomationu.webdriver_automation.pages.Page;
import ie.murph.testautomationu.webdriver_automation.pages.PageFactory;
import ie.murph.testautomationu.webdriver_automation.util.LoggingUtil;

public class PageController{
	private static final Logger LOGGER = LoggingUtil.getInstance(); 
	
	public void gotoUrl(String url, WebDriver driver) {
		LOGGER.info("++gotoUrl( " + url + " )");
		processUrl(url, driver);
		LOGGER.info("--gotoUrl( " + url + " )");
	}
	
	private void processUrl(String url, WebDriver driver) {
		LOGGER.info("++processUrl( " + url + " )");
		PageFactory factory = PageFactory.getInstance();
		Page page = factory.gotoPage(url, driver);
		page.clickUrl(url);
		LOGGER.info("--processUrl( " + url + " )");
	}

}
