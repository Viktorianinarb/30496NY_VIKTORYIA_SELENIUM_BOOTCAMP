import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserAccountPage extends BasePage {

    @FindBy(xpath = "//div[@class = 'username']//button[@class = 'btn btn-md btn-text']/span")
    public WebElement userNameShown;

    @FindBy(xpath = "//div[@id = 'username']")
    public WebElement userLogOutDropDown;

    @FindBy(xpath = "//a[@id = 'headerSignOut']")
    public WebElement logOutLink;

    public void clickOnDropDownLogOut(){
        hoverOverElement(userLogOutDropDown);
        safeClickOnElement(logOutLink);
    }

    public UserAccountPage(){
        PageFactory.initElements(driver,this);
    }

}
