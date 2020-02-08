package ie.murph.testautomationu.webdriver_automation.data.provider;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {
	
	@DataProvider (name = "login-provider")
	public static Object [] [] loginData ()
	{
		Object [] [] data = new Object [4] [3];
		data [0] [0] = "Invalid"; data [0] [1] = "Invalid123"; data [0] [2] = false;
		data [1] [0] = "Admin";   data [1] [1] = "admin123";   data [1] [2] = true;
		data [2] [0] = "admin";	  data [2] [1] = "admin123";   data [2] [2] = true;
		data [3] [0] = "username";data [3] [1] = "password"; data [3] [2] = false;
		return data;
	}
	
//	To use the above data, the method receiving the data will need the below annotations and attributes
//	@Test (dataProviderClass = LoginDataProvider.class, dataProvider = "login-provider")
//	AND the method will have to accept three parameters (user name, password, boolean/exists), OR, matching the number of parameters in the data provider array data 

}
