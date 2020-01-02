package ie.murph.testautomationu.webdriver_automation.util;

public enum CSS
{
	LOGIN_PAGE_LOGIN_BUTTON("#login button");
	
	private final String text;

    private CSS(final String text) 
    {
        this.text = text;
    }

    @Override
    public String toString() 
    {
        return this.text;
    }
    
}
