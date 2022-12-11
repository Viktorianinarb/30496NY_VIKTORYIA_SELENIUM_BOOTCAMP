package page_objects;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BasePage {

@FindBy (xpath = "//a[contains(text(),'Login')]")
public WebElement loginLink;

public LogInPage clickOnLoginLink(){
    safeClickOnElement(loginLink);
    return new LogInPage();
}

    public Homepage(){
        PageFactory.initElements(driver, this);
    }
}
