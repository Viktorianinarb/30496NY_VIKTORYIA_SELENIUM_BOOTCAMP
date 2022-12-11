import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoLoanPage extends BasePage {

    @FindBy(xpath = "//a[@id = 'useAutoLoanCalculator']")
    public WebElement autoLoanCalculatorLink;

    public AutoLoanCalculatorPage openAutoLoanCalculatorPage(){
        safeClickOnElement(autoLoanCalculatorLink);
        return new AutoLoanCalculatorPage();
    }
    public AutoLoanPage(){
        PageFactory.initElements(driver,this);
    }
}
