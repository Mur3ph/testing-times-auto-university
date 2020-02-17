package ie.murph.testautomationu.webdriver_automation.pages.alert;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ie.murph.testautomationu.webdriver_automation.util.IText;
import ie.murph.testautomationu.webdriver_automation.util.LoggingUtil;
import ie.murph.testautomationu.webdriver_automation.util.XPath;

public class JavaScriptAlert {
	private static final Logger LOGGER = LoggingUtil.getInstance(); 
	private WebDriver driver;
	private By javascriptTriggeredAlertButton = By.xpath(XPath.JAVASRIPT_ALERTS_PAGE_JAVASCRIPT_BUTTON.toString());

	public JavaScriptAlert(WebDriver driver) {
		LOGGER.info("++JavaScriptAlert( " + driver + " ) " + IText.CONSTRUCTOR);
		this.driver = driver;
	}
	
	public void triggerJavaScriptAlertButton() {
		LOGGER.info("++triggerJavaScriptAlertButton()");
		driver.findElement(javascriptTriggeredAlertButton).click();
	}
	
	
}
