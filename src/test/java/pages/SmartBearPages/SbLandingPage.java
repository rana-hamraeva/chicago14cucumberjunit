package pages.SmartBearPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SbLandingPage {

    public  SbLandingPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(linkText = "Order")

    public WebElement orderLink;


}
