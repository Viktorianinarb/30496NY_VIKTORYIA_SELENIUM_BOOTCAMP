import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends BasePage {

    @FindBy(xpath = "//p[@id = 'Vipaa_Action_0']")
    public WebElement errorMessage;

    public LogInPage(){
        PageFactory.initElements(driver, this);
    }
}
