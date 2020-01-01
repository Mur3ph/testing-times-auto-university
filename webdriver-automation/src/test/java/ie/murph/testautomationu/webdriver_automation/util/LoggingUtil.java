package ie.murph.testautomationu.webdriver_automation.util;

import java.util.logging.Logger;

public class LoggingUtil {

	// Initialized during class loading
//	private static final LoggingUtil INSTANCE = new LoggingUtil();

	// To prevent creating another instance of LoggingUtil Singleton
	private LoggingUtil() {}

	public static Logger getInstance() {
		String callingClassName = Thread.currentThread().getStackTrace()[2].getClass().getCanonicalName();
		return Logger.getLogger(callingClassName);
	}
}
