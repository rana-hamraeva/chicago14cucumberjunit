package pages.etsy_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Eatsy_Landing_Page {
public Eatsy_Landing_Page (){
    PageFactory.initElements(Driver.getDriver(),this);
}
@FindBy (xpath = "//input[@id='global-enhancements-search-query']")
    public WebElement etsySearchBox;


}
