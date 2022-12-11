package page_objects;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentEstimatorResultPage extends BasePage {

    @FindBy(xpath = "//div[@class= 'pe-payment-options-card__lease sub-panel']/h4/span")
    public WebElement result;

    public PaymentEstimatorResultPage(){
        PageFactory.initElements(driver, this);
    }
}
