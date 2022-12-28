import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPropertyResultPage extends BasePage {

    @FindBy(xpath = "//li[@class = 'mortar-wrapper']")
    public List<WebElement> propertyList;

    public boolean isSearchResultCorrect(String searchzip) {
        for (WebElement element : propertyList) {
            if (getTrimmedElementText(element).contains(searchzip)) {

            }
        } return true;
    }



    public SearchPropertyResultPage() {
            PageFactory.initElements(driver, this);
        }
    }

