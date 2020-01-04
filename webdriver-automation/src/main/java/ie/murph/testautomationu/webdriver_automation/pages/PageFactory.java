package ie.murph.testautomationu.webdriver_automation.pages;

public class PageFactory {
	
private static PageFactory factory = null;
	

    private PageFactory() {}
    
    /**
     * Get an instance of the CommandFactory
     * @return The singleton CommandFactory object
     */
    
    public synchronized static PageFactory getInstance() {
        if (factory == null) {      // first time use..
        	factory = new PageFactory();
        }
        return factory;
    }

    /**
     * 
     * @param commandStr Identifier for the exact Command object required
     * @return The specific Command object requested
     */

    public synchronized Page clickCommand(String commandStr) {
    	Page page = null;
		return page;
    	
    }

}
