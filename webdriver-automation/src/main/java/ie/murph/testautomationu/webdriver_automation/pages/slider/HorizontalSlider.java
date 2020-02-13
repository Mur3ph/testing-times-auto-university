package ie.murph.testautomationu.webdriver_automation.pages.slider;

import java.util.ArrayList;
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
	private List<Keys> listOfArrowRightKeyStrokes;

	public HorizontalSlider(WebDriver driver) {
		LOGGER.info("++HorizontalSlider( " + driver + " )");
		this.driver = driver;
		this.listOfArrowRightKeyStrokes = new ArrayList<>();
	}
	
	public void sendArrow() {
		LOGGER.info("++sendArrow()");
		addMultipleArrowRightKeysToList();
		for(int i=0;i<=getListOfArrowKeys().size()-1;i++)
        {
            driver.findElement(slider).sendKeys(getListOfArrowKeys().get(i));
        }
		LOGGER.info("--sendArrow()");
	}
	
	private void addMultipleArrowRightKeysToList() {
		LOGGER.info("++addMultipleArrowRightKeysToList()");
		for(int i = 0; i <= 7; i++) {
			this.listOfArrowRightKeyStrokes.add(arrowRight());
		}
	}
	
	private Keys arrowRight() {
		LOGGER.info("++arrowRight()");
		return Keys.ARROW_RIGHT;
	}
	
	private List<Keys> getListOfArrowKeys(){
		LOGGER.info("++getListOfArrowKeys()");
		return this.listOfArrowRightKeyStrokes;
	}
	
	public String getSliderRange() {
		LOGGER.info("++getSliderRange()");
		return driver.findElement(labelSliderOutput).getText();
	}
	
	public void setSliderValue(String value){
		LOGGER.info("++setSliderValue( " + value + " )");
        while(!getSliderValue().equals(value)){
            driver.findElement(slider).sendKeys(arrowRight());
        }
    }

    public String getSliderValue(){
    	LOGGER.info("++getSliderValue()");
        return driver.findElement(labelSliderOutput).getText();
    }
    
    public void setSliderValueToZero(){
		LOGGER.info("++setSliderValueToZero()");
        while(!getSliderValue().equals("0")){
            driver.findElement(slider).sendKeys(Keys.ARROW_LEFT);
        }
    }

}
