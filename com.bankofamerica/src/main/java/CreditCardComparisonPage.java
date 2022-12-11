import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreditCardComparisonPage extends BasePage {

    @FindBy(xpath = "//input[@id = 'compare-4060811~8V~en_US']")
    public WebElement firstCard;

    @FindBy(xpath = "//input[@id = 'compare-4060593~62~en_US']")
    public WebElement secondCard;

    @FindBy(xpath = "//a[@id = 'compare_cards']")
    public WebElement compareButton;

    public void selectFirstCard() {
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[@id = 'compare-4061200~9C~en_US']")));
        safeClickOnElement(firstCard);
    }

    public void selectSecondCard(){
        safeClickOnElement(secondCard);
    }

    public ComparisonResultPage clickOnCompareButton(){
        safeClickOnElement(compareButton);
        return new ComparisonResultPage();
    }

    public void chooseTwoCardsToCompare(){
        selectFirstCard();
        selectSecondCard();
        clickOnCompareButton();
    }



    public CreditCardComparisonPage(){
        PageFactory.initElements(driver, this);
    }
}
