package ie.murph.testautomationu.webdriver_automation.pages.hover;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;

import ie.murph.testautomationu.webdriver_automation.util.IText;
import ie.murph.testautomationu.webdriver_automation.util.LoggingUtil;

public class Hover {
	
	private static final Logger LOGGER = LoggingUtil.getInstance(); 
	private WebDriver driver;
	
	public Hover(WebDriver driver) {
		LOGGER.info("++Hover( " + driver + " ) " + IText.CONSTRUCTOR);
		this.driver = driver;
	}

}
