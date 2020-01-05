package ie.murph.testautomationu.webdriver_automation.pages.dropdown;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import ie.murph.testautomationu.webdriver_automation.pages.Page;
import ie.murph.testautomationu.webdriver_automation.util.LoggingUtil;

public class Dropdown extends Page{
	private static final Logger LOGGER = LoggingUtil.getInstance();
	private WebDriver driver;
	private By dropdown = By.id("dropdown");

	public Dropdown(WebDriver driver) {
		LOGGER.info("++Dropdown(" + driver + " )");
		this.driver = driver;
	}
	
	public void selectFromDropdownList(String option) {
		findDropdownElement().selectByVisibleText(option);
	}
	
	public List<String> getAllSelectedOptionsFromDropdown() {
		List<WebElement> listOfSelectedElements = findDropdownElement().getAllSelectedOptions();
		return listOfSelectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
	}
	
	private Select findDropdownElement() {
		return new Select(driver.findElement(dropdown));
	}
}
