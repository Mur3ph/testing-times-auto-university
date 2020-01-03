package ie.murph.testautomationu.webdriver_automation.base;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ie.murph.testautomationu.webdriver_automation.driver.ChromeDriverTest;
import ie.murph.testautomationu.webdriver_automation.util.LoggingUtil;

public class RandomTest {
	private static final Logger LOGGER = LoggingUtil.getInstance(); 
	private WebDriver driver;
	private List<WebElement> listOfWebElements;
	
	public RandomTest() {
		listOfWebElements = new ArrayList<WebElement>();
	}
	
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriverTest().getChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		searchingForMulipleElements();
		searchingForAnElement();
		searchingForNoSuchElementException();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		driver.quit();
	}
	
	public void searchingForMulipleElements() {
		listOfWebElements = driver.findElements(By.tagName("a"));
		System.out.println("Number of Anchor tags: " + listOfWebElements.size());
	}

	public void searchingForAnElement() {
		WebElement tagNameInputs = driver.findElement(By.linkText("Inputs"));
		tagNameInputs.click();
	}
	
	public void searchingForNoSuchElementException() {
		try
		{
			WebElement noSuchElementException = driver.findElement(By.tagName("Pauly Murphy"));
			noSuchElementException.click();
		}
		catch(NoSuchElementException e) 
		{ 
			LOGGER.info("Exception toString(): " + e.toString());
			LOGGER.info("Exception getMessage(): " + e.getMessage());
			LOGGER.info("Exception  getLocalizedMessage(): " + e.getLocalizedMessage());
			LOGGER.info("Exception getAdditionalInformation(): " + e.getAdditionalInformation());
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		RandomTest baseTest = new RandomTest();
		baseTest.setUp();
		
//		new NavigationTest().setup();
	}
	
}
