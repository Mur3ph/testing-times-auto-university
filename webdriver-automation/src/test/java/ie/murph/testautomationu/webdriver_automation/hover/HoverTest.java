package ie.murph.testautomationu.webdriver_automation.hover;

import org.testng.annotations.BeforeClass;
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
	private FigureCaption caption;
	
	@BeforeClass
	public void clickHoverAnchorLink() {
		LOGGER.info("++clickHoverAnchorLink()");
		hoverpage = home.clickHoverLink();
	}
	
	@BeforeMethod
	public void hoverImage() {
		LOGGER.info("++hoverImage()");
		this.caption = hoverpage.hoverOverFigure(1);
	}

	@Test(priority=1, groups= {"regression", "defect.fix"}, dependsOnGroups= {})
	public void ishoverUserOneTest() {
		LOGGER.info("++ishoverUserOneTest()");
		assertTrue(this.caption.isCaptionDisplayed(), "Caption is not displayed");
	}
	
	@Test(priority=2, groups= {"smoke", "defect.progress"}, dependsOnGroups= {})
	public void checkTitleHoverUserOneTest() {
		LOGGER.info("++checkTitleHoverUserOneTest()");
		assertEquals(this.caption.getTitle(), "name: user1", "Username is incorrect");
	}
	
	@Test(priority=3, groups= {"system", "defect.open"}, dependsOnGroups= {})
	public void checkAnchorLinkTextHoverUserOneTest() {
		LOGGER.info("++checkAnchorLinkTextHoverUserOneTest()");
		assertEquals(this.caption.getAnchorLinkText(), "View profile", "View profile is incorrect");
	}
	
	@Test(priority=4, groups= {"integration", "defect.cant-reproduce"}, dependsOnGroups= {})
	public void isAnchorUrlEndsWithHoverUserOneTest() {
		LOGGER.info("++isAnchorUrlEndsWithHoverUserOneTest()");
		assertTrue(this.caption.getAnchorUrl().endsWith("/users/1"), "URL that endwiths /user/1 is not found");
	}
	
	@Test(priority=5, groups= {"sanity", "unit", "interface", "beta/acceptance", "defect.rejected"}, dependsOnGroups= {})
	public void isAnchorUrlContainsHoverUserOneTest() {
		LOGGER.info("++isAnchorUrlContainsHoverUserOneTest()");
		assertTrue(this.caption.getAnchorUrl().contains("/users/1"), "URL that contains /user/1 is not found");
	}
	
}
