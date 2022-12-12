package page_objects;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage {

    @FindBy(xpath = "//input[@id = 'loginFormEmailInput']")
    public WebElement emailInputField;

    @FindBy(xpath = "//input[@id = 'loginFormPasswordInput']")
    public WebElement passwordInputField;

    @FindBy(xpath = "//button[@id = 'loginFormSubmitButton']")
    public WebElement signInConfirmButton;

    @FindBy(xpath = "//h3[@class = 'uitk-error-summary-heading']")
    public WebElement errorMessage;


    public void clickOnAccountSignInButton(){
        safeClickOnElement(signInConfirmButton);
    }

    public void enterPassword(String password){
        clearSendKeysToElement(passwordInputField,password);
    }

    public void enterEmail(String email){
        clearSendKeysToElement(emailInputField,email);
    }

    public SignInPage(){
        PageFactory.initElements(driver, this);
    }
}
