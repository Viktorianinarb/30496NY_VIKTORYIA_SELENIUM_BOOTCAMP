import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ChargesPage extends BasePage {

    @FindBy(xpath = "//h2[@data-analyticstrack = 'gridwall-product-name']")
    public List<WebElement> listOfChargers;

    @FindBy(xpath = "//button[@aria-label = 'Continue']")
    public WebElement continueButton;

    public ShoppingCartPage clickOnContinue(){
        safeClickOnElement(continueButton);
        return new ShoppingCartPage();
    }

    public void selectChargerFromTheList(int indexNum){
        safeClickOnElement(listOfChargers.get(indexNum));
    }

    public ChargesPage(){
        PageFactory.initElements(driver, this);
    }
}
