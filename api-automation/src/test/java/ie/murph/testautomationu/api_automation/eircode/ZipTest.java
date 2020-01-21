package ie.murph.testautomationu.api_automation.eircode;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class ZipTest {
	
	@Test
	public void ZipRequestTest() {
		given().
        when().
            get("http://zippopotam.us/us/90210").
        then().
            assertThat().
            body("places[0].'place name'", equalTo("Beverly Hills"));
	}

}
