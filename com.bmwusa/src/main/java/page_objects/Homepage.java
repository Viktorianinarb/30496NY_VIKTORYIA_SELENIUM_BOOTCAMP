package page_objects;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BasePage {

    @FindBy (xpath = "//button[@class = 'globalnav-primary-location-bar__set-location label-2--bold']")
    public WebElement chooseYourLocalBmwCenterButton;

    @FindBy (xpath = "//a[@class= 'globalnav-primary-my-bmw__portal-link label-2--bold']")
    public WebElement myBmwButton;

    @FindBy (xpath = "//*[@class = 'globalnav-primary__main-links ']/a")
    public WebElement buildCarLink;

    @FindBy(xpath = "//button[@analytics-event= 'topnav-offers-finance.menu.offers-and-finance.link']")
    public WebElement shoppingButton;

    public ShoppingPage clickOnShoppingButton(){
        safeClickOnElement(shoppingButton);
        return new ShoppingPage();
    }

    public BuildYourOwnPage clickOnBuildCarButton(){
        safeClickOnElement(buildCarLink);
        return new BuildYourOwnPage();
    }

    public DealerMapPage clickOnYourLocalCenterButton() {
        safeClickOnElement(chooseYourLocalBmwCenterButton);
        return new DealerMapPage();
    }

    public void clickOnMyBMW() {
        safeClickOnElement(myBmwButton);
    }

    public Homepage(){
        PageFactory.initElements(driver, this);
    }

}
