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
//        public void clickOnMenuChoiceSelectionLinks(String link){
//            for(WebElement element : menuChoiceSelectionLinks){
//                if(getTrimmedElementText(element).equals(link)){
//                    safeClickOnElement(element);
//                    break;
//                }
//            }
//        }


    public SearchPropertyResultPage() {
            PageFactory.initElements(driver, this);
        }
    }

