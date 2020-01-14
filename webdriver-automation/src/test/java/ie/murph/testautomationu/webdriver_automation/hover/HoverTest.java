package ie.murph.testautomationu.webdriver_automation.hover;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ie.murph.testautomationu.webdriver_automation.base.BaseTest;
import ie.murph.testautomationu.webdriver_automation.pages.hover.FigureCaption;
import ie.murph.testautomationu.webdriver_automation.pages.hover.Hover;
import ie.murph.testautomationu.webdriver_automation.util.LoggingUtil;

import static org.testng.Assert.*;

import java.util.logging.Logger;

public class HoverTest extends BaseTest{
	private static final Logger LOGGER = LoggingUtil.getInstance(); 
	private Hover hoverpage;
	
	@BeforeMethod
	public void clickHoverAnchorLink() {
		LOGGER.info("++clickHoverAnchorLink()");
		hoverpage = home.clickHoverLink();
	}

	@Test(priority=1)
	public void hoverUserOneTest() {
		LOGGER.info("++hoverUserOneTest()");
		FigureCaption caption = hoverpage.hoverOverFigure(1);
		assertTrue(caption.isCaptionDisplayed(), "Caption is not displayed");
		assertEquals(caption.getTitle(), "name: user1", "Username is incorrect");
		assertEquals(caption.getAnchorLinkText(), "View profile", "View profile is incorrect");
		assertTrue(caption.getAnchorUrl().endsWith("/users/1"), "URL that endwiths /user/1 not found");
		assertTrue(caption.getAnchorUrl().contains("/users/1"), "URL that contains /user/1 not found");
	}
	
}
