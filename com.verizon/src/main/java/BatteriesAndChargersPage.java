import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BatteriesAndChargersPage extends BasePage {

@FindBy(xpath = "//li[@class = 'u-marginBottom--4']//a[contains(text(), 'Chargers')]")
public WebElement chargersLink;

public ChargesPage clickOnChargers(){
    safeClickOnElement(chargersLink);
    return new ChargesPage();
}

    public BatteriesAndChargersPage(){
        PageFactory.initElements(driver,this);
    }
}
