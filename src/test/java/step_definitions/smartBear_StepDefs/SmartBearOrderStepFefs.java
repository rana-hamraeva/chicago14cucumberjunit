package step_definitions.smartBear_StepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.SmartBearPages.SBorderPage;
import pages.SmartBearPages.SbLandingPage;
import pages.SmartBearPages.SbViewAllOrdersPage;
import pages.SmartBearPages.SmartBearHomePage;
import utilities.Driver;

public class SmartBearOrderStepFefs {
    SmartBearHomePage smartBearHomePage = new SmartBearHomePage();
    SBorderPage sBorderPage = new SBorderPage();
    SbViewAllOrdersPage sbViewAllOrdersPage = new SbViewAllOrdersPage();
    SbLandingPage sbLandingPage=new SbLandingPage();

    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_SmartBear_Tester_account_and_on_Order_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        smartBearHomePage.usernameInput.sendKeys("Tester");
        smartBearHomePage.passwordInput.sendKeys("test");
        smartBearHomePage.submitButton.click();
        sbLandingPage.orderLink.click();
    }

    @Given("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String drpDownValue) {

        Select productDropDown = new Select(sBorderPage.productDropdown);
        productDropDown.selectByVisibleText(drpDownValue);


    }

    @Given("User enters {string} to quantity input box")
    public void user_enters_to_quantity_input_box(String givenQuantity) {

        sBorderPage.quantity.sendKeys(Keys.BACK_SPACE, givenQuantity);


    }

    @Given("User enters {string} to costumer name input box")
    public void user_enters_to_costumer_name_input_box(String customerName) {
        sBorderPage.customerName.sendKeys(customerName);

    }

    @Given("User enters {string} to street input box")
    public void user_enters_to_street_input_box(String street) {
        sBorderPage.street.sendKeys(street);

    }

    @Given("User enters {string} to city input box")
    public void user_enters_to_city_input_box(String city) {
        sBorderPage.city.sendKeys(city);

    }

    @Given("User enters {string} to state input box")
    public void user_enters_to_state_input_box(String state) {
        sBorderPage.state.sendKeys(state);

    }

    @Given("User enters {string} to zip input box")
    public void user_enters_to_zip_input_box(String zip) {

        sBorderPage.zip.sendKeys(zip);

    }

    @Given("User selects {string} as card type from radio buttons")
    public void user_selects_as_card_type_from_radio_buttons(String givenType) {

        if (givenType.equalsIgnoreCase("visa")) {
            sBorderPage.visaCardType.click();

        } else if (givenType.equalsIgnoreCase("masterCard")) {

            sBorderPage.masterCardType.click();
        } else if (givenType.equalsIgnoreCase("American Express")) {

            sBorderPage.americanExpressCardType.click();
        } else {
            Assert.assertTrue("Invalid Card Type", false);
        }


    }

    @Given("User enters {string} to card number input box")
    public void user_enters_to_card_number_input_box(String givenCardNumber) {

        sBorderPage.creditCardInput.sendKeys(givenCardNumber);

    }

    @Given("User enters {string} to expiration date input box")
    public void user_enters_to_expiration_date_input_box(String expirationDate) {

        sBorderPage.expirationInput.sendKeys(expirationDate);


    }

    @Given("User clicks process button")
    public void user_clicks_process_button() {
        sBorderPage.processButton.click();

    }

    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String givenName)throws InterruptedException {

        sbViewAllOrdersPage.viewAllOrdersLink.click();

        Thread.sleep(3000);

       // System.out.println(sbViewAllOrdersPage.newOrderNameCell.getText());

        String acctualName = sbViewAllOrdersPage.newOrderNameCell.getText();
        String expectedName = givenName;
        Assert.assertTrue(acctualName.equalsIgnoreCase(expectedName));



    }

}
