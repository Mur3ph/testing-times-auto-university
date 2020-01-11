package ie.murph.testautomationu.webdriver_automation.dropdown;


import java.util.List;
import java.util.logging.Logger;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

import ie.murph.testautomationu.webdriver_automation.base.BaseTest;
import ie.murph.testautomationu.webdriver_automation.pages.dropdown.Dropdown;
import ie.murph.testautomationu.webdriver_automation.util.IText;
import ie.murph.testautomationu.webdriver_automation.util.LoggingUtil;

public class DropdownTest extends BaseTest{
	private static final Logger LOGGER = LoggingUtil.getInstance(); 
	private Dropdown dropdown;
	private List<String> selectedOptionsFromDropdown;
	
	@BeforeMethod
	public void gotoDropdownPage() {
		LOGGER.info("++gotoDropdownPage()");
		this.dropdown = home.clickDropdownLink();
	}
	
	@BeforeMethod(dependsOnMethods= { "gotoDropdownPage" })
	public void selectOptionFromDropdownList() {
		LOGGER.info("++selectOptionFromDropdownList()");
		this.dropdown.selectFromDropdownList(IText.DROPDOWN_PAGE_OPTION_1);
	}
	
	@BeforeMethod(dependsOnMethods= { "selectOptionFromDropdownList" })
	public void getSelectedOptionFromDropdownList() {
		LOGGER.info("++getSelectedOptionFromDropdownList()");
		this.selectedOptionsFromDropdown = this.dropdown.getAllSelectedOptionsFromDropdown();
	}
	
	@Test(priority=1)
	public void isSelectedOptionTest() {
		LOGGER.info("++isSelectedOptionTest()");
		assertEquals(this.selectedOptionsFromDropdown.size(), 1, "Incorrect number of selected options from dropdown list");
		assertTrue(this.selectedOptionsFromDropdown.contains(IText.DROPDOWN_PAGE_OPTION_1), IText.DROPDOWN_PAGE_OPTION_1 + " not selected");
	}
	
//	@Test(priority=2)
//	public void selectedOptionTest() {
//		LOGGER.info("++selectedOptionTest()");
//		assertTrue(this.selectedOptionsFromDropdown.contains(OPTION_1), OPTION_1 + " not selected");
//	}

}
