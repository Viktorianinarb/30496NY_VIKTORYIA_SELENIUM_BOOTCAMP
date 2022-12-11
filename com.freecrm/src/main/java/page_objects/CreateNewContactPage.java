package page_objects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CreateNewContactPage extends BasePage {

    @FindBy(xpath = "//input[@name = 'first_name']")
    public WebElement inputFirstNameField;

    @FindBy(xpath = "//input[@name = 'last_name']")
    public WebElement inputLastNameField;

    @FindBy(xpath = "//div[@name='company']//input[@class='search']")
    public WebElement companyInputField;

    @FindBy(xpath = "//div[@name='company']//div[@role='option']")
    public WebElement companyOption;

    @FindBy(xpath = "//input[@placeholder = 'Email address']")
    public WebElement emailInputField;

    @FindBy(xpath = "//button[@class= 'ui small fluid positive toggle button']")
    public WebElement accessButton;

    @FindBy(xpath = "//div[@name= 'category' and @role = 'listbox']")
    public WebElement categoryBoxField;

    @FindBy(xpath = "//div[@name= 'category' and @role = 'option']")
    public List<WebElement> categoryOptionsList;

    @FindBy(xpath = "//input[@name= 'address']")
    public WebElement inputStreetAddressField;

    @FindBy(xpath = "//input[@name= 'city']")
    public WebElement inputCityField;

    @FindBy(xpath = "//input[@name= 'state']")
    public WebElement inputStateField;

    @FindBy(xpath = "//input[@name= 'zip']")
    public WebElement inputZipField;

    @FindBy(xpath = "//input[@name= 'do_not_call']")
    public WebElement checkboxDoNotCall;

    @FindBy(xpath = "//button[@class= 'ui linkedin button']")
    public WebElement saveContactButton;



    public void enterFirstName(String firstname){
        clearSendKeysToElement(inputFirstNameField,firstname);
    }

    public void enterLastName(String lastname){
        clearSendKeysToElement(inputLastNameField,lastname);
    }

    public void enterCompanyName(String companyName){
        clearSendKeysToElement(companyInputField,companyName);
    }

    public void chooseCompany(){
        safeClickOnElement(companyOption);
    }

    public void enterEmail(String email){
        clearSendKeysToElement(emailInputField,email);
    }

    public void setPublicAccess(){
        safeClickOnElement(accessButton);
    }

    public CreateNewContactPage(){
        PageFactory.initElements(driver,this);
    }

    public void pressOnCategoryChoices() {
        safeClickOnElement(categoryBoxField);
    }

    public void selectCategory(String category){
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@name= 'category' and @role = 'option']")));
        for(WebElement element : categoryOptionsList){
            if(element.getText().equals(categoryOptionsList)){
                safeClickOnElement(element);
                break;
            }
        }
    }

    public void enterStreetName(String streetName){
        clearSendKeysToElement(inputStreetAddressField, streetName );
    }

    public void enterCity(String city){
        clearSendKeysToElement(inputCityField, city);
    }

    public void enterState(String state){
        clearSendKeysToElement(inputStateField, state);
    }

    public void enterZip(String zip){
        clearSendKeysToElement(inputZipField, zip);
    }

    public void pressOnDoNotCall(){
        safeClickOnElement(checkboxDoNotCall);
    }

    public ContactDetailsPage clickOnSaveContactButton(){
        safeClickOnElement(saveContactButton);
        return new ContactDetailsPage();
    }
}
