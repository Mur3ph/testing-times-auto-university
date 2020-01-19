package ie.murph.testautomationu.webdriver_automation.pages.keypress;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import ie.murph.testautomationu.webdriver_automation.util.LoggingUtil;

public class KeyPress {
	private static final Logger LOGGER = LoggingUtil.getInstance(); 
	private WebDriver driver;
	private By inputField = By.id("target");
	private By labelResultFromInputField = By.id("result");
	
	public KeyPress(WebDriver driver) {
		LOGGER.info("++KeyPress( " + driver + " )");
		this.driver = driver;
	}
	
	public void enterPi() {
		LOGGER.info("++enterPi()");
		enterText(Keys.chord(getPiAsciiCodeWindows()) + "=3.14");
		LOGGER.info("--enterPi( " + Keys.chord(getPiAsciiCodeWindows()) + "=3.14 )");
	}
	
	public void enterText(String text) {
		LOGGER.info("++enterText( " + text + " )");
		driver.findElement(inputField).sendKeys(text);
	}
	
	public String getPiAsciiCodeWindows() {
		LOGGER.info("++getPiAsciiCodeWindows()");
		return Keys.ALT + "227";
	}
	
	public String getLabel() {
		LOGGER.info("++getLabel()");
		return driver.findElement(labelResultFromInputField).getText();
	}

}
