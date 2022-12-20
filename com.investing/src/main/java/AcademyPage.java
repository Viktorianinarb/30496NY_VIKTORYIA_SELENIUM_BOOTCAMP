import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AcademyPage extends BasePage {

    @FindBy(xpath = "//div[@class = 'search-bar']//input[@class = 'search-input']")
    public WebElement searchInputField;

    @FindBy(xpath = "//div[@class = 'search-bar']/button")
    public WebElement searchButton;

    @FindBy(xpath = "//a[@title= 'Candlestick Patterns Explained']")
    public WebElement searchOption;

    public SearchResultsPage clickOnSearchOption(){
        safeClickOnElement(searchOption);
        return new SearchResultsPage();
    }

    public void clickOnSearchButton(){
        safeClickOnElement(searchButton);
    }

    public void enterSearchTextIntoSearchField(String searchText){
        clearSendKeysToElement(searchInputField, searchText);
    }
    public AcademyPage(){
        PageFactory.initElements(driver, this);
    }
}
