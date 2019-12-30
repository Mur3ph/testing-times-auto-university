package ie.murph.testautomationu.webdriver_automation.base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	private WebDriver driver;
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
//		Browser sizes under test
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(375, 812)); // Mobile Devices new Dimension(width, height))
		
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	public static void main(String[] args) {
		BaseTest baseTest = new BaseTest();
		baseTest.setUp();
	}

}
