package pages.VyTrackPages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateCalendarEventPages {
    public CreateCalendarEventPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
