package pages.SmartBearPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SmartBearHomePage {
    public SmartBearHomePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(name = "ctl00$MainContent$username")
    public WebElement usernameInput;

    @FindBy(name = "ctl00$MainContent$password")
    public WebElement passwordInput;

    @FindBy(name ="ctl00$MainContent$login_button" )
    public WebElement submitButton;

    @FindBy(className ="login_info")
    public WebElement sucssesMessage;

    @FindBy(id = "ctl00_MainContent_status")
    public WebElement errormessage;

}
