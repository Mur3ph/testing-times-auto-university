package ie.murph.testautomationu.webdriver_automation.keypress;

import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ie.murph.testautomationu.webdriver_automation.base.BaseTest;
import ie.murph.testautomationu.webdriver_automation.pages.keypress.KeyPress;

import static org.testng.Assert.*;

public class KeyPressTest extends BaseTest{
	
	private KeyPress keyPress;
	
	@BeforeClass
	public void gotoKeyPressPage() {
//		LOGGER.info("++gotoKeyPressPage()");
		this.keyPress = home.clickKeyPressesLink();
	}
	
	@BeforeMethod
	public void sendTextToKeyPressInputBox() {
//		LOGGER.info("++sendTextToKeyPressInputBox()");
	}
	
	@Test(priority=1)
	public void backSpaceTest() {
		this.keyPress.enterText("A" + Keys.BACK_SPACE);
		assertEquals(this.keyPress.getLabel(), "You entered: BACK_SPACE");
	}
	
	@Test(priority=2)
	public void pieTest() {
		this.keyPress.enterPi();
//		assertEquals(this.keyPress.getLabel(), "You entered: BACK_SPACE");
	}

}
