package ie.murph.testautomationu.api_automation.eircode;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.logging.Logger;
import org.junit.Test;
import io.restassured.http.ContentType;

public class ZipCode90210Test {
	private static final Logger LOGGER = Logger.getLogger(ZipCode90210Test.class.getSimpleName()); 
	
    @Test
    public void checkStatusCode_expectHttp200() {
    	LOGGER.info("++checkStatusCode_expectHttp200()");
        given().
        when().
            get("http://zippopotam.us/us/90210").
        then().
            assertThat().
            statusCode(200);
        LOGGER.info("--checkStatusCode_expectHttp200()");
    }

    @Test
    public void checkContentType_expectApplicationJson() {
    	LOGGER.info("++checkContentType_expectApplicationJson()");
        given().
        when().
            get("http://zippopotam.us/us/90210").
        then().
            assertThat().
            contentType(ContentType.JSON);
        LOGGER.info("--checkContentType_expectApplicationJson()");
    }

    @Test
    public void logRequestAndResponseDetails() {
    	LOGGER.info("++logRequestAndResponseDetails()");
        given().
            log().all().
        when().
            get("http://zippopotam.us/us/90210").
        then().
            log().body(); // Writes everything about the API request to the standard output and console
        LOGGER.info("--logRequestAndResponseDetails()");
    }

    @Test
    public void checkPlaceNameInResponseBody_expectBeverlyHills() {
    	LOGGER.info("++checkPlaceNameInResponseBody_expectBeverlyHills()");
        given().
        when().
            get("http://zippopotam.us/us/90210").
        then().
            assertThat().
            body("places[0].'place name'", equalTo("Beverly Hills"));
        LOGGER.info("--checkPlaceNameInResponseBody_expectBeverlyHills()");
    }

    @Test
    public void checkStateNameInResponseBody_expectCalifornia() {
    	LOGGER.info("++checkStateNameInResponseBody_expectCalifornia()");
        given().
        when().
            get("http://zippopotam.us/us/90210").
        then().
            assertThat().
            body("places[0].state", equalTo("California"));
        LOGGER.info("--checkStateNameInResponseBody_expectCalifornia()");
    }

    @Test
    public void checkListOfPlaceNamesInResponseBody_expectContainsBeverlyHills() {
    	LOGGER.info("++checkListOfPlaceNamesInResponseBody_expectContainsBeverlyHills()");
        given().
        when().
            get("http://zippopotam.us/us/90210").
        then().
            assertThat().
            body("places.'place name'", hasItem("Beverly Hills"));
        LOGGER.info("--checkListOfPlaceNamesInResponseBody_expectContainsBeverlyHills()");
    }

    @Test
    public void checkNumberOfPlaceNamesInResponseBody_expectOne() {
    	LOGGER.info("++checkNumberOfPlaceNamesInResponseBody_expectOne()");
        given().
        when().
            get("http://zippopotam.us/us/90210").
        then().
            assertThat().
            body("places.'place name'", hasSize(1));
        LOGGER.info("--checkNumberOfPlaceNamesInResponseBody_expectOne()");
    }
}
