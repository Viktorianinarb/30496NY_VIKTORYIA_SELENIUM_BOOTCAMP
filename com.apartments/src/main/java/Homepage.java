import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Homepage extends BasePage {

    @FindBy(xpath = "//div[@class = 'header-switch-language-wrapper mortar-wrapper']/a")
    public WebElement languageMenu;

    @FindBy(xpath = "//a[@title = 'English' and @class = 'btn btn-sm btn-pill culture header-pill-selected']")
    public WebElement languageEnglishSelectedButton;

    @FindBy(xpath = "//a[@title = 'Español' and @class = 'btn btn-sm btn-pill culture ']")
    public WebElement languageSpanishUnselectedButton;

    @FindBy(xpath = "//a[@title = 'English' and @class = 'btn btn-sm btn-pill culture ']")
    public WebElement languageEnglishUnselectedButton;

    @FindBy(xpath = "//a[@class = 'js-headerSignUp headerSignUp']")
    public WebElement registrationButton;
    boolean isSpanish = false;

    @FindBy(xpath = "//i[@id = 'headerMeunIcon']")
    public WebElement mainMenuButton;

    @FindBy(xpath = "//a[@id = 'menuNavLnkManageRental']")
    public WebElement manageRentalsButton;

    @FindBy(xpath = "//input[@id = 'quickSearchLookup']")
    public WebElement mainSearchField;

    @FindBy(xpath = "//a[@title = 'Search apartments for rent']")
    public WebElement searchButton;

    @FindBy(xpath = "//a[@title='Sign In']")
    public WebElement signInLink;

    @FindBy(id = "username")
    public WebElement usernameInputField;

    @FindBy(xpath = "//input[@id= 'password']")
    public WebElement passwordInputField;

    @FindBy(id = "loginButton")
    public WebElement userAccountSignInButton;

    @FindBy(xpath = "//div[@class = 'modalBody']//iframe")
    public WebElement signInFrame;

    @FindBy(xpath = "//div[@role= 'alert']")
    public WebElement invalidUsernamePasswordMessage;

    @FindBy(xpath = "//li[@class = 'parsley-type']")
    public WebElement invalidEmailSpellingMessage;

    @FindBy(xpath = "//a[contains(text(), 'Renter Tools')]")
    public WebElement renterToolsLink;

    @FindBy(xpath = "//a[contains(text(), 'Rental Calculator')]")
    public WebElement linkToRentalCalculatorPage;

    public RentAffordabilityCalculatorPage clickOnLinkToRentalCalculator(){
        safeClickOnElement(linkToRentalCalculatorPage);
        return new RentAffordabilityCalculatorPage();
    }

    public void clickOnRenterToolsMenu(){
        safeClickOnElement(renterToolsLink);
    }

    public String chooseErrorMessage(String username) {
        String message;
        Pattern special = Pattern.compile("[@]");
        Matcher hasSpecial = special.matcher(username);

        if (hasSpecial.find()) {
            webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@role= 'alert']")));
            message = invalidUsernamePasswordMessage.getText();
        } else {
            webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//li[@class = 'parsley-type']")));
            message = invalidEmailSpellingMessage.getText();
        }
        return message;
    }


    public void switchToSignInFrame() {
        switchToFrameByElement(signInFrame);
    }

    public void clickOnSignInButton() {
        safeClickOnElement(signInLink);
    }

    public void enterUsername(String username) {
        clearSendKeysToElement(usernameInputField, username);
    }

    public void enterPassword(String password) {
        clearSendKeysToElement(passwordInputField, password);
    }

    public void clickOnAccountSignInButton() {
        safeClickOnElement(userAccountSignInButton);
    }


    public void inputInfoInSearchField(String searchProperty) {
        clearSendKeysToElement(mainSearchField, searchProperty);
    }

    public SearchPropertyResultPage clickOnSearchButton() {
        safeClickOnElement(searchButton);
        return new SearchPropertyResultPage();
    }

    public void chooseLanguage() {
        if (languageEnglishSelectedButton.isDisplayed()) {
            safeClickOnElement(languageSpanishUnselectedButton);
            isSpanish = true;
        } else {
            safeClickOnElement(languageEnglishUnselectedButton);
        }
    }

    public boolean isLanguageChangedSuccessfully() {
        if (!isSpanish && registrationButton.getText().equals("Registrar")) {
            return true;
        } else if (!isSpanish && registrationButton.getText().equals("Register")) {
            return true;
        } else {
            return false;
        }
    }


    public void clickOnLanguageMenu() {
        safeClickOnElement(languageMenu);

    }


    public void clickOnMenuDropDown() {
        safeClickOnElement(mainMenuButton);
    }

    public RentalManagerPage clickOnManageRentalButton() {
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[@id = 'menuNavLnkManageRental']")));
        safeClickOnElement(manageRentalsButton);
        return new RentalManagerPage();
    }

    public Homepage() {
        PageFactory.initElements(driver, this);
    }
}
