package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationConfirmationPage extends Homepage {

    @FindBy (xpath = "//*[@class = \"custom-header-title __b\"]")
    public WebElement registrationConfMessage;


    public RegistrationConfirmationPage(){
        PageFactory.initElements(driver, this);
    }
}

