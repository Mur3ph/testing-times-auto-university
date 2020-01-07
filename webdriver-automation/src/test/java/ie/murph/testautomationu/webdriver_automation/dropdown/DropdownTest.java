package ie.murph.testautomationu.webdriver_automation.dropdown;


import java.util.logging.Logger;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ie.murph.testautomationu.webdriver_automation.base.BaseTest;
import ie.murph.testautomationu.webdriver_automation.pages.dropdown.Dropdown;
import ie.murph.testautomationu.webdriver_automation.util.LoggingUtil;

public class DropdownTest extends BaseTest{
	private static final Logger LOGGER = LoggingUtil.getInstance(); 
	private Dropdown dropdown;
	
	@BeforeMethod
	public void gotoDropdownPage() {
		LOGGER.info("++gotoDropdownPage()");
		this.dropdown = home.clickDropdownLink();
	}
	
	@BeforeMethod
	public void dropdownFunctionality() {
		LOGGER.info("++dropdownFunctionality()");
	}
	
	@Test(priority=1)
	public void Test() {
		LOGGER.info("++Test()");
	}

}
