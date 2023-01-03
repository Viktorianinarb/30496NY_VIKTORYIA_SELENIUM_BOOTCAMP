import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ToysPage extends BasePage {

    @FindBy(xpath = "//div[contains(text(),'Dolls & Teddy Bears')]")
    public WebElement dollsSection;

    @FindBy(xpath = "//div[contains(text(),'Barbie Contemporary Dolls')]")
    public WebElement barbieSection;

    @FindBy(xpath = "//li[@class = 's-item s-item--large']//a[@class = 's-item__link']")
    public List<WebElement> linksToSearchResults;



    public FinalResultPage goToFirstSearchResult(int i) {
        safeClickOnElement(linksToSearchResults.get(i));
        return new FinalResultPage();
    }


    public void goToBarbieSection(){
        safeClickOnElement(barbieSection);
    }

    public void clickOnDollsCategory(){
        safeClickOnElement(dollsSection);
    }

    public ToysPage(){
        PageFactory.initElements(driver, this);
    }
}
