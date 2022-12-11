package page_objects;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPage extends BasePage {

    @FindBy(xpath = "//a[@tab-index= '5']")
    public WebElement linkToPaymentEstimator;

    public PaymentEstimationPage openPaymentEstimator(){
        safeClickOnElement(linkToPaymentEstimator);
        return new PaymentEstimationPage();
    }
    public ShoppingPage(){
        PageFactory.initElements(driver,this);
    }
}
