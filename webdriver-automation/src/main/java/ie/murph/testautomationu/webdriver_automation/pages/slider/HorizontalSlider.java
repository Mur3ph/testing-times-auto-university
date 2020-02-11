package ie.murph.testautomationu.webdriver_automation.pages.slider;

import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import ie.murph.testautomationu.webdriver_automation.util.LoggingUtil;
import ie.murph.testautomationu.webdriver_automation.util.XPath;

public class HorizontalSlider {
	
	private static final Logger LOGGER = LoggingUtil.getInstance(); 
	private WebDriver driver;
	private By labelSliderOutput = By.id("range");
	private By slider = By.xpath(XPath.SLIDER.toString());

	public HorizontalSlider(WebDriver driver) {
		LOGGER.info("++HorizontalSlider( " + driver + " )");
		this.driver = driver;
	}
	
	public void sendArrow() {
		LOGGER.info("++sendArrow()");
		driver.findElement(slider).sendKeys(Keys.chord(arrowRight()));
		LOGGER.info("--sendArrow()");
	}
	
	private Keys arrowRight() {
		LOGGER.info("++arrowRight()");
		return Keys.ARROW_RIGHT;
	}
	
	private char[] multipleArrowRight() {
		LOGGER.info("++multipleArrowRight()");
		char[] arrowArray = new char[8];
		for(int x = 0; x < 8; x++) {
//			arrowArray[x] = Keys.ARROW_RIGHT;
		}
		return arrowArray;
	}
	
	public String getSliderRange() {
		LOGGER.info("++getSliderRange()");
		return driver.findElement(labelSliderOutput).getText();
	}

}
