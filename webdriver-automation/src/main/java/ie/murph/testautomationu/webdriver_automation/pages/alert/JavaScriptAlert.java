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
	private By javascriptTriggeredAlertButton = By.xpath(XPath.JAVASRIPT_ALERTS_PAGE_JAVASCRIPT_ALERT_BUTTON.toString());
	private By javascriptTriggeredConfirmButton = By.xpath(XPath.JAVASRIPT_ALERTS_PAGE_JAVASCRIPT_CONFIRM_BUTTON.toString());
	private By javascriptTriggeredPromptButton = By.xpath(XPath.JAVASRIPT_ALERTS_PAGE_JAVASCRIPT_PROMPT_BUTTON.toString());
	private By javascriptResultsLabel = By.xpath(XPath.JAVASCRIPT_ALERTS_PAGE_RESULTS_LABEL.toString());

	public JavaScriptAlert(WebDriver driver) {
		LOGGER.info("++JavaScriptAlert( " + driver + " ) " + IText.CONSTRUCTOR);
		this.driver = driver;
	}
	
	public void triggerJavaScriptAlertButton() {
		LOGGER.info("++triggerJavaScriptAlertButton()");
		driver.findElement(javascriptTriggeredAlertButton).click();
	}
	
	public void pressOkayOnJSAlert() {
		LOGGER.info("++pressOkayOnJSAlert()");
		driver.switchTo().alert().accept();
	}
	
	public String getJavaScriptAlertLabelResult() {
		LOGGER.info("++getJavaScriptAlertLabelResult()");
		return driver.findElement(javascriptResultsLabel).getText();
	}
	
	public void triggerJavaScriptConfirmButton() {
		LOGGER.info("++triggerJavaScriptConfirmButton()");
		driver.findElement(javascriptTriggeredConfirmButton).click();
	}
	
	public void pressCancelOnJSConfirm() {
		LOGGER.info("++pressCancelOnJSConfirm()");
		driver.switchTo().alert().dismiss();
	}
	
	public String getJavaScriptConfirmAlertResult() {
		LOGGER.info("++getJavaScriptConfirmAlertResult()");
		return driver.switchTo().alert().getText();
	}
	
	public void triggerJavaScriptPromptButton() {
		LOGGER.info("++triggerJavaScriptPromptButton()");
		driver.findElement(javascriptTriggeredPromptButton).click();
	}
	
	public void sendMessageToPromptAlert(String message) {
		LOGGER.info("++sendMessageToPromptAlert( " + message + " )");
		driver.switchTo().alert().sendKeys(message);
	}
	
	public String getJavaScriptPromptAlertResult() {
		LOGGER.info("++getJavaScriptPromptAlertResult()");
		return driver.switchTo().alert().getText();
	}
}
