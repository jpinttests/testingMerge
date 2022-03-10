package starter.postcodes;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostCodeStepDefinitions {

    @Steps
    PostCodeAPI postCodeAPI;

    @When("I look up a post code {word} for country code {word}")
    public void lookUpAPostCode(String postCode, String country) {

    }

    @Then("the resulting location should be {} in {}")
    public void theResultingLocationShouldBe(String placeName, String country) {
        restAssuredThat(response -> response.statusCode(200));
      //  restAssuredThat(response -> response.body(LocationResponse.COUNTRY, equalTo(country)));
    //    restAssuredThat(response -> response.body(LocationResponse.FIRST_PLACE_NAME, equalTo(placeName)));
    }

    @When("I look up a post code <Post Code> for country code <Country Code>")
    public void iLookUpAPostCodePostCodeForCountryCodeCountryCode() {
        postCodeAPI.fetchLocationByPostCodeAndCountry();
    }
}
