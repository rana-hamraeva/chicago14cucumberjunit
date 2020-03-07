package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import utilities.DataStorage;
import utilities.Driver;

public class Dzon_steps {

    @Given("User on {string}")
    public void user_on(String url) {

        Driver.getDriver().get(url);

    }

    @Given("user takes header")
    public void user_takes_header() {
        String header =Driver.getDriver().findElement(By.xpath("//h1")).getText();
        DataStorage.addData("test",header);

    }

    @Then("user takes header of this page")
    public void user_takes_header_of_this_page() {
        String header2 =Driver.getDriver().findElement(By.xpath("//h1")).getText();

        DataStorage.addData("test2",header2);
    }



    @Then("user compares headers")
    public void user_compares_headers() {
        Assert.assertEquals(DataStorage.getData("test"),DataStorage.getData("test2"));
    }



}
