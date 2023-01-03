import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageMentoring extends BasePage {

    @FindBy(xpath = "//input[@id = 'gh-ac']")
    public WebElement searchInputField;

    @FindBy(xpath = "//a[@aria-label ='adidas ultra boost']")
    public WebElement searchOption;

    public SearchResultsMentoring pickSearchOption(){
        safeClickOnElement(searchOption);
        return new SearchResultsMentoring();
    }

    public void enterSearchTermIntoSearchField(String searchTerm){
        clearSendKeysToElement(searchInputField, searchTerm);
    }

    public HomepageMentoring(){
        PageFactory.initElements(driver, this);
    }
}
