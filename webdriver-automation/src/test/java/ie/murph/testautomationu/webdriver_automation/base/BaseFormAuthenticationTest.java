package ie.murph.testautomationu.webdriver_automation.base;

import ie.murph.testautomationu.webdriver_automation.driver.ChromeDriverTest;
import ie.murph.testautomationu.webdriver_automation.pages.home.Home;
import ie.murph.testautomationu.webdriver_automation.pages.login.Login;
import ie.murph.testautomationu.webdriver_automation.util.IWebsite;
import ie.murph.testautomationu.webdriver_automation.util.Secure;

public class BaseFormAuthenticationTest {
	private ChromeDriverTest chromeDriverTest;
	private Home home;
	private Login login;
	
	public static void main(String[] arguments) {
		BaseFormAuthenticationTest baseFrameworkTest = new BaseFormAuthenticationTest();
		baseFrameworkTest.setUp();
		baseFrameworkTest.formAuthenticationFunctionality();
		baseFrameworkTest.loginFunctionality();
	}
	
	private void setUp() {
		chromeDriverTest = new ChromeDriverTest();
		chromeDriverTest.setWebsiteUnderTest(IWebsite.THE_INTERNET);
		this.home = new Home(chromeDriverTest.getChromeDriver());
	}
	
	private void formAuthenticationFunctionality() {
		this.login = this.home.clickFormAuthenticationLink();
	}
	
	private void loginFunctionality() {
		this.login.setUsernameTextBox(Secure.THE_INTERNET_LOGIN_PAGE_USERNAME.toString());
		this.login.setPasswordTextBox(Secure.THE_INTERNET_LOGIN_PAGE_PASSWORD.toString());
		this.login.clickLoginButton();
	}

}
