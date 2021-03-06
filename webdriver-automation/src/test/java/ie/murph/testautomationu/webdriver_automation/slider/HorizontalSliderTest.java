package ie.murph.testautomationu.webdriver_automation.slider;

import static org.testng.Assert.assertEquals;

import java.util.logging.Logger;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ie.murph.testautomationu.webdriver_automation.base.BaseTest;
import ie.murph.testautomationu.webdriver_automation.pages.slider.HorizontalSlider;
import ie.murph.testautomationu.webdriver_automation.util.LoggingUtil;

public class HorizontalSliderTest extends BaseTest {

	private static final Logger LOGGER = LoggingUtil.getInstance();
	private HorizontalSlider horizontalSlider;
	private String value = "4";

	@BeforeClass
	public void gotoHorizontalSliderPage() {
		LOGGER.info("++gotoHorizontalSliderPage()");
		this.horizontalSlider = home.clickHorizontalSliderLink();
	}

	@BeforeMethod
	public void pushSlider() {
		LOGGER.info("++pushSlider()");
	}

	@Test(priority = 1, groups = { "smoke" })
	public void sliderTest() {
		LOGGER.info("++sliderTest()");
		this.horizontalSlider.sendArrow();
		assertEquals(this.horizontalSlider.getSliderRange(), value, "Slider value is incorrect Pauly");
		this.horizontalSlider.setSliderValueToZero();
	}
	
	@Test(priority = 2, groups = { "smoke" })
	public void sliderZeroResetTest() {
		LOGGER.info("++sliderZeroResetTest()");
		this.horizontalSlider.setSliderValueToZero();
	}

	@Test(priority = 3, dependsOnMethods = "sliderZeroResetTest")
	public void testSlideToWholeNumber() {
		LOGGER.info("++testSlideToWholeNumber()");
		this.horizontalSlider.setSliderValue(value);
		assertEquals(this.horizontalSlider.getSliderRange(), value, "Slider value is incorrect Angie");
	}

}
