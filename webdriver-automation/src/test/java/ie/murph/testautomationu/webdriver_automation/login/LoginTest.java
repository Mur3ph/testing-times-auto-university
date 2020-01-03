package ie.murph.testautomationu.webdriver_automation.login;

import ie.murph.testautomationu.webdriver_automation.base.BaseTest;

import ie.murph.testautomationu.webdriver_automation.pages.login.Login;
import ie.murph.testautomationu.webdriver_automation.pages.login.SecureArea;
import ie.murph.testautomationu.webdriver_automation.util.LoggingUtil;
import ie.murph.testautomationu.webdriver_automation.util.Secure;

import static org.testng.Assert.*;

import java.util.logging.Logger;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	private static final Logger LOGGER = LoggingUtil.getInstance(); 
	private Login login;
	private SecureArea secureArea;
	
	@BeforeMethod
	public void formAuthenticationFunctionalityTest() {
		LOGGER.info("++formAuthenticationFunctionalityTest()");
		this.login = home.clickFormAuthenticationLink();
	}
	
	@BeforeMethod
	public void loginFunctionalityTest() {
		LOGGER.info("++loginFunctionalityTest()");
		this.login.setUsernameTextBox(Secure.THE_INTERNET_LOGIN_PAGE_USERNAME.toString());
		this.login.setPasswordTextBox(Secure.THE_INTERNET_LOGIN_PAGE_PASSWORD.toString());
		this.secureArea = this.login.clickLoginButton();
	}
	
	@Test(priority=3)
	public void successfulLoginTest() {
		LOGGER.info("++successfulLoginTest()");
		String expectedResult = "You logged into a secure area!"; 
		assertTrue(this.secureArea.getSuccessfulWelcomeText().contains(expectedResult));
	}

}
