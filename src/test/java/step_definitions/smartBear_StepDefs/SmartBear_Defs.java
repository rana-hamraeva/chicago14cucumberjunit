package step_definitions.smartBear_StepDefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.SmartBearPages.SmartBearHomePage;
import utilities.Driver;

public class SmartBear_Defs {
SmartBearHomePage smartBearHomePage =new SmartBearHomePage();


    @When("User on smart bear login page")
    public void user_on_smart_bear_login_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }

    @When("User input correct username")
    public void user_input_correct_username() {
       smartBearHomePage.usernameInput.sendKeys("Tester");
    }

    @When("User inputs correct password")
    public void user_inputs_correct_password() {
        smartBearHomePage.passwordInput.sendKeys("test");
    }

    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        smartBearHomePage.submitButton.click();
    }

    @Then("User should be able to login and should be able to see welcome message")
    public void user_should_be_able_to_login_and_should_be_able_to_see_welcome_message() {
       Assert.assertTrue( smartBearHomePage.sucssesMessage.isDisplayed());
    }



    @When("User inputs incorrect password")
    public void user_inputs_incorrect_password() {
        smartBearHomePage.passwordInput.sendKeys("absd");
    }

    @Then("User should see error message")
    public void user_should_see_error_message() {

        Assert.assertTrue(smartBearHomePage.errormessage.isDisplayed());
    }



}


