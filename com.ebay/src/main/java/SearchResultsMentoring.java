import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultsMentoring extends BasePage {

    @FindBy(xpath = "//span[@aria-level='3']")
    public List<WebElement> searchResultList;

    public boolean getSearchResultText(String searchTerm){
        boolean isFound = false;
        for (WebElement element : searchResultList){
            if(getTrimmedElementText(element).toLowerCase().contains(searchTerm)){
                isFound = true;
            }
        } return isFound;
    }

    public SearchResultsMentoring(){
        PageFactory.initElements(driver, this);
    }
}
