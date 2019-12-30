package ie.murph.testautomationu.webdriver_automation.base;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	private WebDriver driver;
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
//		setBrowserSize(driver);
		
		WebElement tagNameInputs = driver.findElement(By.tagName("Inputs"));
		tagNameInputs.click();
		WebElement noSuchElementException = driver.findElement(By.tagName("Pauly Murphy"));
		noSuchElementException.click();
		
		List<WebElement> listOfAnchorWebElements = driver.findElements(By.tagName("a"));
		System.out.println("Number of Anchor tags: " + listOfAnchorWebElements.size());
		
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	private void setBrowserSize(WebDriver driver) {
//		Browser sizes under test
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(375, 812)); // Mobile Devices new Dimension(width, height))
	}

	public static void main(String[] args) {
		BaseTest baseTest = new BaseTest();
		baseTest.setUp();
	}

}
