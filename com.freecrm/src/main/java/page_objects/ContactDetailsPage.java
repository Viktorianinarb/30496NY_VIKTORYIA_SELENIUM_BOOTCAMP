package page_objects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactDetailsPage extends BasePage {

    @FindBy(xpath = "//div[@class='ui header item mb5 light-black']")
    public WebElement contactPageName;

    public ContactDetailsPage(){
        PageFactory.initElements(driver, this);
    }

   public String getTextFromHeaderName(){
       webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='ui header item mb5 light-black']")));
       String actualtext = contactPageName.getText();
       return actualtext;

   }
}
