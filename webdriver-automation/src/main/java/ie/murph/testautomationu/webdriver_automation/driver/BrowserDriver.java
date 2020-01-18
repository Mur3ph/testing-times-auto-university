package ie.murph.testautomationu.webdriver_automation.driver;

import java.util.logging.Logger;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ie.murph.testautomationu.webdriver_automation.util.IWebDriverURL;
import ie.murph.testautomationu.webdriver_automation.util.LoggingUtil;

public class BrowserDriver{

	private static final Logger LOGGER = LoggingUtil.getInstance();
	private static WebDriver driver;

//	Trying to extract this class out in many classes and create and factory class
	public BrowserDriver() {}

	public BrowserDriver(Browser browser) {
		LOGGER.info("++BrowserDriver(" + browser + ")");
		switch (browser) {
		case GOOGLE_CHROME:
			setDriverSystemPropertyVariable(Browser.GOOGLE_CHROME);
			instantiateChromeBrowserDriver();
			break;
		case MOZILLA_FIREFOX:
			setDriverSystemPropertyVariable(Browser.MOZILLA_FIREFOX);
			instantiateFireFoxBrowserDriver();
			break;
		case INTERNET_EXPLORER:
			setDriverSystemPropertyVariable(Browser.INTERNET_EXPLORER);
			instantiateInternetExplorerBrowserDriver();
			break;
		default:
			LOGGER.info("BROWSER NOT SUPPORTED");
			break;
		}
	}

	private void setDriverSystemPropertyVariable(Browser browser) {
		LOGGER.info("++setDriverSystemPropertyVariable(" + browser + ")");
		switch (browser) {
		case GOOGLE_CHROME:
			LOGGER.info("++Setting Chrome Driver System Variable Property");
			setChromeDriverGlobalSyetemProperty();
			break;
		case MOZILLA_FIREFOX:
			LOGGER.info("++Setting Firefox Driver System Variable Property");
			setFirefoxDriverGlobalSyetemProperty();
			break;
		case INTERNET_EXPLORER:
			LOGGER.info("++Setting Internet Explorer Driver System Variable Property");
			setInternetExplorerDriverGlobalSyetemProperty();
			break;
		default:
			LOGGER.info("NO DRIVER FOR THIS BROWSER");
			break;
		}
	}

	private void setChromeDriverGlobalSyetemProperty() {
		LOGGER.info("++setChromeDriverGlobalSyetemProperty()");
		// if you didn't update the Path system variable to add the full directory path
		// to the executable as above mentioned then doing this directly through code
		System.setProperty(IWebDriverURL.WEB_DRIVER_PROPERTY_KEY_CHROME, IWebDriverURL.WEB_DRIVER_URL_TO_EXE_VALUE_CHROME);
	}
	
	private void setFirefoxDriverGlobalSyetemProperty() {
		LOGGER.info("++setFirefoxDriverGlobalSyetemProperty()");
		System.setProperty(IWebDriverURL.WEB_DRIVER_PROPERTY_KEY_CHROME, IWebDriverURL.WEB_DRIVER_URL_TO_EXE_VALUE_CHROME);
	}
	
	private void setInternetExplorerDriverGlobalSyetemProperty() {
		LOGGER.info("++setInternetExplorerDriverGlobalSyetemProperty()");
		System.setProperty(IWebDriverURL.WEB_DRIVER_PROPERTY_KEY_CHROME, IWebDriverURL.WEB_DRIVER_URL_TO_EXE_VALUE_CHROME);
	}

	private void instantiateChromeBrowserDriver() {
		LOGGER.info("++instantiateChromeBrowserDriver()");
		driver = new ChromeDriver();
	}

	private void instantiateFireFoxBrowserDriver() {
		LOGGER.info("++instantiateFireFoxBrowserDriver()");
//		driver = new FirefoxDriver();
	}
	
	private void instantiateInternetExplorerBrowserDriver() {
		LOGGER.info("++instantiateFireFoxBrowserDriver()");
//		driver = new InternetExplorerDriver();
	}

	public WebDriver getBrowserDriver() {
		return driver;
	}

	public void setBrowserToMaxSize() {
		LOGGER.info("++setBrowserToMaxSize()");
		driver.manage().window().maximize();
	}

	public void clearBrowserCookies() {
		LOGGER.info("++clearBrowserCookies()");
		driver.manage().deleteAllCookies();
	}

	public void setBrowserToTimeoutInSeconds(int seconds) {
		LOGGER.info("++setBrowserToTimeoutInSeconds(" + seconds + ")");
		driver.manage().timeouts().pageLoadTimeout(seconds, TimeUnit.SECONDS);
	}

	public void setBrowserImpliciteWaitInSeconds(int seconds) {
		LOGGER.info("++setBrowserImpliciteWaitInSeconds(" + seconds + ")");
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}

	public void closeBrowser() {
		LOGGER.info("++closeBrowser()");
		driver.close();
	}

}
