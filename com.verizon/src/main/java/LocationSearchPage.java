import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocationSearchPage extends BasePage {

    @FindBy(xpath = "//input[@id= 'storesData']")
    public WebElement zipcodeInputField;

    @FindBy(xpath = "//li[@role= 'option']")
    public WebElement optionLink;




    public LocationSearchResultsPage clickOnOption(){
        safeClickOnElement(optionLink);
        return new LocationSearchResultsPage();
    }

    public void enterZipCode(String zipcode){
        clearSendKeysToElement(zipcodeInputField, zipcode);
    }

    public LocationSearchPage(){
        PageFactory.initElements(driver, this);
    }
}
