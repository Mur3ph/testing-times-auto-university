package ie.murph.testautomationu.webdriver_automation.util;

import java.util.logging.Logger;

public class LoggingUtil {
	
	public static Logger getInstance() {
	      String callingClassName = 
	         Thread.currentThread().getStackTrace()[2].getClass().getCanonicalName();
	      return Logger.getLogger(callingClassName);
	   }

}
