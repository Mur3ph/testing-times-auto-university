package ie.murph.testautomationu.webdriver_automation.dropdown;


import java.util.List;
import java.util.logging.Logger;

import org.testng.annotations.BeforeClass;
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
	
	@BeforeClass
	public void gotoDropdownPage() {
		LOGGER.info("++gotoDropdownPage()");
		this.dropdown = home.clickDropdownLink();
	}
	
	@BeforeMethod  // (dependsOnMethods= { "gotoDropdownPage" })
	public void selectOptionFromDropdownList() {
		LOGGER.info("++selectOptionFromDropdownList()");
		this.dropdown.selectFromDropdownList(IText.DROPDOWN_PAGE_OPTION_1);
	}
	
	@BeforeMethod(dependsOnMethods= { "selectOptionFromDropdownList" })
	public void getSelectedOptionFromDropdownList() {
		LOGGER.info("++getSelectedOptionFromDropdownList()");
		this.selectedOptionsFromDropdown = this.dropdown.getAllSelectedOptionsFromDropdown();
	}
	
	@Test(priority=1, groups= {"regression", "integration", "defect.fix"}, dependsOnGroups= {})
	public void isSelectedOptionTest() {
		LOGGER.info("++isSelectedOptionTest()");
		assertEquals(this.selectedOptionsFromDropdown.size(), 1, IText.ASSERT_MESSAGE_INCORRECT_NUMBER_OF_SELECTED_OPTIONS);
	}
	
	@Test(priority=2, groups= {"smoke", "system", "defect.progress"}, dependsOnGroups= {})
	public void selectedOptionTest() {
		LOGGER.info("++selectedOptionTest()");
		assertTrue(this.selectedOptionsFromDropdown.contains(IText.DROPDOWN_PAGE_OPTION_1), IText.DROPDOWN_PAGE_OPTION_1 + IText.ASSERT_MESSAGE_IS_SELECT);
	}

}
