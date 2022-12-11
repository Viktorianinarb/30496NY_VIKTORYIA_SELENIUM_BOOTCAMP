package page_objects;

import base.BasePage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreModelsPage extends BasePage {


    @FindBy (xpath = "//a[@class='cta-button theme-core byo-core-type variant-tile-cta cta-1']")
    public WebElement designLink;

    public void clickOnDesignLink(){
        safeClickOnElement(designLink);
    }

    public CoreModelsPage(){
        PageFactory.initElements(driver, this);
    }
}
