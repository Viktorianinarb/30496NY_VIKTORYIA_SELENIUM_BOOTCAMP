import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BranchLocatorPage extends BasePage {

    @FindBy(xpath = "//input[@id = 'q']")
    public WebElement searchLocationInputField;

    @FindBy(xpath = "//button[@id = 'search-button']")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@class = 'map-list-item']/a[@data-ga = 'List, Get Details - 15969']")
    public WebElement nearestBranch;

    @FindBy(xpath = "//a[@name = 'Show_Filters']")
    public WebElement filterDropDown;

    @FindBy(xpath = "//input[@data-filter= 'Drive-thru ATM']")
    public WebElement driveThruFilterOption;

    @FindBy(xpath = "//button[@class='apply-button js-apply-button js-close-details']")
    public WebElement applyFilterButton;

    @FindBy(xpath = "//div[@class = 'map-list-item']/a[@data-ga = 'List, Get Details - 110321']")
    public WebElement filteredLocation;



    public void expandFilterMenu(){
        safeClickOnElement(filterDropDown);
    }

    public void chooseDriveThroughFilterOption(){
        safeClickOnElement(driveThruFilterOption);
    }

    public void clickOnApplyFilterButton(){
        safeClickOnElement(applyFilterButton);
    }

    public String getTextFromBranchSearchResults(){
        return getTrimmedElementText(nearestBranch);
    }

    public String getTextFromBranchFilteredResults(){
        return getTrimmedElementText(filteredLocation);
    }

    public void enterZipCode(String zipCode){
        clearSendKeysToElement(searchLocationInputField, zipCode);
    }

    public void clickOnSearchButton(){
        safeClickOnElement(searchButton);
    }

    public BranchLocatorPage(){
        PageFactory.initElements(driver, this);
    }
}
