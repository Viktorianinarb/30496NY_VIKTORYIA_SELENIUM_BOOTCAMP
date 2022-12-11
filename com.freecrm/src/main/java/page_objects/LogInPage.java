package page_objects;

import base.BasePage;
import config.BaseConfig;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends BasePage {

    @FindBy(xpath =  "//input[@name = 'email']")
    public WebElement emailInputField;

    @FindBy(xpath = "//input[@name = 'password']")
    public WebElement passwordInputFiled;

    @FindBy(xpath = "//div[contains(text(), 'Login')]")
    public WebElement loginButtonLoginPage;

    public void enterEmail(){
        clearSendKeysToElement(emailInputField, BaseConfig.properties.getProperty("email"));
    }

    public void enterPassword(){
        clearSendKeysToElement(passwordInputFiled, BaseConfig.properties.getProperty("password"));
    }

    public void enterValidLoginCredentials(){
        enterEmail();
        enterPassword();
    }

    public UserAccountPage clickOnLoginButton(){
        safeClickOnElement(loginButtonLoginPage);
        return new UserAccountPage();
    }

    public LogInPage(){
        PageFactory.initElements(driver,this);
    }
}
