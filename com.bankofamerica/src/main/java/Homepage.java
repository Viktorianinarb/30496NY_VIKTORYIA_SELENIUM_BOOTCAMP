import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BasePage {

    @FindBy(xpath = "//input[@aria-label = 'User ID']")
    public WebElement userIdInputField;

    @FindBy(xpath = "//input[@aria-label = 'Password']")
    public WebElement passwordInputField;

    @FindBy(xpath = "//button[@id= 'signIn']")
    public WebElement signInButton;

    @FindBy(xpath = "//a[@id = 'navAutoLoans']")
    public WebElement autoLoanLink;

    @FindBy(xpath = "//a[@id = 'finCenterLocator']")
    public WebElement linkToCenterSearch;

    @FindBy(xpath = "//a[@id = 'navCreditCards']")
    public WebElement linkToCreditCardPage;

    @FindBy(xpath = "//input[@id = 'nav-search-query']")
    public WebElement searchField;

    @FindBy(xpath = "//button[@id = 'global-search-button']")
    public WebElement searchButtonMain;

    @FindBy(xpath = "//p[@class = 'spa-global-search-tips--title']")
    public WebElement searchMessage;

    public String getMessageFromSearchResult(){
        return getTrimmedElementText(searchMessage);
    }

    public void clickOnSearch(){
        safeClickOnElement(searchButtonMain);
    }

    public void enterInvalidInformation(String textInput){
        clearSendKeysToElement(searchField, textInput);
    }

    public CreditCardsPage clickOnLinkToCreditCardsPage(){
        safeClickOnElement(linkToCreditCardPage);
        return new CreditCardsPage();
    }

    public BranchLocatorPage clickOnLinkRedirectingToBranchSearch(){
        safeClickOnElement(linkToCenterSearch);
        return new BranchLocatorPage();
    }

    public void inputUsername(String username){
        clearSendKeysToElement(userIdInputField, username);
    }

    public void inputPassword(String password){
        clearSendKeysToElement(passwordInputField,password);
    }

    public void pressOnSignInButton(){
        safeClickOnElement(signInButton);
    }

    public AutoLoanPage clickOnAutoLoanLink(){
        safeClickOnElement(autoLoanLink);
        return new AutoLoanPage();
    }

    public Homepage(){
        PageFactory.initElements(driver,this);
    }
}
