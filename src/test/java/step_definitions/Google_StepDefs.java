package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.googleLandingPage.GoogleHomePage;
import utilities.Driver;

public class Google_StepDefs {
GoogleHomePage googleHomePage =new GoogleHomePage();


     @When("User is on google home page")
    public void user_is_on_google_home_page() {
        Driver.getDriver().get("https://google.com");
    }

    @Then("User should see title contains Google")
    public void user_should_see_title_contains_Google() {

        String expectedInTitle = "Google";

        String acctualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue("Title does not contain expected value",acctualTitle.contains(expectedInTitle));
    }


    @When("User types wooden spoon into search box")
    public void user_types_wooden_spoon_into_search_box() {

        googleHomePage.searchBox.sendKeys("wooden spoon"+ Keys.ENTER);
    }

    @When("User clicks on search button")
    public void user_clicks_on_search_button() {

//googleHomePage.searchButton.click();
    }

    @Then("User should see wooden spoon in the title")
    public void user_should_see_wooden_spoon_in_the_title() {

        String expectedInTitle = "wooden spoon";
        String acctualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue("Verification Failed!",acctualTitle.contains(expectedInTitle));

    }


}
