package page_objects;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage extends BasePage {

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public WebElement createNewContactButton;

    public CreateNewContactPage clickOnCreateContactButton(){
        safeClickOnElement(createNewContactButton);
        return new CreateNewContactPage();
    }
    public ContactsPage(){
        PageFactory.initElements(driver, this);
    }


}
