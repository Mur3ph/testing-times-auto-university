package ie.murph.testautomationu.webdriver_automation.util;

public enum Secure
{
	THE_INTERNET_LOGIN_PAGE_USERNAME("tomsmith"), 
	THE_INTERNET_LOGIN_PAGE_PASSWORD("SuperSecretPassword!");
	
	private final String text;

    private Secure(final String text) 
    {
        this.text = text;
    }

    @Override
    public String toString() 
    {
        return this.text;
    }
    
}
