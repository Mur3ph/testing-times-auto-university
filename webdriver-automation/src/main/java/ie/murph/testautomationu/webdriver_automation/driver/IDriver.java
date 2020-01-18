package ie.murph.testautomationu.webdriver_automation.driver;

import org.openqa.selenium.WebDriver;

public interface IDriver{
	
	void setBrowserDriverGlobalSyetemProperty();
	WebDriver instantiateBrowserDriver();

}
