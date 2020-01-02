package ie.murph.testautomationu.webdriver_automation.base;

import ie.murph.testautomationu.webdriver_automation.driver.ChromeDriverTest;
import ie.murph.testautomationu.webdriver_automation.pages.home.Home;

public class BaseFrameworkTest {
	private Home home;
	
	public static void main(String[] arguments) {
		BaseFrameworkTest baseFrameworkTest = new BaseFrameworkTest();
		baseFrameworkTest.setUp();
		baseFrameworkTest.formAuthenticationFunctionality();
	}
	
	private void setUp() {
		this.home = new Home(new ChromeDriverTest().getChromeDriver());
	}
	
	private void formAuthenticationFunctionality() {
		this.home.run();
	}

}
