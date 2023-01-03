import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Homepage extends BasePage {

    @FindBy(xpath = "//input[@id = 'gh-ac']")
    public WebElement searchInputField;

    @FindBy(xpath = "//ul[@id = 'ui-id-1']//li/a")
    public List<WebElement> listOfSearchItems;

    @FindBy(xpath = "//input[@id = 'gh-btn']")
    public WebElement searchButton;

    @FindBy(xpath ="//li[@data-currenttabindex = '5']")
    public WebElement linkToToys;

    public ToysPage getToysPage(){
        safeClickOnElement(linkToToys);
        return new ToysPage();
    }

    public SearchResultsPage clickOnSearchButton(){
        safeClickOnElement(searchButton);
        return new SearchResultsPage();
    }

    public void pickSearchItemFromDropDown() {
        for (WebElement element : listOfSearchItems) {
            webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@id = 'ui-id-1']//li/a")));
            if (element.getAttribute("aria-label") == "Women's Shoes") {
                safeClickOnElement(element);
            }else{
                System.out.println("No such thing found");
            }
        }
    }
//   public boolean isSearchResultCorrect(String searchzip) {
//        for (WebElement element : propertyList) {
//            if (getTrimmedElementText(element).contains(searchzip)) {
//
//            }
//        } return true;
//    }

    public void enterSearchCategory(String shoeName){
        clearSendKeysToElement(searchInputField, shoeName);
    }

    public Homepage(){
        PageFactory.initElements(driver, this);
    }
}
