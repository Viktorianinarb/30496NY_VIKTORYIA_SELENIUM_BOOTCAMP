package page_objects;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewTaskPage extends BasePage {

    @FindBy(xpath = "//input[@name ='title']")
    public WebElement inputFieldTitle;

    @FindBy(xpath = "//button[@class ='ui small fluid positive toggle button']")
    public WebElement switchToPublicAccess;

    @FindBy(xpath = "//div[@class ='ui field']//label[contains(text(),'Assigned To')]")
    public WebElement assignToDropDown;


    @FindBy(xpath = "//div[@class = 'visible menu transition']//div[@role = 'option']")
    public WebElement assignToOption;

    public CreateNewTaskPage(){
        PageFactory.initElements(driver,this);
    }


}
