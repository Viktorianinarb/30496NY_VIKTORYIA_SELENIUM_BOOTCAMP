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

    @FindBy(xpath = "//ul[@class = 'navMenuUL']/li/a[contains(text(), 'Tools')]")
    public WebElement toolsButton;

    @FindBy(xpath = "//a[contains(text(), 'Academy')]")
    public WebElement linkToAcademy;

    @FindBy(xpath = "//a[contains(text(), 'Mortgage Calculator')]")
    public WebElement linkToMortgageCalculator;

    public MortgageCalculatorPage goToMortgageCalculator(){
        safeClickOnElement(linkToMortgageCalculator);
        return new MortgageCalculatorPage();
    }

    public AcademyPage switchToAcademy(){
        safeClickOnElement(linkToAcademy);
        return new AcademyPage();
    }

    public ToolsPage clickOnToolsMenu(){
        safeClickOnElement(toolsButton);
        return new ToolsPage();
    }


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
