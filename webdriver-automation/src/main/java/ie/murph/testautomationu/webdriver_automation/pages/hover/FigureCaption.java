package ie.murph.testautomationu.webdriver_automation.pages.hover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FigureCaption {
	
	private WebElement caption;
	private By header = By.tagName("h5");
	private By anchorLink = By.tagName("a");
	
	public FigureCaption(WebElement caption) {
		this.caption = caption;
	}
	
	public boolean isCaptionDisplayed() {
		return caption.isDisplayed();
	}
	
	public String getTitle() {
		return caption.findElement(header).getText();
	}
	
	public String getAnchorUrl() {
		return caption.findElement(anchorLink).getAttribute("href");
	}
	
	public String getAnchorLinkText() {
		return caption.findElement(anchorLink).getText();
	}
}
