package ie.murph.testautomationu.webdriver_automation.driver;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;

import ie.murph.testautomationu.webdriver_automation.util.LoggingUtil;

public enum BrowserDriverFactoryEnum {

	INSTANCE;
	private static final Logger LOGGER = LoggingUtil.getInstance();

	public synchronized WebDriver createBrowserDriver(Browser browser) {
		IDriver iDriver;

		LOGGER.info("++createBrowserDriver(" + browser + ")");
		switch (browser) {
		case GOOGLE_CHROME:
//			iDriver = new ChromeDriverTest();
//			iDriver.setBrowserDriverGlobalSyetemProperty();
//			iDriver.instantiateBrowserDriver();
			break;
		case MOZILLA_FIREFOX:
//			iDriver = new FirefoxBrowserDriver();
//			iDriver.setBrowserDriverGlobalSyetemProperty();
//			iDriver.instantiateBrowserDriver();
			break;
		case INTERNET_EXPLORER:
//			iDriver = new InternetExplorerBrowserDriver();
//			iDriver.setBrowserDriverGlobalSyetemProperty();
//			iDriver.instantiateBrowserDriver();
			break;
		default:
			LOGGER.info("BROWSER NOT SUPPORTED");
			break;
		}
		return null;
	}

}
