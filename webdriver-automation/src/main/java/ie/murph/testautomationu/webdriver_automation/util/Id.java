package ie.murph.testautomationu.webdriver_automation.util;

public enum Id
{
	LOGIN_PAGE_USERNAME("username"),
	LOGIN_PAGE_PASSWORD("password");
	
	private final String text;

    private Id(final String text) 
    {
        this.text = text;
    }

    @Override
    public String toString() 
    {
        return this.text;
    }
    
}
