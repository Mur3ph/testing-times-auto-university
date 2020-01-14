package ie.murph.testautomationu.webdriver_automation.pages.hover;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ie.murph.testautomationu.webdriver_automation.util.LoggingUtil;

public class FigureCaption {
	private static final Logger LOGGER = LoggingUtil.getInstance(); 
	private WebElement caption;
	private By header = By.tagName("h5");
	private By anchorLink = By.tagName("a");
	
	public FigureCaption(WebElement caption) {
		LOGGER.info("++FigureCaption( " + caption + " ) ");
		this.caption = caption;
	}
	
	public boolean isCaptionDisplayed() {
		LOGGER.info("++isCaptionDisplayed()");
		return caption.isDisplayed();
	}
	
	public String getTitle() {
		LOGGER.info("++getTitle()");
		return caption.findElement(header).getText();
	}
	
	public String getAnchorUrl() {
		LOGGER.info("++getAnchorUrl()");
		return caption.findElement(anchorLink).getAttribute("href");
	}
	
	public String getAnchorLinkText() {
		LOGGER.info("++getAnchorLinkText()");
		return caption.findElement(anchorLink).getText();
	}
}
