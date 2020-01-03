package ie.murph.testautomationu.webdriver_automation.login;

import ie.murph.testautomationu.webdriver_automation.driver.ChromeDriverTest;
import ie.murph.testautomationu.webdriver_automation.pages.home.Home;
import ie.murph.testautomationu.webdriver_automation.pages.login.Login;
import ie.murph.testautomationu.webdriver_automation.pages.login.SecureArea;
import ie.murph.testautomationu.webdriver_automation.util.IWebsite;
import ie.murph.testautomationu.webdriver_automation.util.Secure;

public class LoginTest {
	private ChromeDriverTest chromeDriverTest;
	private Home home;
	private Login login;
	private SecureArea secureArea;
	
	public static void main(String[] arguments) {
		LoginTest baseFrameworkTest = new LoginTest();
		baseFrameworkTest.setUp();
		baseFrameworkTest.formAuthenticationFunctionalityTest();
		baseFrameworkTest.loginFunctionalityTest();
		baseFrameworkTest.successfulLoginTest();
	}
	
	private void setUp() {
		chromeDriverTest = new ChromeDriverTest();
		chromeDriverTest.setWebsiteUnderTest(IWebsite.THE_INTERNET);
		this.home = new Home(chromeDriverTest.getChromeDriver());
	}
	
	private void formAuthenticationFunctionalityTest() {
		this.login = this.home.clickFormAuthenticationLink();
	}
	
	private void loginFunctionalityTest() {
		this.login.setUsernameTextBox(Secure.THE_INTERNET_LOGIN_PAGE_USERNAME.toString());
		this.login.setPasswordTextBox(Secure.THE_INTERNET_LOGIN_PAGE_PASSWORD.toString());
		this.secureArea = this.login.clickLoginButton();
	}
	
	private void successfulLoginTest() {
		this.secureArea.getSuccessfulWelcomeText();
	}

}
