package pages.wikipedia_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Wiki_Page {

    public Wiki_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "searchInput")
    public WebElement seachBox ;

    @FindBy(xpath = "//button[@class='pure-button pure-button-primary-progressive']")
    public WebElement searchButton;


    @FindBy(xpath = "/h1[@id='firstHeading']")
    public WebElement mainHeader;

    @FindBy(xpath = "(//div[@style='display:inline'])[1]")
    public WebElement imageHeader;
}
