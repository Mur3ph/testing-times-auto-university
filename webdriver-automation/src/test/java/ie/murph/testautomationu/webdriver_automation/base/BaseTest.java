package ie.murph.testautomationu.webdriver_automation.base;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ie.murph.testautomationu.webdriver_automation.util.XPath;

public class BaseTest {
	
	private WebDriver driver;
	private List<WebElement> listOfWebElements;
	
	public BaseTest() {
		listOfWebElements = new ArrayList<WebElement>();
	}
	
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
//		setBrowserSize();
//		searchingForMulipleElements();
//		searchingForAnElement();
//		System.out.println(driver.getTitle());
		
		clickShiftingContentLink();
		clickMenuElementLink();
		countNumberOfMenuButtons();
		
		Thread.sleep(3000);
		driver.quit();
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
	
	public void extraExercise() {
		clickShiftingContentLink();
		clickMenuElementLink();
		countNumberOfMenuButtons();
	}

	private void clickShiftingContentLink() {
		WebElement shiftingContentLink = driver.findElement(By.xpath(XPath.SHIFTING_CONTENT_ANCHOR_BY_HREF.toString()));
		shiftingContentLink.click();
	}
	
	private void clickMenuElementLink() {
		WebElement menuElementLink = driver.findElement(By.xpath(XPath.MENU_ELEMENT_ANCHOR.toString()));
		menuElementLink.click();
	}
	
	private void countNumberOfMenuButtons() {
		listOfWebElements = driver.findElements(By.xpath(XPath.LIST_OF_ANCHOR_TAGS_ONLY_IN_MENU.toString()));
		System.out.println("Number of Anchor tags, only on Menu buttons: " + listOfWebElements.size());
	}

	public static void main(String[] args) throws InterruptedException {
		BaseTest baseTest = new BaseTest();
		baseTest.setUp();
	}

}
