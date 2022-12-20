import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//h1[@class= 'entry-title']")
    public WebElement articleTitle;

    public String getSerachResultsTitle(){
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//h1[@class= 'entry-title']")));
        return getTrimmedElementText(articleTitle);
    }
    public SearchResultsPage(){
        PageFactory.initElements(driver, this);
    }
}
