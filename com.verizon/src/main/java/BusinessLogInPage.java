import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusinessLogInPage extends BasePage {

    @FindBy(xpath = "//div[@class = 'user-id']/input[@type = 'text']")
    public WebElement userIdInputFiled;

    @FindBy(xpath = "//div[@class = 'user-id']/input[@type = 'password']")
    public WebElement passwordInputField;

    @FindBy(xpath = "//button[@type = 'submit']")
    public WebElement logInButton;

    @FindBy(xpath = "//b[@class = 'bold75']")
    public WebElement errorMessage;

    public String getActualErrorMessage() {
        return getTrimmedElementText(errorMessage);
    }

    public void clickOnLogInButton() {
        safeClickOnElement(logInButton);
    }

    public void enterPassword(String password) {
        clearSendKeysToElement(passwordInputField, password);
    }

    public void enterUserId(String invalidId) {
        clearSendKeysToElement(userIdInputFiled, invalidId);
    }


    public BusinessLogInPage() {
        PageFactory.initElements(driver, this);
    }
}
