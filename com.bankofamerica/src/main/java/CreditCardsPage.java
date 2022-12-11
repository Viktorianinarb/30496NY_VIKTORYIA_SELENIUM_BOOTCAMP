import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreditCardsPage extends BasePage {

    @FindBy(xpath = "//a[@id = 'btnCompareCreditCards']")
    public WebElement linkToCreditCardComparisonPage;

    public CreditCardComparisonPage getRedirectedToCreditCardComparison(){
        safeClickOnElement(linkToCreditCardComparisonPage);
        return new CreditCardComparisonPage();
    }
    public CreditCardsPage(){
        PageFactory.initElements(driver, this);
    }
}
