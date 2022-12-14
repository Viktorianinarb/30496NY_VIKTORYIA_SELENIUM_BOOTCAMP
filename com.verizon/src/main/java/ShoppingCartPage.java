import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends BasePage {

    @FindBy(xpath = "//h3[@style= 'padding-left: 8px;']")
    public WebElement selectedCharger;

    public String getTextFromCartItem(){
        return getTrimmedElementText(selectedCharger);
    }

    public ShoppingCartPage(){
        PageFactory.initElements(driver, this);
    }
}
