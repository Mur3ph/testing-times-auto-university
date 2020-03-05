package ie.murph.testautomationu.webdriver_automation.alert;

import static org.testng.Assert.assertEquals;

import java.util.logging.Logger;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ie.murph.testautomationu.webdriver_automation.base.BaseTest;
import ie.murph.testautomationu.webdriver_automation.pages.alert.JavaScriptAlert;
import ie.murph.testautomationu.webdriver_automation.util.LoggingUtil;

public class JavaScriptAlertTest extends BaseTest{
	private static final Logger LOGGER = LoggingUtil.getInstance();
	private JavaScriptAlert javaScriptAlert;
	private final String labelValue = "You successfuly clicked an alert";
	private final String alertConfirmExpectedText = "I am a JS Confirm";
	private final String labelPromptMessage = "Prompt message";
	private final String labelValueIsIncorrect = "Label value is incorrect";

	@BeforeClass
	public void gotoJavaScriptAlertsPage() {
		LOGGER.info("++gotoJavaScriptAlertsPage()");
		this.javaScriptAlert = home.clickJavaScriptAlertLink();
	}
	
	@Test(priority = 1, groups = { "ui" })
	public void javascriptAlertTest() {
		LOGGER.info("++javascriptAlertTest()");
		this.javaScriptAlert.triggerJavaScriptAlertButton();
		this.javaScriptAlert.pressOkayOnJSAlert();
		assertEquals(this.javaScriptAlert.getJavaScriptLabelResult(), this.labelValue, this.labelValueIsIncorrect);
	}
	
	@Test(priority = 2, groups = { "ui" })
	public void javascriptConfrimTest() {
		LOGGER.info("++javascriptConfrimTest()");
		this.javaScriptAlert.triggerJavaScriptConfirmButton();
		String alertConfirmActualText = this.javaScriptAlert.getJavaScriptConfirmAlertResult();
		this.javaScriptAlert.pressCancelOnJSConfirm();
		assertEquals(alertConfirmActualText, this.alertConfirmExpectedText, this.labelValueIsIncorrect);
	}
	
	@Test(priority = 3, groups = { "ui" })
	public void javascriptPromptTest() {
		LOGGER.info("++javascriptPromptTest()");
		this.javaScriptAlert.triggerJavaScriptPromptButton();
		this.javaScriptAlert.sendMessageToPromptAlert(labelPromptMessage);
		this.javaScriptAlert.pressOkayOnJSPromptAlert();
		assertEquals(this.javaScriptAlert.getJavaScriptLabelResult(), "You entered: " + this.labelPromptMessage, "Label prompt is incorrect");
	}
	
}
