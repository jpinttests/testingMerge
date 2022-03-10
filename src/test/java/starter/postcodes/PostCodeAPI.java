package starter.postcodes;

import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static org.yaml.snakeyaml.util.UriEncoder.encode;


public class PostCodeAPI {

    private static String LOCATION_BY_POST_CODE_AND_COUNTRY ="https://api.openweathermap.org/data/2.5/weather";
            //"https://cdn.jsdelivr.net/gh/fawazahmed0/currency-api@1/latest/currencies.json";


    String enco = encode(LOCATION_BY_POST_CODE_AND_COUNTRY);

    ValidatableResponse response;
    @Step("Get location by postcode {0} in country {1}")
    public void fetchLocationByPostCodeAndCountry() {
        System.out.println("hello");
        response = SerenityRest.given().log().all()
                .get(enco)
               .then().log().all();
        
    }


}
