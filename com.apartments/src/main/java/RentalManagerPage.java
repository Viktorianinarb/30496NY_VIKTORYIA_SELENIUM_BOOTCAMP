import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RentalManagerPage extends BasePage {

    @FindBy(xpath = "//ul[@class = 'nav navbar-nav']/li[3]")
    public WebElement resourcesDropDown;

    @FindBy(xpath = "//a[contains(text(),'Resources Overview')]")
    public WebElement resourceOverviewLink;

    public void clickOnResourcesDropDown(){
        safeClickOnElement(resourcesDropDown);
    }

    public ResourcesPage clickOnResourceOverview(){

        safeClickOnElement(resourceOverviewLink);
        return new ResourcesPage();
    }

    public RentalManagerPage(){
        PageFactory.initElements(driver, this);
    }
}
