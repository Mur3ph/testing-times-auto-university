package ie.murph.testautomationu.webdriver_automation.pages.alert;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;

import ie.murph.testautomationu.webdriver_automation.util.IText;
import ie.murph.testautomationu.webdriver_automation.util.LoggingUtil;

public class JavaScriptAlert {
	private static final Logger LOGGER = LoggingUtil.getInstance(); 
	private WebDriver driver;

	public JavaScriptAlert(WebDriver driver) {
		LOGGER.info("++JavaScriptAlert( " + driver + " ) " + IText.CONSTRUCTOR);
		this.driver = driver;
	}
	
	
	
}
