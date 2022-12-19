import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolsPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(), 'Profit Calculator')]")
    public WebElement profitCalculatorLink;

    public ProfitCalculatorPage clickOnProfitCalculator(){
        safeClickOnElement(profitCalculatorLink);
        return new ProfitCalculatorPage();
    }
    public ToolsPage(){
        PageFactory.initElements(driver, this );
    }
}
