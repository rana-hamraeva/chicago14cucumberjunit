package step_definitions.etsy_steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.etsy_pages.Eatsy_Landing_Page;
import utilities.Config;
import utilities.Driver;

public class Eatsy_Search_Defs {


    Eatsy_Landing_Page eatsy_landing_page = new Eatsy_Landing_Page();



    @Given("User is on Etsy home page")
    public void user_is_on_Etsy_home_page() {
        Driver.getDriver().get(Config.getProperty("eatsyUrl"));

    }

    @When("User searches for wooden spoon")
    public void user_searches_for_wooden_spoon() {

        eatsy_landing_page.etsySearchBox.sendKeys("Wooden Spoon" + Keys.ENTER);

    }

    @Then("User should see wooden spoon in Etsy title")
    public void user_should_see_wooden_spoon_in_Etsy_title() {

        String  expectedInTitle = "Wooden spoon";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue("Verification Failed!",actualTitle.contains(expectedInTitle));
    }




    @When("User searches for {string}")
    public void user_searches_for(String searchValue) {
        eatsy_landing_page.etsySearchBox.sendKeys(searchValue + Keys.ENTER);
    }




    @Then("User should see {string} in Etsy title")
    public void user_should_see_in_Etsy_title(String searchValue) {
            String  expectedInTitle = searchValue;
            String actualTitle = Driver.getDriver().getTitle();
            Assert.assertTrue("Verification Failed!",actualTitle.contains(expectedInTitle));
        }

    }



