import base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class Homepage extends BasePage {

    @FindBy(xpath = "//button[@id = 'gnav20-Shop-L1']")
    public WebElement shopMenuButton;

    @FindBy(xpath = "//a[@id = 'gnav20-Shop-L2-4']")
    public WebElement linkToAccessories;

    @FindBy(xpath = "//a[@id = 'gnav20-Shop-L3-47']")
    public WebElement linkToChargesMenu;

    @FindBy(xpath = "//button[@id= 'gnav20-search-icon']")
    public WebElement searchButtonMainPage;

    @FindBy(xpath = "//input[@id= 'search_box_gnav_input']")
    public WebElement searchInputField;

    @FindBy(xpath = "//a[@id = 'gnav20-account-link-id']")
    public WebElement logInLink;

    @FindBy(xpath = "//a[@id = 'gnav20-eyebrow-link-Business']")
    public WebElement linkToBusiness;

    @FindBy(xpath = "//a[@data-label='Stores']")
    public WebElement linkToStoreLocations;

    public LocationSearchPage clickOnStoreLocationsLink(){
        safeClickOnElement(linkToStoreLocations);
        return new LocationSearchPage();
    }

    public BusinessLogInPage clickOnLogInLink() {
        safeClickOnElement(linkToBusiness);
        safeClickOnElement(logInLink);
        return new BusinessLogInPage();
    }

    public SearchPage enterItemForSearch(String searchTerm) throws AWTException {
        clearSendKeysToElement(searchInputField, searchTerm);
        searchInputField.sendKeys(Keys.RETURN);
        return new SearchPage();
    }

    public void clickOnMainSearchButton() {
        safeClickOnElement(searchButtonMainPage);
    }

    public BatteriesAndChargersPage clickOnChargersOption() {
        safeClickOnElement(linkToChargesMenu);
        return new BatteriesAndChargersPage();
    }

    public void clickOnAccessoriesLink() {
        safeClickOnElement(linkToAccessories);
    }

    public void clickOnShopButton() {
        safeClickOnElement(shopMenuButton);
    }

    public Homepage() {
        PageFactory.initElements(driver, this);

    }
}
