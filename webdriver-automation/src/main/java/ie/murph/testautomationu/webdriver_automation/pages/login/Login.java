package ie.murph.testautomationu.webdriver_automation.pages.login;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ie.murph.testautomationu.webdriver_automation.util.CSS;
import ie.murph.testautomationu.webdriver_automation.util.IText;
import ie.murph.testautomationu.webdriver_automation.util.Id;
import ie.murph.testautomationu.webdriver_automation.util.LoggingUtil;

public class Login {
	private static final Logger LOGGER = LoggingUtil.getInstance(); 
	private WebDriver driver;
	private By usernameTextBox = By.id(Id.LOGIN_PAGE_USERNAME.toString());
	private By passwordTextBox = By.id(Id.LOGIN_PAGE_PASSWORD.toString());
	private By loginButton = By.cssSelector(CSS.LOGIN_PAGE_LOGIN_BUTTON.toString());
	
	public Login(WebDriver driver) {
		LOGGER.info("++Login( " + driver + " ) " + IText.CONSTRUCTOR);
		this.driver = driver;
	}
	
	public void setUsernameTextBox(String username) {
		LOGGER.info("++setUsernameTextBox( " + username + " )");
		driver.findElement(usernameTextBox).sendKeys(username); 
	}
	
	public void setPasswordTextBox(String password) {
		LOGGER.info("++setPasswordTextBox( " + password + " )");
		driver.findElement(passwordTextBox).sendKeys(password); 
	}
	
	public SecureArea clickLoginButton() {
		LOGGER.info("++clickLoginButton()");
		driver.findElement(loginButton).click();
		return new SecureArea(driver);
	}
}
