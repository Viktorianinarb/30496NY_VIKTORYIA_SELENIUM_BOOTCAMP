import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ResourcesPage extends BasePage {

@FindBy(xpath = "/html/body/div[4]/main/div[2]/div/div[2]/div/div/div/div/div/div[2]/form/input[1]")
public WebElement searchArticleInputField;

@FindBy(xpath = "//*[@id=\"mainContentPlaceholder_C033_Col01\"]/div/div/div/div/div/div[2]/span/i")
public WebElement searchButton;

@FindBy(xpath = "/html/body/div[4]/main/div[2]/div/div[2]/div/div/div/div/div/div[2]/amp-selector/div[2]/div/div/amp-list/div[2]/div/div")
public WebElement chooseSearchTextFromDropDown;

public void inputSearchTermInSearchField(String searchTerm){
    clearSendKeysToElement(searchArticleInputField,searchTerm);
}

public ArticlePage clickOnSearchButton(){
    webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div/div/div/div/div/div[2]/amp-selector/div[2]/div/div/amp-list/div[2]/div/div")));
safeClickOnElement(chooseSearchTextFromDropDown);
return new ArticlePage();
}

//    public void selectFromSearchDropDown(){
//    selectFromDropdownByVisibleText(searchArticleInputField, "Who Is Responsible for Pest Control?");
//    }



    public ResourcesPage(){
        PageFactory.initElements(driver, this);
    }
}
