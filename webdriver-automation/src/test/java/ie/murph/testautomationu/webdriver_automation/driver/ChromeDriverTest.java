package ie.murph.testautomationu.webdriver_automation.driver;

import java.util.logging.Logger;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ie.murph.testautomationu.webdriver_automation.util.IWebDriverURL;
import ie.murph.testautomationu.webdriver_automation.util.LoggingUtil;

public class ChromeDriverTest {
	private static final Logger LOGGER = LoggingUtil.getInstance(); 
	private WebDriver driver;
	
	public ChromeDriverTest() {
		LOGGER.info("++ChromeDriverTest() Constructor");
		System.setProperty(IWebDriverURL.WEB_DRIVER_PROPERTY_KEY_CHROME, IWebDriverURL.WEB_DRIVER_URL_TO_EXE_VALUE_CHROME);
		driver = new ChromeDriver();
	}
	
	public WebDriver getChromeDriver() {
		LOGGER.info("++getChromeDriver()");
		return driver;
	}
	
	public void setBrowserSizeToFullScreen() {
		LOGGER.info("++setBrowserSizeToFullScreen()");
		driver.manage().window().fullscreen();
	}
	
	public void setBrowserSizeToMaximize() {
		LOGGER.info("++setBrowserSizeToFullScreen()");
		driver.manage().window().maximize();
	}
	
	public void setBrowserSizeToMaximize(int width, int height) {
		LOGGER.info("++setBrowserSizeToMaximize( " + width + " " + height + " )");
		driver.manage().window().setSize(new Dimension(width, height)); // Mobile Devices new Dimension(width, height))
	}
	
	public void setWebsiteUnderTest(String url) {
		LOGGER.info("++visitWebsiteUnderTest()");
		this.driver.get(url);
	}
	
	public void shutBrowser() {
		LOGGER.info("++shutBrowser()");
		this.driver.quit();
	}

	public void delayBrowserClosingBy3Seconds() {
		LOGGER.info("++delayBrowserClosing()");
		try 
		{
			Thread.sleep(3000);
		} 
			catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		LOGGER.info("--delayBrowserClosing()");
	}
	
}
