import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BasePage {

    @FindBy(xpath = "//a[@class = 'login bold']")
    public WebElement signInLink;

    @FindBy(xpath = "//input[@id = 'loginFormUser_email']")
    public WebElement emailInputField;

    @FindBy(xpath = "//input[@id = 'loginForm_password']")
    public WebElement passwordInputField;

    @FindBy(xpath = "//a[@class = 'newButton orange']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[@id = 'serverErrors']")
    public WebElement errorMessage;

    @FindBy(xpath = "//div[@id = 'emailSigningNotify']")
    public WebElement invalidInputMessage;

    public Object getErrorMessage(String email){
        if (email.contains("@")) {
            return getTrimmedElementText(errorMessage);
        } else {
            return invalidInputMessage.getAttribute("data-tooltip");
        }

    }



    public void clickOnSignIn(){
        safeClickOnElement(signInButton);
    }

    public void enterPassword(String password){
        clearSendKeysToElement(passwordInputField, password);
    }

    public void enterEmail(String email){
        clearSendKeysToElement(emailInputField, email);
    }

    public void clickOnSignInLink(){
        safeClickOnElement(signInLink);
    }
    public Homepage(){
        PageFactory.initElements(driver, this);
    }
}
