package ie.murph.testautomationu.webdriver_automation.pages.slider;

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
		for (int i = 0; i <= 7; i++) {
			driver.findElement(slider).sendKeys(pressArrowRightKeyStroke());
		}
		LOGGER.info("--sendArrow()");
	}

	public void setSliderValue(String value) {
		LOGGER.info("++setSliderValue( " + value + " )");
		while (!getSliderRange().equals(value)) {
			driver.findElement(slider).sendKeys(pressArrowRightKeyStroke());
		}
	}
	
	private Keys pressArrowRightKeyStroke() {
		LOGGER.info("++pressArrowRightKeyStroke()");
		return Keys.ARROW_RIGHT;
	}

	public void setSliderValueToZero() {
		LOGGER.info("++setSliderValueToZero()");
		while (!getSliderRange().equals("0")) {
			driver.findElement(slider).sendKeys(pressArrowLeftKeyStroke());
		}
	}
	
	private Keys pressArrowLeftKeyStroke() {
		LOGGER.info("++pressArrowLeftKeyStroke()");
		return Keys.ARROW_LEFT;
	}

	public String getSliderRange() {
		LOGGER.info("++getSliderRange()");
		return driver.findElement(labelSliderOutput).getText();
	}

}
