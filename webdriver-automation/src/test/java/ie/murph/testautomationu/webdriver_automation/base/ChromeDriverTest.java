package ie.murph.testautomationu.webdriver_automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ie.murph.testautomationu.webdriver_automation.util.IWebDriverURL;

public class ChromeDriverTest {
	
	private WebDriver driver;
	
	public ChromeDriverTest() {
		System.setProperty(IWebDriverURL.WEB_DRIVER_PROPERTY_KEY_CHROME, IWebDriverURL.WEB_DRIVER_URL_TO_EXE_VALUE_CHROME);
		driver = new ChromeDriver();
	}
	
	public WebDriver getChromeDriver() {
		return driver;
	}
	
}
