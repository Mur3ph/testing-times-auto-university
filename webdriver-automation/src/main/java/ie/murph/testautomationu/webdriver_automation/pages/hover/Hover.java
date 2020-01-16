package ie.murph.testautomationu.webdriver_automation.pages.hover;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import ie.murph.testautomationu.webdriver_automation.util.IText;
import ie.murph.testautomationu.webdriver_automation.util.LoggingUtil;

public class Hover {
	
	private static final Logger LOGGER = LoggingUtil.getInstance(); 
	private WebDriver driver;
	private By figureByDivFigure = By.className("figure");
	private By figureByDivFigureCaption = By.className("figcaption");
	private WebElement figureElement;
	
	public Hover(WebDriver driver) {
		LOGGER.info("++Hover( " + driver + " ) " + IText.CONSTRUCTOR);
		this.driver = driver;
	}
	
//	Index should start at 1 - last is 3, first element in elements array will start at 1
	public FigureCaption hoverOverFigure(int index) {
		LOGGER.info("++hoverOverFigure( " + index + " ) ");
		this.findFirstElement(index);
		this.moveToImageAction();
		return new FigureCaption(figureElement.findElement(figureByDivFigureCaption));
	}
	
	private void findFirstElement(int index){
		LOGGER.info("++getElement( " + index + " ) ");
		this.figureElement = this.driver.findElements(this.figureByDivFigure).get(index - 1);
	}
	
	private void moveToImageAction() {
		LOGGER.info("++findImageAction() ");
		Actions actions = new Actions(this.driver);
		actions.moveToElement(this.figureElement).perform();
	}

}
