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
	private String labelValue = "You successfuly clicked an alert";
	private String alertConfirmExpectedText = "I am a JS Confirm";
	private String alertConfirmActualText;

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
		assertEquals(this.javaScriptAlert.getJavaScriptAlertLabelResult(), labelValue, "Label value is incorrect");
	}
	
	@Test(priority = 2, groups = { "ui" })
	public void javascriptConfrimTest() {
		LOGGER.info("++javascriptConfrimTest()");
		this.javaScriptAlert.triggerJavaScriptConfirmButton();
		this.alertConfirmActualText = this.javaScriptAlert.getJavaScriptConfirmAlertResult();
		this.javaScriptAlert.pressCancelOnJSConfirm();
		assertEquals(this.alertConfirmActualText, alertConfirmExpectedText, "Label value is incorrect");
	}
	
}
