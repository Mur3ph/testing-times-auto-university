package ie.murph.testautomationu.webdriver_automation.pages.login;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ie.murph.testautomationu.webdriver_automation.util.LoggingUtil;

public class Login {
	private static final Logger LOGGER = LoggingUtil.getInstance(); 
	private WebDriver driver;
	private By usernameTextBox = By.id("username");
	private By passwordTextBox = By.id("password");
	private By loginButton = By.cssSelector("#login button");
	
	public Login(WebDriver driver) {
		LOGGER.info("++Login( " + driver + " ) Constructor: Declaring Chrome Web Driver and setting website URL");
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
	
	public void clickLoginButton() {
		LOGGER.info("++clickLoginButton()");
		driver.findElement(loginButton).click();
	}
}
