package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BMWIdRegistrationPage extends Homepage {

    @FindBy (id = "//*[@id = 'custom-select-plus-salutation']")
    public WebElement salutationDropDown;

    @FindBy (id = "dr.")
    public WebElement dr;

    @FindBy (id = "firstName")
    public WebElement inputFieldFirstName;

    @FindBy (id = "lastName")
    public WebElement inputFieldLastName;

    @FindBy (id = "email")
    public WebElement inputFieldEmail;

    @FindBy (id = "password")
    public WebElement inputFiledPassword;

    @FindBy (xpath = "//*[@class = 'custom-input-checkbox __b']")
    public WebElement checkBoxAgreement;


//    CHECK LOCATOR
//    @FindBy (className = "custom-button __b primary")
//    public WebElement registerNowButton;

//    @FindBy (xpath = "//form[@class = 'form registration-form']")
//    public WebElement registrationForm;


    public void clickOnSalutationDRopDown(){
        safeClickOnElement(salutationDropDown);
    }

    public void switchToRegistrationForm(){
        driver.switchTo().activeElement();
    }

//    public RegistrationConfirmationPage clickOnRegisterButton(){
//        safeClickOnElement(registerNowButton);
//        return new RegistrationConfirmationPage();
//    }



 public BMWIdRegistrationPage(){
     PageFactory.initElements(driver, this);
 }


}
