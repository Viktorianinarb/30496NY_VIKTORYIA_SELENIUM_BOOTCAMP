import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FinalResultPage extends BasePage {

    @FindBy(xpath = "//div[@class = 'item-action']//a[@data-action-name = 'ADDTOCART']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//span[contains(text(), 'Add to cart')]")
    public WebElement addtoCartVersionOne;

    @FindBy(xpath = "//a[@aria-label = 'Your shopping cart contains 1 item']")
    public WebElement itemInCart;

    public boolean isItemIncart(){
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[@aria-label = 'Your shopping cart contains 1 item']")));
        if(itemInCart.isDisplayed()){
            return true;
        } else {return false;
        }
    }

    public void addItemToCart(){
        switchToTab();

        if(addToCartButton.isDisplayed()) {
            safeClickOnElement(addToCartButton);
        } else {
            safeClickOnElement(addtoCartVersionOne);
        }
    }
    public FinalResultPage(){
        PageFactory.initElements(driver, this);
    }
}
