package ie.murph.testautomationu.webdriver_automation.util;

public enum XPath
{
	SHIFTING_CONTENT_ANCHOR_CASE_SENSITIVE_BY_TEXT("//li/a[contains(translate(text(), 'shifting content', 'Shifting Content'))]"), 
	SHIFTING_CONTENT_ANCHOR_BY_TEXT("//li/a[contains(text(), 'Shifting Content')]"),
	SHIFTING_CONTENT_ANCHOR_BY_HREF("//li/a[@href='/shifting_content']"),
	MENU_ELEMENT_ANCHOR("//a[@href='/shifting_content/menu']"),
	LIST_OF_ANCHOR_TAGS_ONLY_IN_MENU("//ul/li/a"),
	STACK_TRACE("");
	
	private final String text;

    private XPath(final String text) 
    {
        this.text = text;
    }

    @Override
    public String toString() 
    {
        return this.text;
    }
    
}
