package page_objects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CompanyInformationPage extends BasePage {

    @FindBy(xpath = "//button[@class = 'ui basic icon button custom-note-btn']")
            public WebElement addNoteButton;

    @FindBy(xpath = "//div[@class = 'note-text']//span")
    public WebElement noteMessage;

    @FindBy(xpath = "//i[@class = 'erase icon']")
    public WebElement eraseNoteButton;

    public void eraseNote(){
        if(eraseNoteButton.isDisplayed()){
            safeClickOnElement(eraseNoteButton);
        }
    }

    public AddNotePage clickOnAddNote(){
        safeClickOnElement(addNoteButton);
        return new AddNotePage();
    }



    public CompanyInformationPage(){
        PageFactory.initElements(driver,this);
    }
}
