import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//span[@aria-level = '3']")
    public List<WebElement> searchResultsList;

    public boolean getSearchResults(String searchTerm){
        boolean isFound = false;
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@aria-level = '3']")));
        for (WebElement element: searchResultsList){
            if(getTrimmedElementText(element).toLowerCase().contains(searchTerm)){
                isFound = true;
            }
        } return isFound;
    }
    public SearchResultsPage(){
        PageFactory.initElements(driver, this);
    }
}
