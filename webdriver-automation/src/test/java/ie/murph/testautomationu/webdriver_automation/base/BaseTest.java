package ie.murph.testautomationu.webdriver_automation.base;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseTest {
	
	private WebDriver driver;
	private List<WebElement> listOfWebElements;
	
	public BaseTest() {
		listOfWebElements = new ArrayList<WebElement>();
	}
	
	public void setUp() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//		driver = new ChromeDriverTest().getChromeDriver();
//		driver.get("https://the-internet.herokuapp.com/");
		
//		setBrowserSize();
//		searchingForMulipleElements();
//		searchingForAnElement();
//		System.out.println(driver.getTitle());
		
		new NavigationTest().setup();
		
//		Thread.sleep(3000);
//		driver.quit();
	}
	
	public void setBrowserSize() {
//		Browser sizes under test
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(375, 812)); // Mobile Devices new Dimension(width, height))
	}
	
	public void searchingForMulipleElements() {
		listOfWebElements = driver.findElements(By.tagName("a"));
		System.out.println("Number of Anchor tags: " + listOfWebElements.size());
	}

	public void searchingForAnElement() {
		WebElement tagNameInputs = driver.findElement(By.linkText("Inputs"));
		tagNameInputs.click();
//		WebElement noSuchElementException = driver.findElement(By.tagName("Pauly Murphy"));
//		noSuchElementException.click();
	}
	
	public static void main(String[] args) throws InterruptedException {
		BaseTest baseTest = new BaseTest();
		baseTest.setUp();
	}
	
}
