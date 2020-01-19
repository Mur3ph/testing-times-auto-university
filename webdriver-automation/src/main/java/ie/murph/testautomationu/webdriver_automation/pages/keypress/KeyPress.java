package ie.murph.testautomationu.webdriver_automation.pages.keypress;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPress {
	
	private WebDriver driver;
	private By inputField = By.id("target");
	private By labelResultFromInputField = By.id("result");
	
	public KeyPress(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterPi() {
		enterText(Keys.chord(getPiAsciiCodeWindows()) + "=3.14");
	}
	
	public void enterText(String text) {
		driver.findElement(inputField).sendKeys(text);
	}
	
	public String getPiAsciiCodeWindows() {
		return Keys.ALT + "227";
	}
	
	public String getLabel() {
		return driver.findElement(labelResultFromInputField).getText();
	}

}
