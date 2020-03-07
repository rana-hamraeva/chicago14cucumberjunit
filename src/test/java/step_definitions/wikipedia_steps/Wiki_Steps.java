package step_definitions.wikipedia_steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.wikipedia_pages.Wiki_Page;
import utilities.Config;
import utilities.Driver;

public class Wiki_Steps {

    Wiki_Page wiki_page = new Wiki_Page();
    @When("User is onWikipedia home page")
    public void user_is_onWikipedia_home_page() {
        Driver.getDriver().get(Config.getProperty("wikiurl"));

    }

    @Then("User types Steve Jobs in the wiki search box")
    public void user_types_Steve_Jobs_in_the_wiki_search_box() {

        wiki_page.seachBox.sendKeys("Steve Jobs" );

    }

    @Then("User clickswiki search button")
    public void user_clickswiki_search_button() {
        wiki_page.searchButton.click();

    }

    @Then("User sees Steve Jobs is in the wiki title")
    public void user_sees_Steve_Jobs_is_in_the_wiki_title() {
        String acctualTitle =Driver.getDriver().getTitle();
        String expectedInTitle = "Steve Jobs";

        Assert.assertTrue(acctualTitle.contains(expectedInTitle));

    }


    @Then("User sees Steve Jobs is in the main header")
    public void user_sees_Steve_Jobs_is_in_the_main_header() {
        String expectedHeader = "Steve Jobs";
        String acctualHeader = wiki_page.mainHeader.getText();


        Assert.assertTrue(acctualHeader.equals(expectedHeader));
    }

    @Then("sees Steve Jobs is in the image header")
    public void sees_Steve_Jobs_is_in_the_image_header() {
        String expectedImageHeader = "Steve Jobs";
        String acctualImageHeader = wiki_page.imageHeader.getText();
        Assert.assertTrue(acctualImageHeader.equals(expectedImageHeader));
    }



}
