package page_objects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Homepage extends BasePage {

    @FindBy(xpath = "//a[@aria-controls = 'wizard-flight-pwa']")
    public WebElement linkToFlightsTab;

    @FindBy(xpath = "//button[@aria-label='Leaving from']")
    public WebElement leavingFromButton;

    @FindBy(xpath = "//button[@aria-label= 'Going to']")
    public WebElement goingToButton;

    @FindBy(xpath = "//input[@id='location-field-leg1-origin']")
    public WebElement leavingFromField;

    @FindBy(xpath = "//input[@id='location-field-leg1-destination']")
    public WebElement goingToField;

    @FindBy(xpath = "//div[@class='truncate']")
    public WebElement selectFromOption;

    @FindBy(xpath = "//*[@id=\"location-field-leg1-destination-menu\"]/div[2]/div[2]/ul/li[1]/button/div/div[1]/span/strong")
    public WebElement selectToOption;

    @FindBy(xpath = "//button[@id = 'd1-btn']")
    public WebElement departingDateButton;

    @FindBy(xpath = "//td[@class = 'uitk-date-picker-day-number']//button")
    public List<WebElement> dateOptions;

    @FindBy(xpath = "//button[@data-stid = 'apply-date-picker']")
    public WebElement dateConfirmButton;

    @FindBy(xpath = "//button[@type = 'submit']")
    public WebElement searchButton;

    @FindBy(xpath = "//div[contains(text(),'Sign in')]")
    public WebElement signInButton;

    @FindBy(xpath = "//div[@class = 'uitk-spacing uitk-spacing-margin-inline-six uitk-spacing-margin-blockend-two']/a[1]")
    public WebElement signInLink;



    public SignInPage clickOnSignInButton(){
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//button[@class = 'uitk-button uitk-button-large uitk-button-has-text uitk-button-tertiary uitk-menu-trigger global-navigation-nav-button']/div[contains(text(), 'Sign in')]")));
        safeClickOnElement(signInButton);
        safeClickOnElement(signInLink);
        return new SignInPage();
    }

    public void clickOnSearch(){
        safeClickOnElement(searchButton);
    }
    public void chooseDate(int dateStartOption, int dateEndOption){
        safeClickOnElement(departingDateButton);
        safeClickOnElement(dateOptions.get(dateStartOption));
        safeClickOnElement(dateOptions.get(dateEndOption));
        safeClickOnElement(dateConfirmButton);
    }

    public void enterLeavingFromDestination(String city){
        safeClickOnElement(leavingFromButton);
        clearSendKeysToElement(leavingFromField, city);
        safeClickOnElement(selectFromOption);
    }

    public void enterGoingToDestination(String city){
        safeClickOnElement(goingToButton);
        clearSendKeysToElement(goingToField,city);
        safeClickOnElement(selectToOption);

    }

    public void clickOnDepartingDateButton(){
        safeClickOnElement(departingDateButton);
    }

    public void clickOnFlights(){
        safeClickOnElement(linkToFlightsTab);
    }
    public Homepage(){
        PageFactory.initElements(driver, this);
    }
}
